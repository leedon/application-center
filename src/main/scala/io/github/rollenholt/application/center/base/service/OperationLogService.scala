package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.OperationLogMapper
import io.github.rollenholt.application.center.base.model.OperationLog
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class OperationLogService {

  @Resource
  private[this] val operationLogMapper: OperationLogMapper = null

  def queryByApplicationCode(applicationCode: String): Array[OperationLog] =
    operationLogMapper.queryByApplicationCode(applicationCode)

  def saveOperationLog(operationLog: OperationLog): Int =
    operationLogMapper.saveOperationLog(operationLog)

}
