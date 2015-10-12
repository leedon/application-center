package io.github.rollenholt.application.center.base.controller

import javax.annotation.Resource

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.ApplicationAcl
import io.github.rollenholt.application.center.base.service.ApplicationAclService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, ResponseBody, RequestMethod, RequestMapping}

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center/acl"))
class ApplicationAclController {

  @Resource
  private[this] val applicationAclService: ApplicationAclService = null

  @RequestMapping(value = Array("/query/{applicationCode}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def queryByApplicationCode(@PathVariable("applicationCode")applicationCode: String): JsonV2[Array[ApplicationAcl]] = {
    val acls: Array[ApplicationAcl] = applicationAclService.queryByApplicationCode(applicationCode)
    new JsonV2[Array[ApplicationAcl]](0, "ok", acls)
  }


  @RequestMapping(value = Array("/create"), method = Array(RequestMethod.POST))
  @ResponseBody
  def createAcl(applicationAcl: ApplicationAcl): JsonV2[Int] = {
    require(applicationAcl != null)
    applicationAclService.createApplicationAcl(applicationAcl)
    new JsonV2[Int](0, "ok", applicationAcl.id)
  }

}
