package io.github.rollenholt.application.center

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{DefaultServletHandlerConfigurer, EnableWebMvc, WebMvcConfigurerAdapter}

/**
 * Created by wenchao.ren
 */
@EnableWebMvc
@Configuration
class WebConfig extends WebMvcConfigurerAdapter {

  override
  def configureDefaultServletHandling(configurer:DefaultServletHandlerConfigurer) = {
    configurer.enable()
  }

}
