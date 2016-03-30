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
  @BeanProperty var teamId: String = _
  @BeanProperty var creator: String = _
  @BeanProperty var createTime: Date = _
  @BeanProperty var state: Int = 0
  @BeanProperty var emailGroup: String = _
}

object Application {

  def fromApplicationVo(vo: ApplicationVo): Application = {
    val application: Application = new Application()
    application.name = vo.name
    application.teamId = vo.teamId
    application.creator = vo.creator
    application.createTime = vo.createTime
    application.state = vo.state
    application.emailGroup = vo.emailGroup
    application
  }

  def toApplicationVo(application: Application): ApplicationVo = {
    val vo: ApplicationVo = new ApplicationVo()
    vo.name = application.name
    vo.teamId = application.teamId
    vo.creator = application.creator
    vo.createTime = application.createTime
    vo.state = application.state
    vo.emailGroup = application.emailGroup
    vo
  }
}
