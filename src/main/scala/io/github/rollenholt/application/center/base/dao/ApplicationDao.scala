package io.github.rollenholt.application.center.base.dao

import java.util.Date

import io.github.rollenholt.application.center.base.model.{Application, ApplicationVo}
import org.springframework.stereotype.Repository
import slick.driver.MySQLDriver.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration


/**
 * @author rollenholt 
 */
@Repository
class ApplicationDao extends DataBaseComponent {

  class Applications(tag: Tag) extends Table[Application](tag, "application") {
    def id = column[Int]("id", O.PrimaryKey)
    def name = column[String]("name")
    def code = column[String]("code")
    def teamCode = column[String]("team_code")
    def creator = column[String]("creator")
    def createTime = column[Date]("create_time")
    def state = column[Int]("state")
    def emailGroup = column[String]("email_group")
    def * = (id.?, name, code, teamCode, creator, createTime, state, emailGroup) <> (Application.tupled, Application.unapply)
  }

  val applications = TableQuery[Applications]

  def insert(application: Application): Future[Int] = {
    db.run(applications += application)
  }

  def queryById(id: Int): Future[Application] = {
    db.run(applications.filter(_.id === id).result.head)
  }

  def modifyApplicationByCode(application: ApplicationVo): Int = ???

  def createApplication(application: ApplicationVo): Int = ???

}

object ApplicationDao {
  def main(args: Array[String]) {
    val dao: ApplicationDao = new ApplicationDao()
//    val application: Application = Application(Some(4), "name4", "applicationCode4", "teamCode4", "rollenholt", new Date(), 1, "wenchao.ren@outlook.com")
//    val insert: Future[Int] = dao.insert(application)
    val queryById: Future[Application] = dao.queryById(1)
    val result: Application = Await.result(queryById, Duration.Inf)
    println(result)
  }
}
