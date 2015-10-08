package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty

/**
 * @author rollenholt 
 */
@SerialVersionUID(1L)
case class Application() extends Serializable {

  @BeanProperty var id: Int = 0
  @BeanProperty var name: String = _
  @BeanProperty var code: String = _
  @BeanProperty var teamCode: String = _
  @BeanProperty var creator: String = _
  @BeanProperty var createTime: Date = _
  @BeanProperty var state: Int = 0
  @BeanProperty var emailGroup: String = _
  @BeanProperty var developers: String = _


  override def toString = s"Application($id, $name, $code, $teamCode, $creator, $createTime, $state, $emailGroup, $developers)"
}

object Application {

  def fromApplicationVo(vo: ApplicationVo): Application = {
    val application: Application = new Application()
    application.name = vo.name
    application.code = vo.code
    application.teamCode = vo.teamCode
    application.creator = vo.creator
    application.createTime = vo.createTime
    application.state = ApplicationState.Unreviewed.id
    application.emailGroup = vo.emailGroup
    application.developers = vo.developers
    application
  }

  def toApplicationVo(application: Application): ApplicationVo = {
    val vo: ApplicationVo = new ApplicationVo()
    vo.name = application.name
    vo.code = application.code
    vo.teamCode = application.teamCode
    vo.creator = application.creator
    vo.createTime = application.createTime
    vo.state = application.state
    vo.developers = application.developers
    vo.emailGroup = application.emailGroup
    vo
  }
}

object ApplicationState extends Enumeration {
  type ApplicationState = Value
  val Unreviewed, Reviewed, Rejected = Value
}