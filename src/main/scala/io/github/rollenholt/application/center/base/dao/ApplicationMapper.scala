package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.Application

/**
 * @author rollenholt 
 */
trait ApplicationMapper {

  def findById(id: Int): Application
}
