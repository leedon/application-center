package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.model.ApplicationDeveloperMapping
import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationDeveloperMappingService {

  @Resource
  private[this] val applicationDeveloperMappingService: ApplicationDeveloperMappingService = null

  def insert(mapping:ApplicationDeveloperMapping) = {

  }

}

