package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationDao
import io.github.rollenholt.application.center.base.model.ApplicationVo
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{PropertySource, Import}
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationService {


  @Resource
  private[this] val applicationDao:ApplicationDao = null

  def createApplication(application:ApplicationVo):Int = {
    require(application != null)
    applicationDao.createApplication(application)
  }

  def modifyApplication(application: ApplicationVo):Int = {
    require(application != null)
    require(application.getCode != null)
    applicationDao.modifyApplicationByCode(application);
  }

  def approveApply(application: ApplicationVo):Int = {
    0
  }

}
