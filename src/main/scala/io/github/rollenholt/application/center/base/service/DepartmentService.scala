package io.github.rollenholt.application.center.base.service

import javax.annotation.Resource

import io.github.rollenholt.application.center.base.dao.DepartmentMapper
import io.github.rollenholt.application.center.base.model.Department
import org.springframework.stereotype.Service

/**
  * @author rollenholt 
  */
@Service
class DepartmentService {

  @Resource
  private[this] val departmentMapper:DepartmentMapper = null

  def list(): Array[Department] = {
    departmentMapper.list()
  }

}
