package io.github.rollenholt.application.center

import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.web.servlet.config.annotation.{DefaultServletHandlerConfigurer, EnableWebMvc, WebMvcConfigurerAdapter}
import org.springframework.web.servlet.view.InternalResourceViewResolver

/**
 * Created by wenchao.ren on 2015/9/15.
 */
@EnableWebMvc
@Configuration
class WebConfig extends WebMvcConfigurerAdapter {

  override
  def configureDefaultServletHandling(configurer:DefaultServletHandlerConfigurer) = {
    configurer.enable()
  }

  @Bean
  def  getViewResolver():InternalResourceViewResolver = {
    val viewResolver:InternalResourceViewResolver = new InternalResourceViewResolver()
    viewResolver.setPrefix("/WEB-INF/jsp/")
    viewResolver.setSuffix(".jsp")
    viewResolver
  }

}
