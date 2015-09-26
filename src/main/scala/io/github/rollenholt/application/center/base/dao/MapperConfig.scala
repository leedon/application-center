package io.github.rollenholt.application.center.base.dao

import javax.annotation.Resource

import org.springframework.context.annotation.{Bean, Configuration}

/**
 * @author rollenholt 
 */
@Configuration
class MapperConfig {

  @Resource
  private var databaseComponent: DatabaseComponent = _

  @Bean
  def getApplicationMapper() = {
    databaseComponent.getMapper(classOf[ApplicationMapper])
  }

}
