package com.dffx.webservice.util;

public class OrderState {
	
	
//-------------------------用户主表-------------------------------//
	//用户认证状态(0:未认证1:申请认证 2:已认证 3:认证失败)
	public static final int USER_ISCHECK_NO = 0;
	public static final int USER_ISCHECK_APPLY = 1;
	public static final int USER_ISCHECK_YES = 2;
	public static final int USER_ISCHECK_FAIL = 3;
	
	
//-------------------------订单主表-------------------------------//
	
	//订单状态(-3:截止时间撤销-2律师取消:-1用户撤销:1发布:3(有抢单)待确定 5:确定抢单律师:10律师申请付费:15撤回申请付款:20客服协调:0完成) 
	public static final int ORDER_STATUS_TIME_OUT_CANCEL = -3; //截止时间撤销
	public static final int ORDER_STATUS_LAWYER_CANCEL = -2; //过期订单用户取消
	public static final int ORDER_STATUS_USER_CANCEL = -1; //用户撤销
	public static final int ORDER_STATUS_FINISH = 0; //订单完成
	public static final int ORDER_STATUS_PUBLISH = 1; //发布成功
	public static final int ORDER_STATUS_GRAB_NOT_SURE = 3; //(有抢单)待确定 
	public static final int ORDER_STATUS_GRAB_CONFIRM = 5; //确定抢单律师
	public static final int ORDER_STATUS_GRAB_APPLY_PAY = 10; //律师申请付费
	public static final int ORDER_STATUS_CANCEL_APPLY_PAY = 15; //撤回申请付款
	public static final int ORDER_STATUS_CUSTOMER_SUIT = 20; //客服协调
	public static final int ORDER_STATUS_CUSTOMER_SUIT_FINISH = 21; //客服协调
	
	public static final int ORDER_STATUS_NOT_ACCEPT = 2; //委托未受理
	public static final int ORDER_STATUS_ACCEPT_CAREER = 10001; //委托未专业
	
	//订单用户删除(0:默认,1:用户删除)
	public static final int ORDER_USERCLOSE = 0; //默认状态，订单用户未删除的订单
	public static final int ORDER_USERCLOSE_USER_DEL = 1; //用户删除
	
	//律师用户删除(0:默认,1:律师删除)
	public static final int ORDER_LAWYERCLOSE = 0; //默认状态，律师用户未删除的订单
	public static final int ORDER_USERCLOSE_LAWYER_DEL = 1; //律师删除
	
	//工作确定(1联系:2面谈3签订合同4开庭审理5结案)如(1;1;1;0;0)
	public static final int ORDER_ENSURE = 0; //默认
	public static final int ORDER_ENSURE_CONTACT = 1; //联系
	public static final int ORDER_ENSURE_INTERVIEW = 2; //面谈
	public static final int ORDER_ENSURE_SIGNED = 3; //签订合同
	public static final int ORDER_ENSURE_OPEN_COURT = 4; //开庭审理
	public static final int ORDER_ENSURE_FINISH_CASE = 5; //结案
	
	 
//------------------------订单详情表-----------------------------//	
	//案件类型(1咨询2打官司3出勤4代写文书)
	public static final int CASE_TYPE_CONSULT = 1; //咨询
	public static final int CASE_TYPE_LAWSUIT = 2; //打官司
	public static final int CASE_TYPE_ATTENDENCE = 3; //出勤
	public static final int CASE_TYPE_WRIT = 4; //文书
	
	//律师要求(0不限制 1男 2女) 
	public static final int CASE_REQURIE_NOT_LIMIT = 0; //不限性别或保密
	public static final int CASE_REQURIE_MAN = 1;
	public static final int CASE_REQURIE_WOMAN = 2;
	
