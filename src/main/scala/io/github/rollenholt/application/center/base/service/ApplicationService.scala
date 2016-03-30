package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import com.google.common.base.Strings
import io.github.rollenholt.application.center.base.dao.ApplicationMapper
import io.github.rollenholt.application.center.base.model.{Application, ApplicationVo}
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * @author rollenholt
  */
@Service
class ApplicationService {

  @Resource
  private[this] val applicationDao: ApplicationMapper = null

  private[this] val logger: Logger = LoggerFactory.getLogger(classOf[ApplicationService])

  @Transactional
  def createApplication(vo: ApplicationVo): Int = {
    val application: Application = Application.fromApplicationVo(vo)
    applicationDao.createApplication(application)
    if (!Strings.isNullOrEmpty(vo.developers)) {
      val developers: Array[String] = vo.developers.split(",")
      applicationDao.saveApplicationDeveloper(application, developers)
    }
    application.id
  }

  @Transactional
  def modifyApplication(vo: ApplicationVo): Int = {
    val application: Application = Application.fromApplicationVo(vo)
    applicationDao.modifyApplication(application)
    applicationDao.deleteApplicationDeveloper(vo.getId)
    if (!Strings.isNullOrEmpty(vo.developers)) {
      val developers: Array[String] = vo.developers.split(",")
      applicationDao.saveApplicationDeveloper(application, developers)
    }
    vo.id
  }

  def queryApplicationDetail(applicationCode: Int): Application = {
    applicationDao.queryByApplicationCode(applicationCode)
  }

  def list(): Array[ApplicationVo] = {
    applicationDao.list()
  }

}
