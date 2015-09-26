package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationMapper
import io.github.rollenholt.application.center.base.model.{ApplicationState, Application, ApplicationVo}
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationService {

  @Resource
  private[this] val applicationDao: ApplicationMapper = null

  def createApplication(vo: ApplicationVo): Int = {
    val application: Application = Application.fromApplicationVo(vo)
    applicationDao.createApplication(application)
  }

  def modifyApplication(vo: ApplicationVo): Int = {
    val application: Application = Application.fromApplicationVo(vo)
    applicationDao.modifyApplication(application)
  }

  def approveApply(vo: ApplicationVo): Int = {
    val applicationCode: String = vo.getCode
    applicationDao.approveApply(applicationCode, ApplicationState.Reviewed.id)
  }

  def list(): List[ApplicationVo] = {
    val applicationList: List[Application] = applicationDao.list()
    applicationList.map((item: Application) => {
      Application.toApplicationVo(item)
    })
  }

  def test() = {
    val application: Application = applicationDao.findById(1)
    println(application)
  }

}
