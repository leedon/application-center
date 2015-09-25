package io.github.rollenholt.application.center.base.dao

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource

/**
 * @author rollenholt 
 */
@PropertySource("classpath:jdbc.properties")
class DatabaseComponent {

  @Value("${driverClass}")
  private var driverClass:String = _
}
