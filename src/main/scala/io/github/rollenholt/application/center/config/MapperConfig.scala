package io.github.rollenholt.application.center.config

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.{ApplicationAclMapper, OperationLogMapper, ApplicationMapper}
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

  @Bean
  def getOperationLogMapper() = {
    databaseComponent.getMapper(classOf[OperationLogMapper])
  }

  @Bean
  def getApplicationAclMapper() = {
    databaseComponent.getMapper(classOf[ApplicationAclMapper])
  }

}
