package io.github.rollenholt.application.center.base.model

import java.util.Date

import scala.beans.BeanProperty

/**
 * @author rollenholt 
 */
//case class Application(id: Option[Int], name: String, code: String, teamCode: String,
//                       creator: String, createTime: Date, state: Int, emailGroup: String)

class Application() extends Serializable {

  @BeanProperty var id: Int = 0
  @BeanProperty var name: String = _
  @BeanProperty var code: String = _
  @BeanProperty var teamCode:String = _
  @BeanProperty var creator:String = _
  @BeanProperty var createTime:Date = _
  @BeanProperty var state:Int = 0
  @BeanProperty var emailGroup: String = _

  override def toString = s"Application($id, $name, $code, $teamCode, $creator, $createTime, $state, $emailGroup)"
}