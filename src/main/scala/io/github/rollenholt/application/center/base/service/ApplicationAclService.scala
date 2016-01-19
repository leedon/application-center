package io.github.rollenholt.application.center.base.service

import java.util
import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationAclMapper
import io.github.rollenholt.application.center.base.model.ApplicationAcl
import org.springframework.stereotype.Service
import scala.collection.JavaConversions._

/**
  * @author rollenholt
  */
@Service
class ApplicationAclService {

  @Resource
  private[this] val applicationAclMapper: ApplicationAclMapper = null

  def queryByApplicationCode(applicationCode: String): Array[ApplicationAcl] = {
    return applicationAclMapper.queryByApplicationCode(applicationCode)
  }

  def createApplicationAcl(applicationAcl: ApplicationAcl): Int = {
    require(applicationAcl != null)
    applicationAclMapper.createApplicationAcl(applicationAcl)
  }

  def modifyApplicationAcl(applicationAcl: ApplicationAcl): Int = {
    require(applicationAcl != null)
    applicationAclMapper.modifyApplicationAcl(applicationAcl)
  }
}
