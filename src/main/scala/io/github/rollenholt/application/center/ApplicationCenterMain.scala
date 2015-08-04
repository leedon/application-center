package io.github.rollenholt.application.center

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

/**
 * @author rollenholt 
 */
@SpringBootApplication
class ApplicationCenterMain extends SpringBootServletInitializer{}

object ApplicationCenterMain{
  def main(args: Array[String]) {
    SpringApplication.run(classOf[ApplicationCenterMain]);
  }
}
