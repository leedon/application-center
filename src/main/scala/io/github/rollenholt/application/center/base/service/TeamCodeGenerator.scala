package io.github.rollenholt.application.center.base.service

/**
 * @author rollenholt 
 */
trait TeamCodeGenerator {

  def generator
}

class DefaultTeamCodeGenerator extends TeamCodeGenerator{
  override def generator: Unit = ???
}