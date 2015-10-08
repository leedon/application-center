package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.ApplicationAcl

/**
 * @author rollenholt 
 */
trait ApplicationAclMapper {

  def queryByApplicationCode(applicationCode: String): Array[ApplicationAcl]

  def createApplicationAcl(applicationAcl: ApplicationAcl): Int

  def modifyApplicationAcl(applicationAcl: ApplicationAcl): Int

}
