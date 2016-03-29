package io.github.rollenholt.application.center.api

import javax.annotation.Resource

import com.rollenholt.pear.pojo.JsonV2
import io.github.rollenholt.application.center.base.model.Department
import io.github.rollenholt.application.center.base.service.DepartmentService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

/**
  * @author rollenholt 
  */
@Controller
@RequestMapping(value = Array("/api/department"))
class DepartmentApi {

  @Resource
  private[this] val departmentService:DepartmentService = null

  @RequestMapping(value = Array("/list"), method = Array(RequestMethod.GET))
  @ResponseBody
  def applicationList() = {
    val departments: Array[Department] = departmentService.list()
    new JsonV2[Array[Department]](0, "获取部门列表成功", departments)
  }

}
