package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty


/**
 * @author rollenholt 
 */
case class ApplicationVo() extends Serializable {

  @BeanProperty var name: String = _
  @BeanProperty var code: String = _
  @BeanProperty var developers: String = _
  @BeanProperty var emailGroup: String = _


  override def toString = s"ApplicationVo($name, $code, $developers, $emailGroup)"
}