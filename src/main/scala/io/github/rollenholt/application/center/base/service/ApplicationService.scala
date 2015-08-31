package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationDao
import io.github.rollenholt.application.center.base.model.Application
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationService {

  @Resource
  private[this] val applicationDao:ApplicationDao = null

  def createApplication(application:Application):Int = {
    0
  }

  def modifyApplication(application: Application):Int = {
    0
  }

  def approveApply(application: Application):Int = {
    0
  }

}
