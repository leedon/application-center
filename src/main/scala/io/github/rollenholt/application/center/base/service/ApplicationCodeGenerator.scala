package io.github.rollenholt.application.center.base.service

/**
 * @author rollenholt 
 */
trait ApplicationCodeGenerator {

  def generator():String
}

class DefaultApplicationCodeGenerator extends ApplicationCodeGenerator {
  override def generator(): String = ???
}
