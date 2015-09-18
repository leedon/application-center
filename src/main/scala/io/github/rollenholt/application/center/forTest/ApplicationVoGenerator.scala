package io.github.rollenholt.application.center.forTest

import io.github.rollenholt.application.center.base.model.ApplicationVo

/**
 * @author rollenholt 
 */
object ApplicationVoGenerator {

    def generate() = {
      val vo: ApplicationVo = new ApplicationVo
      vo.code = "applicationCode"
      vo.name = "applicationName"
      vo.emailGroup = "1@qq.com"
      vo.developers = "wenchao/rollenholt"
      vo
    }
}
