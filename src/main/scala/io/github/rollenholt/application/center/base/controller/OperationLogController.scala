package io.github.rollenholt.application.center.base.controller

import javax.annotation.Resource

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.OperationLog
import io.github.rollenholt.application.center.base.service.OperationLogService
import org.slf4j.{LoggerFactory, Logger}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, ResponseBody, RequestMapping, RequestMethod}

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center/log"))
class OperationLogController {

  private[this] val logger: Logger = LoggerFactory.getLogger(classOf[OperationLogController])

  @Resource
  private[this] val operationLogService: OperationLogService = null

  @RequestMapping(value = Array("/query/{applicationCode}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def queryByApplicationCode(@PathVariable("applicationCode") applicationCode: String): JsonV2[Array[OperationLog]] = {
    val operationLogs: Array[OperationLog] = operationLogService.queryByApplicationCode(applicationCode)
    new JsonV2[Array[OperationLog]](0, "ok", operationLogs)
  }

  @RequestMapping(value = Array("/save"), method = Array(RequestMethod.GET))
  def save(operationLog: OperationLog): JsonV2[Int] = {
    require(operationLog != null)
    operationLogService.saveOperationLog(operationLog)
    new JsonV2[Int](0, "ok", operationLog.id)
  }

}
