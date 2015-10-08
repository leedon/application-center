package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.OperationLog

/**
 * @author rollenholt 
 */
trait OperationLogMapper {

  def queryByApplicationCode(applicationCode: String): Array[OperationLog]

  def saveOperationLog(operationLog: OperationLog): Int

}
