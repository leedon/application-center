package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationMapper
import io.github.rollenholt.application.center.base.model.{Application, ApplicationVo}
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationService {

  @Resource
  private[this] val applicationDao:ApplicationMapper = null

  def createApplication(application:ApplicationVo):Int = {
    0
  }

  def modifyApplication(application: ApplicationVo):Int = {
    0
  }

  def approveApply(application: ApplicationVo):Int = {
    0
  }

  def test() = {
    val application: Application = applicationDao.findById(1)
    println(application)
  }

}
