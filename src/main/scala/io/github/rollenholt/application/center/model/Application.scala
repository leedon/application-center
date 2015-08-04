package io.github.rollenholt.application.center.model

import java.util.Date

import scala.collection.mutable.ListBuffer

/**
 * @author rollenholt 
 */
class Application() {

  private[this] var id: Int = null
  private[this] var name: String = null
  private[this] var code: String = null
  private[this] var teamCode: String = null
  private[this] var creator: String = null
  private[this] var createTime: Date = null
  private[this] var state: Int = null
  private[this] var developers: ListBuffer[String] = null
  private[this] var emailGroup: String = null

}
