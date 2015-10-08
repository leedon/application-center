package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.OperationLogMapper
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class OperationLogService {

  @Resource
  private[this] val operationLogMapper: OperationLogMapper = _

}
