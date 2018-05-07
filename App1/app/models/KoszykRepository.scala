package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class KoszykRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, val userRepository: UserRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  import userRepository.UserTable
  private val prod = TableQuery[UserTable]

   class KoszykTable(tag: Tag) extends Table[Koszyk](tag, "koszyk") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def user = column[Int]("user")


    def user_fk = foreignKey("user_fk",user,prod)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, user) <> ((Koszyk.apply _).tupled, Koszyk.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */




   private val koaszyk = TableQuery[KoszykTable]


  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(user: Int): Future[Koszyk] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (koaszyk.map(p => (p.user))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning koaszyk.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((user),id) => Koszyk(id,user)}
      // And finally, insert the person into the database
      ) += user
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Koszyk]] = db.run {
    koaszyk.result
  }
}
