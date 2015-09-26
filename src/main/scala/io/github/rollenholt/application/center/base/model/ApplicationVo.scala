package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty


/**
 * @author rollenholt 
 */
case class ApplicationVo() extends Serializable {

  @BeanProperty var name: String = _
  @BeanProperty var code: String = _
  @BeanProperty var creator: String = _
  @BeanProperty var teamCode: String = _
  @BeanProperty var createTime:Date = _
  @BeanProperty var developers: String = _
  @BeanProperty var emailGroup: String = _
  @BeanProperty var state:Int = 0

}