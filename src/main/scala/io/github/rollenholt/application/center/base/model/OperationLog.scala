package io.github.rollenholt.application.center.base.model

import java.util.Date

import com.fasterxml.jackson.databind.BeanProperty

/**
 * @author rollenholt 
 */
@SerialVersionUID(1L)
class OperationLog() extends Serializable {

  @BeanProperty var id: Int = 0
  @BeanProperty var operator: String = _
  @BeanProperty var operateTime: Date = _
  @BeanProperty var detail: String = _

  override def toString = s"OperationLog(id=$id, operator=$operator, operateTime=$operateTime, detail=$detail)"
}
