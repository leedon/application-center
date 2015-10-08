package io.github.rollenholt.application.center.base.controller

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.ApplicationServerInfo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMethod, ResponseBody, RequestMapping}

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center/server"))
class ApplicationServerController {


  @RequestMapping(value = Array("/query"), method = Array(RequestMethod.GET))
  @ResponseBody
  def queryApplicationServerInfo(applicationCode: String): JsonV2[Array[ApplicationServerInfo]] = {

    new JsonV2[Array[ApplicationServerInfo]](0, "ok", null)
  }

}