	//是否推送(0不推送 1 推送) 
	public static final int CASE_ISPUBLISH_NO = 0; //不推送
	public static final int CASE_ISPUBLISH_YES = 1; //推送
	
	
//------------------------订单消息表-----------------------------//	
	//订单状态(-1:用户撤销,1:发布,3:(有抢单)待确定, 5:确定抢单律师) 
	public static final int MSG_STATUS_USER_CANCEL = -1; //用户撤销
	public static final int MSG_STATUS_PUBLISH = 1; //发布
	public static final int MSG_STATUS_HAVE_GRAG = 3; //(有抢单)待确定
	public static final int MSG_STATUS_GRAB_CONFIRM = 5; //确定抢单律师
	public static final int MSG_STATUS_MSG_SIGN = 0; //订单消息表抢单标示
	public static final int MSG_STATUS_APPLY_PAY = 10; //律师申请付费
	public static final int MSG_STATUS_CANCEL_APPLY_PAY = 15; //公众用户撤销付款
	public static final int MSG_STATUS_CUSTOMER_SUIT = 20; //客服协调
	public static final int MSG_STATUS_FINISH = 0; //订单完成
	
//----------------------订单支付情况表---------------------------//	
	//悬赏类型(0非法援:1法援)
	public static final int PAID_AWARDTYPE_LAW_HELP_NO = 0; //非法援
	public static final int PAID_AWARDTYPE_LAW_HELP_YES = 1; //法援
	
	//使用免费机会(0:否 1:是) 
	public static final int PAID_ISFREE_NO = 0; //非免费
	public static final int PAID_ISFREE_YES = 1; //免费
	
	
//------------------------用户积分表----------------------------//	
	//积分类别(0悬赏积分:1法援积分)
	public static final int SCORE_TYPE_REWARD = 0; //悬赏积分
	public static final int SCORE_TYPE_LAW_HELP = 1; //法援积分
	
	
//-----------------------抢单流水记录表---------------------------//	
	//订单状态标识((-1取消订单,1待处理:(2已通知:3未通知):(4抢单成功:5抢单失败):(6抢单成功完成:7抢单失败完成))
	public static final int GRAB_STATUS_PENDING = 1; //待处理
	public static final int GRAB_STATUS_NOTIFICATION_YES = 2; //已通知
	public static final int GRAB_STATUS_NOTIFICATION_NO = 3; //未通知
	public static final int GRAB_STATUS_SUCCESS = 4; //抢单成功
	public static final int GRAB_STATUS_FAIL = 5; //抢单失败
	public static final int GRAB_STATUS_SUCCESS_FINISH = 6; //抢单成功完成
	public static final int GRAB_STATUS_FAIL_FINISH = 7; //抢单失败完成
	public static final int GRAB_STATUS_CONSULT_OR_WRIT_SUCCESS = 10; //文书、咨询抢单成功,通知公众端
	
	
//-----------------------用户支付记录表---------------------------//	
	//支付状态(1、支付,2、退还)
	public static final int PAY_STATUS_USER_CONSUME = 1; //支付
	public static final int PAY_STATUS_HAND_BACK = 2; //退还
	 
	//状态(0申请，1成功，2失败) 
	public static final int PAY_STATUS_APPLY = 0; //申请
	public static final int PAY_STATUS_SUCCESS = 1; //成功
	public static final int PAY_STATUS_FAIL = 2; //失败
	
	//个人操作类型(0充值，1支付，2收益)
	public static final int PAY_OPER_TYPE_USER_INFLOW = 0; //充值
	public static final int PAY_OPER_TYPE_DISBURSE = 1; //支付
	public static final int PAY_OPER_TYPE_EARNINGS = 2; //收益
	
	//处理类型（0用户充值，1注册赠送，2活动赠送，11订单支付）
	public static final int PAY_PROCESS_TYPE_USER_INFLOW = 0;
	public static final int PAY_PROCESS_TYPE_REGIST_SEND = 1;
	public static final int PAY_PROCESS_TYPE_ACTIVITY_SEND = 2;
	public static final int PAY_PROCESS_TYPE_ORDER_PAYMENT = 11;
	
	//公众用户删除订单类型：1、公众用户取消订单，2、订单完成时删除订单
	public static final int USER_CANCEL_TYPE_IS_FINISH_NO = 1; //订单未完成公众用户取消订单
	public static final int USER_CANCEL_TYPE_IS_FINISH_YES = 2; //订单完成时删除订单
	
