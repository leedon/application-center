package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.{Application, ApplicationVo}

/**
  * @author rollenholt
  */
trait ApplicationMapper  extends Mapper{

  def list(): Array[ApplicationVo]

  def createApplication(application: Application): Int

  def modifyApplication(application: Application): Int

  def approveApply(applicationCode: String, state: Int): Int

  def queryByApplicationCode(applicationCode: String): Application

  def findById(id: Int): Application
}