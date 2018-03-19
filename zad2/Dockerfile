FROM openjdk:8
MAINTAINER Darek Stępień

RUN apt-get update
RUN apt-get -y upgrade

RUN apt-get -y install wget
RUN apt-get -y install unzip
RUN apt-get install apt-transport-https -y
RUN apt-get install scala -y

RUN DEBIAN_FRONTEND=noninteractive apt-get -y install mysql-client mysql-server 

RUN curl -L -o sbt-1.1.1.deb https://dl.bintray.com/sbt/debian/sbt-1.1.1.deb 
RUN  dpkg -i sbt-1.1.1.deb
RUN  rm sbt-1.1.1.deb 
RUN  apt-get update 
RUN apt-get install sbt -y

RUN mkdir /zad
WORKDIR /zad

COPY ./build.sbt ./
RUN sbt update


CMD sbt console
