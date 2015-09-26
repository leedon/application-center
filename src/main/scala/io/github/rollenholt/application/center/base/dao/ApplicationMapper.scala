package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.Application

/**
 * @author rollenholt 
 */
trait ApplicationMapper {

  def list():List[Application]

  def createApplication(application: Application): Int

  def modifyApplication(application: Application): Int

  def approveApply(applicationCode: String, id: Int): Int = ???

  def findById(id: Int): Application
}
