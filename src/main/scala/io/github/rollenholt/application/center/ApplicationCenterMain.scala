package io.github.rollenholt.application.center

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer

/**
 * @author rollenholt 
 */
@SpringBootApplication
class ApplicationCenterMain extends SpringBootServletInitializer{
  override def configure(builder: SpringApplicationBuilder): SpringApplicationBuilder = super.configure(builder)
}

object ApplicationCenterMain{
  def main(args: Array[String]) {
    SpringApplication.run(classOf[ApplicationCenterMain])
  }
}