	//律师删除订单类型
	public static final int LAWYER_CANCEL_TYPE_DEL_GRABORDER = 1; //律师删除抢单记录
	public static final int LAWYER_CANCEL_TYPE_IS_FINISH_YES  = 2; //律师完成订单后删除
	
	
	//-----------------------平台支付记录表---------------------------//
	//平台操作类型(0收益，1支付)
	public static final int PLATFORM_PAY_OPER_TYPE_INCOME = 0; //收益
	public static final int PLATFORM_PAY_OPER_TYPE_DISBURSE = 1; //支付
	
	//平台处理类型（0会员购买，11平台赠送订单支付，12注册赠送，13活动赠送）
	public static final int PLATFORM_PAY_PROCESS_TYPE_USER_BUY_VIP = 0; //会员购买vip
	public static final int PLATFORM_PAY_PROCESS_ORDER_PAYMENT = 11; //平台赠送订单支付
	public static final int PLATFORM_PAY_PROCESS_REGIST_SEND = 12; //注册赠送
	public static final int PLATFORM_PAY_PROCESS_ACTIVITY_SEND = 13; //活动赠送
	
	//---------------------用户类型--------------------------//
	public static final int USERTYPE_USER = 0; //普通用户
	public static final int USERTYPE_LAWYER =2; //律师用户
	public static final int USERTYPE_COMPANY =1; //企业用户
	public static final int USERTYPE_SPECIAL_LAWYER =3; //特殊律师用户
	
	//----------------------用户操作类型--------------------------//
	public static final int OPTTYPE_ADD =0; //增
	public static final int OPTTYPE_SET =1; //改
	public static final int OPTTYPE_DEL =2; //删
	public static final int OPTTYPE_SEL_ME =3; //查询我的信息
	public static final int OPTTYPE_SEL_OTHER =4; //查询他人信息
	
	//----------------------用户认证状态----------------------------------//
	public static final int USERISCHECK_NO =0; //未认证
	public static final int USERISCHECK_WAIT =1;//申请认证
	public static final int USERISCHECK_OK = 2; //认证成功
	public static final int USERISCHECK_FAIL = 3; //认证成功
	
	//----------------------用户登录类型----------------------------//
	public static final int LOGINTYPE_PC =0; //
	public static final int LOGINTYPE_PHONE =1;
	
	//-------------------------订单查询状态--------------------------------//
	public static final int ORDER_STATUS_SEL_ALL = 0;
	public static final int ORDER_STATUS_SEL_GRAB_NOT_SURE =1;
	public static final int ORDER_STATUS_SEL_GRAB_CONFIRM = 2; //确定抢单律师
	public static final int ORDER_STATUS_SEL_GRAB_APPLY_PAY = 3; //律师申请付费
	public static final int ORDER_STATUS_SEL_UNDERWAY =4; //进行中..
	public static final int ORDER_STATUS_SEL_CANCEL_APPLY_PAY = 10; //撤回申请付款
	public static final int ORDER_STATUS_SEL_FINISH_PHONE = 5; //已完成 phone
	public static final int ORDER_STATUS_SEL_FINISH_PC=9; //已完成 PC
	public static final int ORDER_STATUS_SEL_CANCEL=6; //已取消
	public static final int ORDER_STATUS_SEL_TIME_OUT_CANCEL =7; //已过期
	public static final int ORDER_STATUS_SEL_NOT_FINISH = 8; //未完成
	
	public static final int COMMON_ACTION_TYPE_INVITER=1; //邀请好友活动
	public static final int COMMON_ACTION_STATUS_END=0;//结束
	public static final int COMMON_ACTION_STATUS_GOING=1; //生效
	
