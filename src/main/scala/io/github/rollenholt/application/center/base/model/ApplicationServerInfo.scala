package io.github.rollenholt.application.center.base.model


import scala.beans.BeanProperty


/**
 * @author rollenholt 
 */
@SerialVersionUID(1L)
class ApplicationServerInfo extends Serializable {

  @BeanProperty var environmentType: String = _
  @BeanProperty var serverName: String = _
  @BeanProperty var serverIp: String = _
  @BeanProperty var serverPort: Int = _
  @BeanProperty var isOnline: Boolean = _


  override def toString = s"ApplicationServerInfo(environmentType=$environmentType, " +
    s"serverName=$serverName, serverIp=$serverIp, serverPort=$serverPort, isOnline=$isOnline)"
}
