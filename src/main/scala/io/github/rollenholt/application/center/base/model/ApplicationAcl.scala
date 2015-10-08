package io.github.rollenholt.application.center.base.model


import scala.beans.BeanProperty

/**
 * @author rollenholt 
 */
@SerialVersionUID(1L)
class ApplicationAcl() extends Serializable {

  @BeanProperty var id: Int = 0
  @BeanProperty var applicationCode: String = _
  @BeanProperty var state: Int = 0
  @BeanProperty var url: String = _
  @BeanProperty var authorizedApplication: String = _
  @BeanProperty var authorizedIp: String = _


  override def toString = s"ApplicationAcl(id=$id, applicationCode=$applicationCode, state=$state, " +
    s"url=$url, authorizedApplication=$authorizedApplication, authorizedIp=$authorizedIp)"
}
