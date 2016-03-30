package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.{Application, ApplicationVo}
import org.apache.ibatis.annotations.Param

/**
  * @author rollenholt
  */
trait ApplicationMapper extends Mapper {

  def deleteApplicationDeveloper(id: Int)


  def saveApplicationDeveloper(@Param("application") application: Application,
                               @Param("developers") developers: Array[String]): Int

  def list(): Array[ApplicationVo]

  def createApplication(application: Application): Int

  def modifyApplication(application: Application): Int

  def approveApply(applicationId: Int, state: Int): Int

  def queryByApplicationCode(applicationCode: Int): Application

  def findById(id: Int): Application
}