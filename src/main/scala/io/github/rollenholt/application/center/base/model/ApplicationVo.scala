package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty


/**
  * @author rollenholt
  */
case class ApplicationVo() extends Serializable {
  @BeanProperty var id: Int = 0
  @BeanProperty var name: String = _
  @BeanProperty var creator: String = _
  @BeanProperty var teamId: String = _
  @BeanProperty var teamName: String = _
  @BeanProperty var createTime: Date = _
  @BeanProperty var emailGroup: String = _
  @BeanProperty var state: Int = 0
  @BeanProperty var stateName: String = _
  @BeanProperty var developers: String = _
}