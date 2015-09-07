package io.github.rollenholt.application.center

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.web.SpringBootServletInitializer

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
