package io.github.rollenholt.application.center.base.controller

import io.github.rollenholt.application.center.base.model.ApplicationServerInfo
import io.github.rollenholt.application.center.forTest.ApplicationServerInfoGenerator
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationServerService {

  //TODO queryApplicationServerInfo
  def queryApplicationServerInfo(applicationCode: String): List[ApplicationServerInfo] = {
    ApplicationServerInfoGenerator.generate()
  }

}
