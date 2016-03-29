package io.github.rollenholt.application.center.base.model

import scala.beans.BeanProperty

/**
  * @author rollenholt 
  */
@SerialVersionUID(1L)
case class Department() extends Serializable {
  @BeanProperty var id: Int = 0
  @BeanProperty var name: String = _
  @BeanProperty var code: String = _
}
