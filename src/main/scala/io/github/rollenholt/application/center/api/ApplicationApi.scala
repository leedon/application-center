package io.github.rollenholt.application.center.api

import java.util.Date
import javax.annotation.Resource

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.{Application, ApplicationState, ApplicationVo}
import io.github.rollenholt.application.center.base.service.ApplicationService
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Controller
import org.springframework.validation.annotation.Validated
import org.springframework.validation.{BindingResult, ObjectError}
import org.springframework.web.bind.annotation._

import scala.collection.JavaConversions._
import scala.collection.mutable

/**
 * @author rollenholt 
 */
@Controller
@RequestMapping(value = Array("/api/application"))
class ApplicationApi {

  @Resource
  private[this] val applicationService: ApplicationService = null

  private[this] val logger: Logger = LoggerFactory.getLogger(classOf[ApplicationApi])


  @RequestMapping(value = Array("/create"), method = Array(RequestMethod.POST))
  @ResponseBody
  def createApplication(@Validated application: ApplicationVo, bindingResult: BindingResult): JsonV2[String] = {
    logger.debug("接收到参数：{}", application)
    if (bindingResult.hasErrors) {
      val errors: mutable.Buffer[String] = bindingResult.getAllErrors.map((error: ObjectError) => {
        error.getCode
      })
      new JsonV2(-1, "argument error", errors)
    }

    //init some property
    application.creator = "system"
    application.createTime = new Date()
    application.state = ApplicationState.Unreviewed.id

    applicationService.createApplication(application)
    new JsonV2(0, "ok", application.code)
  }

  @RequestMapping(value = Array("/detail/{applicationCode}"), method = Array(RequestMethod.GET))
  @ResponseBody
  def applicationDetail(@PathVariable("applicationCode") applicationCode: String): JsonV2[ApplicationVo] = {
    logger.info("接收到参数:{}", applicationCode)
    val application:Application = applicationService.queryApplicationDetail(applicationCode)
    val applicationVo: ApplicationVo = Application.toApplicationVo(application)
    new JsonV2[ApplicationVo](0, "查询应用信息成功", applicationVo)
  }

  @RequestMapping(value = Array("/modify"), method = Array(RequestMethod.POST))
  @ResponseBody
  def modifyApplication(@Validated application: ApplicationVo, bindingResult: BindingResult): JsonV2[String] = {
    logger.info("接收到参数：{}", application)
    if (bindingResult.hasErrors) {
      val errors: mutable.Buffer[String] = bindingResult.getAllErrors.map((error: ObjectError) => {
        error.getCode
      })
      new JsonV2(-1, "argument error", errors)
    }
    applicationService.modifyApplication(application)
    new JsonV2(0, "ok", application.code)
  }


  @RequestMapping(value = Array("/list"), method = Array(RequestMethod.GET))
  @ResponseBody
  def applicationList() = {
    val applicationVoes: Array[ApplicationVo] = applicationService.list()
    new JsonV2[Array[ApplicationVo]](0, "获取应用列表成功", applicationVoes)
  }

}
