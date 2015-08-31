package io.github.rollenholt.application.center.acl.service

import org.springframework.stereotype.Service

/**
 * @author rollenholt 
 */
@Service
class ApplicationAclService {

  /**
   * 查询特定资源的配置的ip地址
   * @param applicationCode 应用编码
   * @param url 资源url
   * @param isWhiteList 是否是白名单
   * @return 根据选项,返回查询到的ip配置信息
   */
  def fetchIpConfig(applicationCode: String, url: String, isWhiteList: Boolean): List[String] = {

  }

  /**
   * 进行ip名单配置
   * @param applicationCode 应用编码
   * @param url 资源url
   * @param isWhiteList true表示白名单,false表示黑名单
   */
  def ipConfig(applicationCode:String, url:String, isWhiteList:Boolean) = {

  }

  /**
   * 这样配置的话,此应用中所有的资源都可以被applicationCode这个应用所访问
   * @param applicationCode 应用编码
   */
  def applicationConfig(applicationCode:String) = {

  }

}
