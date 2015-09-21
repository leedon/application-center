package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.ApplicationVo
import org.springframework.stereotype.Repository

/**
 * @author rollenholt 
 */
@Repository
trait ApplicationDao {

  def modifyApplicationByCode(application: ApplicationVo): Int = ???

  def createApplication(application: ApplicationVo): Int = ???

}
