package io.github.rollenholt.application.center.forTest

import io.github.rollenholt.application.center.base.model.ApplicationServerInfo

/**
 * @author rollenholt 
 */
object ApplicationServerInfoGenerator {

  def generate(): List[ApplicationServerInfo] ={
    val serverInfo: ApplicationServerInfo = new ApplicationServerInfo()
    serverInfo.setEnvironmentType("dev")
    serverInfo.setServerIp("127.0.0.1")
    serverInfo.setServerPort(8080)
    serverInfo.setServerName("rollenholt.mac")
    List(serverInfo, serverInfo, serverInfo)
  }

}
