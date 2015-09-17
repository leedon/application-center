package io.github.rollenholt.application.center.base.model

import java.util.Date


import scala.collection.mutable.ListBuffer

/**
 * @author rollenholt 
 */
class ApplicationVo {

  var id: Int = 0
  var name: String = _
  var code: String = _
  var creator: String = _
  var createTime: Date = _
  var state: Int = 0
  var developers: ListBuffer[String] = _
  var emailGroup: String = _

  override def toString = s"ApplicationVo($id, $name, $code, $creator, $createTime, $state, $developers, $emailGroup)"
}

