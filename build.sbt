organization := "ren.wenchao"

name := "application-center"

version := "1.1.2-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.2.5.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-jdbc" % "1.2.5.RELEASE",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper" % "8.0.28",
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "javax.servlet" % "jstl" % "1.2",
  "io.github.rollenholt" % "Pear" % "1.0.4",
  "org.mybatis" % "mybatis" % "3.3.0",
  "org.mybatis" % "mybatis-spring" % "1.2.3",
  "c3p0" % "c3p0" % "0.9.1.2",
  "mysql" % "mysql-connector-java" % "5.1.36",
  "cglib" % "cglib-nodep" % "3.2.0",
  "org.aspectj" % "aspectjweaver" % "1.8.7"

)
    