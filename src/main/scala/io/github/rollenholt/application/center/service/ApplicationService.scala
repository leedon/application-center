package io.github.rollenholt.application.center.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.dao.ApplicationDao
import io.github.rollenholt.application.center.model.Application
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
