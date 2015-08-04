package io.github.rollenholt.application.center.controller

import javax.annotation.Resource
import javax.validation.Valid

import io.github.rollenholt.application.center.model.Application
import io.github.rollenholt.application.center.service.ApplicationService
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.{PathVariable, RequestMethod, ResponseBody, RequestMapping}

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/application/center"))
class ApplicationCenterController {

  @Resource
  private[this] val applicationService: ApplicationService = null

  @RequestMapping(value = Array("/create"), method = Array(RequestMethod.POST))
  @ResponseBody
  def createApplication(@Valid application: Application, bindingResult: BindingResult): Unit = {

  }

  @RequestMapping(value = Array("/modify"), method = Array(RequestMethod.POST))
  @ResponseBody
  def modifyApplication(@Valid application: Application, bindingResult: BindingResult): Unit = {

  }

  @RequestMapping(value = Array("/approve/{applicationId}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def approveApply(@PathVariable("applicationId") applicationId: Int): Unit = {

  }

}
