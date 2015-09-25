package io.github.rollenholt.application.center.base.dao

import io.github.rollenholt.application.center.base.model.Application
import org.apache.ibatis.annotations.Select

/**
 * @author rollenholt 
 */
trait ApplicationMapper {

  @Select(value = Array("SELECT id, name, code, team_code as teamCode, creator, " +
    "create_time as createTime, state, email_group as emailGroupfrom from application where id = #{value}"))
  def findById(id: Int): Application
}
