package io.github.rollenholt.application.center.acl.interceptor

import javax.annotation.Resource
import javax.servlet.http.{HttpServletResponse, HttpServletRequest}

import org.slf4j.{LoggerFactory, Logger}
import org.springframework.stereotype.Component
import org.springframework.web.servlet.{ModelAndView, HandlerInterceptor}

/**
 * @author rollenholt 
 */
@Component
class IpInterceptor{
//class IpInterceptor extends HandlerInterceptor{

  private val FORBIDDEN_STATUS_CODE: Integer = 403

  private[this] val logger:Logger = LoggerFactory.getLogger(classOf[IpInterceptor])

//
//  override def afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: scala.Any, ex: Exception): Unit = {
//
//  }
//
//  override def preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: scala.Any): Boolean = {
//    val pathInfo: String = request.getPathInfo
//    val ipWhiteList: List[String] = applicationAclService.fetchIpConfig("applicationCode", pathInfo, true)
//    val realIp: String = getRealIp(request)
//    if (ipWhiteList.contains(realIp)) {
//      return true
//    }
//    logger.warn("ip:{} do not have authority to access some resources", realIp)
//    response.sendError(FORBIDDEN_STATUS_CODE)
//    return false
//  }
//
//  override def postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: scala.Any, modelAndView: ModelAndView): Unit = {
//
//  }

  private def getRealIp(request: HttpServletRequest): String = {
    var ip: String = request.getHeader("X-Real-IP")
    if (ip == null || ip.length == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP")
    }
    if (ip == null || ip.length == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP")
    }
    if (ip == null || ip.length == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("HTTP_CLIENT_IP")
    }
    if (ip == null || ip.length == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("HTTP_X_FORWARDED_FOR")
    }
    if (ip == null || ip.length == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr
    }
    return ip
  }
}
