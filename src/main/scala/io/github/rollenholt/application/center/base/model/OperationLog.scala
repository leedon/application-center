package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty


/**
 * @author rollenholt 
 */
@SerialVersionUID(1L)
class OperationLog() extends Serializable {

  @BeanProperty var id: Int = 0
  @BeanProperty var applicationCode: String = _
  @BeanProperty var operator: String = _
  @BeanProperty var operateTime: Date = _
  @BeanProperty var detail: String = _


  override def toString = s"OperationLog(id=$id, applicationCode=$applicationCode," +
    s" operator=$operator, operateTime=$operateTime, detail=$detail)"
}
