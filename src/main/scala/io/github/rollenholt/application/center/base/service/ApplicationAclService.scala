package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.ApplicationAclMapper
import io.github.rollenholt.application.center.base.model.ApplicationAcl
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationAclService {

  @Resource
  private[this] val applicationAclMapper: ApplicationAclMapper = _

  def queryByApplicationCode(applicationCode: String): Array[ApplicationAcl] = {
    null
  }


}
