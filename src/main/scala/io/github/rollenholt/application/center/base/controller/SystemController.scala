package io.github.rollenholt.application.center.base.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ResponseBody, RequestMethod, RequestMapping}

/**
 * Created by wenchao.ren on 2015/9/15.
 */
@Controller
class SystemController {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def index():String = {
     "hello"
  }

}
