# --- !Ups

create table "category" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "description" text not null,
  "kayword" varchar not null,
  category int not null,
  foreign key(category) references category(id)
);
CREATE TABLE "uzytkownik" (
  "id" integer not null primary key autoincrement,
  "fullNam" varchar not null
);
create table "koszyk" (
  "id" integer not null primary key autoincrement,
  "user" integer not null,
  foreign key(user) references User(id)
);
create table "koszykprod" (
  "id" integer not null primary key autoincrement,
  "koszyk" integer not null,
  "product" integer not null,
  "liczba" integer not null,
  foreign key(koszyk) references Koszyk(id),
  foreign key(product) references product(id)
);
create table "opinia" (
  "id" integer not null primary key autoincrement,
  "product" integer not null,
  "opin" text not null,
  foreign key(product) references product(id)
);
create table "zamowienie" (
  "Za_id" integer not null primary key autoincrement,
  "koszyk" integer not null,
  "dataZam" varchar not null,
  "address" varchar not null,
  "wartosc" float not null,
  foreign key(koszyk) references Koszyk(id)
);



# --- !Downs

drop table if exists "product" ;
drop table if exists "category" ;
drop table if exists "uzytkownik" ;
drop table if exists "koszyk" ;
drop table if exists "koszykprod" ;
drop table if exists "opinia" ;
drop table if exists "zamowienie" ;