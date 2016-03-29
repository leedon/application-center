package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.Department

/**
  * @author rollenholt 
  */
trait DepartmentMapper extends Mapper{

  def list(): Array[Department]
}