	public static final int LOGPAY_OPERTYPE_INCOME=2; //收益
	public static final int LOGPAY_OPERTYPE_DISBURSE=1; //支付
	public static final int LOGPAY_OPERTYPE_TOPUP=0; //充值
	public static final int LOGPAY_STATUS_APPLY=0; //申请
	public static final int LOGPAY_STATUS_OK=1; //成功
	public static final int LOGPAY_STATUS_FAIL=2; //失败
	public static final int LOGPAY_PROCESS_TYPE_TOPUP=0; //用户充值
	public static final int LOGPAY_PROCESS_TYPE_REGISTER_GIFT=1;//注册赠送
	public static final int LOGPAY_PROCESS_TYPE_TOPUP_GIFT=2; //活动赠送
	public static final int LOGPAY_PROCESS_TYPE_ORDER_PAY=11; //订单支付
	public static final int LOGPAY_PROCESS_TYPE_USER_BUY_VIP = 12; //会员购买vip
	
	public static final int DFFX_LOGALTERPW_TYPE_LOGIN=0; //修改登陆密码
	public static final int DFFX_LOGALTERPW_TYPE_PAY=1; //修改交易密码
	public static final int DFFX_LOGALTERPW_FROM_PHONE=0;// 手机端 修改
	public static final int DFFX_LOGALTERPW_FROM_PC = 1; // pc 端修改
	public static final int DFFX_LOGALTERPW_FROM_WEB =2; //web 端修改
	
	public static final int DFFX_UPLOAD_TYPE_MESSAGE =1; //咨询
	public static final int DFFX_UPLOAD_TYPE_LAWSUIT =2;//打官司
	public static final int DFFX_UPLOAD_TYPE_TAKEOUT =3;//出勤
	public static final int DFFX_UPLOAD_TYPE_WRITE =4;//代写文书
	public static final int DFFX_UPLOAD_TYPE_ID =5;//身份认证
	public static final int DFFX_UPLOAD_TYPE_FILES= 7;//律师文件上传
	public static final int DFFX_UPLOAD_TYPE_HEAD = 8;//头像
	public static final int DFFX_UPLOAD_TYPE_LOGS =9;//logs
	public static final int DFFX_UPLOAD_TYPE_ADVICE =10; //用户咨询 
	
	public static final int DFFX_BILL_PAY_OK =1; //块钱支付成功
	public static final int DFFX_PAY_FAIL =2; //块钱支付失败
	public static final int DFFX_PAY_ERROR =3; //块钱支付错误
	
	public static final int DFFX_COMMON_PUSH_TYPE_TOPUY =1; //充值
	public static final int DFFX_COMMON_PUSH_TYPE_DOWP=2; // 提现
	public static final int DFFX_COMMON_PUSH_TYPE_PAY=3; // 支付
	
	public static final int DFFX_COMMON_PUSH_RESULT_OK =1; //成功
	public static final int DFFX_COMMON_PUSH_RESHLT_FAIL =2; //失败
	public static final int DFFX_COMMON_PUSH_RESULT_PAYFAIL = 3; //订单支付失败
	
	public static final int DFFX_COMMON_PUSH_PAYMENT_OK = 3; //支付
	public static final int DFFX_COMMON_PUSH_SIGN_DEF =0; //推送默认
	public static final int DFFX_COMMON_PUSH_SIGN_PUSH =1;// 推动
	
	public static final int NUM_ZERO =0; //数字0
	
	public static final String ORDER_PROMPT_NAME = "Red_Dot:order_prompt_message"; //订单红点提示redis域名
	public static final String ORDER_PROMPT_MESSAGE_YES = "1"; //订单红点提示
	public static final String ORDER_PROMPT_MESSAGE_NO = "0"; //订单红点不提示
	
	public static final String update_password_login = "Update_password:user_login_password_";	//忘记登录密码
	public static final String update_password_pay="Update_password:user_pay_password_";	//忘记支付密码
	public static final String update_password_yes ="1";
	
	//----------------------订单最新状态----------------------------//
	public static final int DFFX_ORDER_STATE_TIME_NEW = 0;//（0：最新的，1：过期的）
	public static final int DFFX_ORDER_STATE_TIME_OLD = 1;
	
	
	
}
