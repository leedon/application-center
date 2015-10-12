package io.github.rollenholt.application.center.base.controller

import javax.annotation.Resource

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.ApplicationServerInfo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, RequestMethod, ResponseBody, RequestMapping}

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center/server"))
class ApplicationServerController {

  @Resource
  private[this] val applicationServerService: ApplicationServerService = null

  @RequestMapping(value = Array("/query/{applicationCode}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def queryApplicationServerInfo(@PathVariable("applicationCode") applicationCode: String): JsonV2[Array[ApplicationServerInfo]] = {
    val serverInfos: List[ApplicationServerInfo] = applicationServerService.queryApplicationServerInfo(applicationCode)
    new JsonV2[Array[ApplicationServerInfo]](0, "ok", serverInfos.toArray)
  }

}
