package io.github.rollenholt.application.center.base.model

/**
  * @author rollenholt 
  */
object ApplicationState {

  sealed trait ApplicationStateEnum {
    val id: Int
    val code: String
  }

  case object waitingApproval extends ApplicationStateEnum {
    override val id: Int = 1
    override val code: String = "waiting_approval"
  }

  case object approvalPass extends ApplicationStateEnum {
    override val id: Int = 2
    override val code: String = "approval_pass"
  }

  case object approvalReject extends ApplicationStateEnum {
    override val id: Int = 3
    override val code: String = "approval_reject"
  }

}




