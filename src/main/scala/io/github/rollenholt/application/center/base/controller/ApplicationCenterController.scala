package io.github.rollenholt.application.center.base.controller

import javax.annotation.Resource
import javax.validation.Valid

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.Application
import io.github.rollenholt.application.center.base.service.ApplicationService
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Controller
import org.springframework.validation.{BindingResult, ObjectError}
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, ResponseBody}

import scala.collection.JavaConversions._
import scala.collection.mutable

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center"))
class ApplicationCenterController {

  private[this] val logger:Logger = LoggerFactory.getLogger(classOf[ApplicationCenterController])

  @Resource
  private[this] val applicationService: ApplicationService = null

  @RequestMapping(value = Array("/create"), method = Array(RequestMethod.POST))
  @ResponseBody
  def createApplication(@Valid application: Application, bindingResult: BindingResult): JsonV2[String] = {
    if(bindingResult.hasErrors) {
      val errors: mutable.Buffer[String] = bindingResult.getAllErrors.map((error: ObjectError) => {
        error.getCode
      })
      new JsonV2(-1, "argument error", errors)
    }
    applicationService.createApplication(application)
    new JsonV2(0, "ok", application.code)
  }

  @RequestMapping(value = Array("/modify"), method = Array(RequestMethod.POST))
  @ResponseBody
  def modifyApplication(@Valid application: Application, bindingResult: BindingResult): JsonV2[String] = {
    if(bindingResult.hasErrors) {
      val errors: mutable.Buffer[String] = bindingResult.getAllErrors.map((error: ObjectError) => {
        error.getCode
      })
      new JsonV2(-1, "argument error", errors)
    }
    applicationService.modifyApplication(application)
    new JsonV2(0, "ok", application.code)
  }

  @RequestMapping(value = Array("/approve/{applicationId}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def approveApply(@PathVariable("applicationId") applicationId: Int): JsonV2[String] = {
    new JsonV2(0, "ok", "asdas")

  }



}
