package com.dffx.webservice.util;

public class ConstansCN {

	// ------public------//
	public static final String DFFX_PARAM_ERROR = "参数格式有误";
	public static final String DFFX_CHAR_KEY_ERROR = "网络连接错误,请稍后重试"; // 会话密令错误
	public static final String DFFX_VERIFYTOKEN_ERROR = "会话密令验证失败";
	public static final String DFFX_USERUID_ISNULL_ERROR = "用户帐号不能为空";
	public static final String DFFX_PHONE_ISNULL_ERROR = "手机号码不能为空";
	public static final String DFFX_FREE_CONFIG_NOT_EXIST = "免费次数配置信息不存在";
	public static final String DFFX_FREE_IS_USE = "免费次数已使用完";
	public static final String DFFX_CODE_TYPE_IS_NOT_NULL = "验证码类型不能为空";
	public static final String DFFX_VERIFY_CODE_IS_NOT_NULL = "验证码不能为空";
	public static final String DFFX_VERIFY_CODE_ERROR = "验证码不正确";
	public static final String DFFX_ORDER_STATE_ERROR = "订单状态不正确";
	public static final String DFFX_IS_NOT_POINT_LAWYER = "不是指定律师!";
	public static final String DFFX_PAGE_START_INDEX_IS_NOT_NULL = "分页查询起点位置不能为空";
	public static final String DFFX_PAGE_SIZE_IS_NOT_NULL = "每页条数不能为空";
	public static final String DFFX_ORDERSN_IS_NOT_NULL = "订单编号不能为空";
	public static final String DFFX_LAWYER_IS_NOT_AUTH = "律师未被认证";
	public static final String DFFX_WALLET_PASSWORD_IS_ERROR = "支付密码不正确";
	public static final String DFFX_PLEASE_SET_PASSWORD = "请先设置支付密码";
	public static final String DFFX_PLEASE_SET_PASSWORD_ERROR_BEYOND_LIMIT = "支付密码输入错误次数超过限制次数";
	public static final String DFFX_RESID_CONNECTION_ERROR = "resid连接出错";

	// ---------获取用户信息接口----------//
	public static final String DFFX_GETUSER = "获取用户信息接口";
	public static final String DFFX_GETUSER_MSG_OK = "获取用户信息成功";
	public static final String DFFX_GETUSER_MSG_FAIL = "获取用户信息失败";
	public static final String DFFX_GETUSER_USERTYPE_NOT_EXIST = "不存在的用户类型";
	public static final String DFFX_GETUSER_UPDATETIME_NOT_NULL = "更新时间不能为空";
	public static final String DFFX_GETUSER_OPTTYPE_NOT_NULL = "操作类型不能为空";
	public static final String DFFX_GETUSER_GUESTUID_NOT_NULL = "需要查询的用户id 不能为空";
	public static final String DFFX_SETUSER = "设置用户信息接口";
	public static final String DFFX_SETUSER_MSG_FAIL = "设置用户信息失败";
	public static final String DFFX_SETUSER_MSG_FAIL_USER_NOTEXIST = "设置用户信息是失败,用户不存在";
	public static final String DFFX_SERUSER_MSG_OK = "设置用户信息成功";
	public static final String DFFX_SETUSER_ERROR = "设置用户信息异常";
	public static final String DFFX_SETUSER_TYPE_NOT_EXIST = "不存在的操作类型";

	// ------------------用户获取认证状态接口------------------------------//
	public static final String DFFX_ISCHECK = "用户获取认证状态接口";
	public static final String DFFX_ISCHECK_OK = "获取状态成功";
	public static final String DFFX_ISCHECK_FAIL = "获取状态失败";

	// -----------------获取用户登录接口---------------//
	public static final String DFFX_GETACCOUNT = "获取用户登录接口";
	public static final String DFFX_GETACCOUNT_MSG_FAIL = "获取用户信息失败";
	public static final String DFFX_GETACCOUNT_MSG_OK = "获取用户信息成功";

	// -----------------律师信息接口------------------//
	public static final String DFFX_GETLAWYER = "律师信息接口";
	public static final String DFFX_GETLAWYER_MSG_FAIL = "获取律师信息失败";
	public static final String DFFX_GETLAWYER_MSG_OK = "获取律师信息成功";
	public static final String DFFX_SETLAWYER_MSG_FAIL = "设置律师信息失败";
	public static final String DFFX_SETLAWYER_MSG_FAIL_USER_NOT_EXIST = "设置律师信息失败,律师不存在";
	public static final String DFFX_SETLAWYER_MSG_OK = "设置律师信息成功";
	public static final String DFFX_LAWYER_UPDATETIME_NOT_NULL = "更新时间不能为空";

	// ------------------获取企业信息接口-----------------//
	public static final String DFFX_GETCOMPANY = "获取企业信息接口";
	public static final String DFFX_GETCOMPANY_MSG_FAIL = "获取企业信息失败";
	public static final String DFFX_GETCOMPAMY_MSG_OK = "获取企业信息成功";
	public static final String DFFX_SETCOMPANY = "设置企业信息接口";
	public static final String DFFX_SERCOMPANY_MSG_FAIL = "设置企业信息失败";
	public static final String DFFX_SERCOMPANY_MSG_FAIL_USER_NOTEXIST = "设置企业信息失败,企业信息不存在";
	public static final String DFFX_SETCOMPANY_MSG_OK = "设置企业信息成功";

	// ----------------获取验证码接口-------------------//
	public static final String DFFX_GETVERIFICATION = "获取验证码接口";
	public static final String DFFX_GETVERIFICATION_MSG_OK = "获取验证码成功";
	public static final String DFFX_GETVERIFICATION_MSG_FAIL = "获取验证码失败";

	// -----------------获取二维码接口------------------//
	public static final String DFFX_GETQRCODE = "获取二维码接口";
	public static final String DFFX_GETQRCODE_MSG_OK = "获取二维码成功";
	public static final String DFFX_GETQRCODE_MSG_FAIL = "获取二维码失败";

	// ---------------------律师认证接口-------------------//
	public static final String DFFX_LAWYERISCHECK = "律师认证接口";
	public static final String DFFX_LAWYERISCHECK_OK = "律师认证成功";
	public static final String DFFX_LAWYERISCHECK_FAIL = "律师认证失败";
	public static final String DFFX_LAWYERISCHECK_WAIT = "用户资料正在审核中";
	public static final String DFFX_LAWYERISCHECK_CERT_FULL = "律师认证的专业已经有两个";
	public static final String DFFX_LAWYERISCHECK_CERT_CHAT = "保存数据到即时通讯失败";
	public static final String DFFX_LAWYERISCHECK_CERT_LINK_FAIL = "保存律师链接失败";
	public static final String DFFX_LAWYERISCHECK_CERT_ADD_FAIL = "保存律师地址失败";
	public static final String DFFX_LAWYERISCHECK_CERT_DATA_FAIL = "保存律师信息失败";
	public static final String DFFX_LAWYERISCHECK_CERT_STATU_FAIL = "更改认证状态失败";
	public static final String DFFX_LAWYERISCHECK_OFFICE_NULL = "律师事务所名称不能为空";
	public static final String DFFX_LAWYERISCHECK_SKILLID_NULL = "律师专业不能为空";
	public static final String DFFX_LAWYERISCHECK_WORKTIME_NULL = "律师职业年限不能为空";
	public static final String DFFX_LAWYERISCHECK_OFFICEPHONE_NULL = "律师事务所电话不能空";
	public static final String DFFX_LAWYERISCHECK_BANKCODE_NULL = "律师对公账号不能为空";
	public static final String DFFX_LAWYERISCHECK_BANKNAME_NULL = "律师对公银行名称不能为空";
	public static final String DFFX_LAWYERISCHECK_CERTCODE_NULL = "律师职业资格证号不能为空";
	public static final String DFFX_LAWYERISCHECK_CERT_NULL = "律师执业资格证不能为空";
	public static final String DFFX_LAWYERISCHECK_NAME_NULL = "律师真实姓名不能为空";
	public static final String DFFX_LAWYERISCHECK_ORDERAREA_NULL = "律师接单地区不能为空";
	public static final String DFFX_LAWYERISCHECK_BANKNAME_LENGTH_ISLONG = "银行名称太长";
	public static final String DFFX_LAWYERISCHECK_WORKTIME_ERROR = "律师工作年限不能大于当前时间";

	// -----------------------企业认证接口--------------------------//
	public static final String DFFX_COMPANYISCHECK = "企业认证接口";
	public static final String DFFX_COMPANYISCHECK_OK = "企业认证成功";
	public static final String DFFX_COMPANYISCHECK_FAIL = "企业认证失败";
	public static final String DFFX_COMPANYISCHECK_CERT_LINK_FAIL = "保存企业链接失败";
	public static final String DFFX_COMPANYISCHECK_CERT_INFO_FAIL = "保存企业信息失败";
	public static final String DFFX_COMPANYISCHECK_CERT_STATE_FAIL = "保存认证状态失败";
	public static final String DFFX_COMPANYISCHECK_CERT_WAIT = "企业资料正在审核中";
	public static final String DFFX_COMPANYISCHECK_CERT_CHAT = "保存数据到即时通讯失败";
	public static final String DFFX_COMPANYISCHECK_COMPANYCERT_NULL = "执业证不能为空";
	public static final String DFFX_COMPANYISCHECK_COMPANYCERTCODE_NULL = "执业证号码不能为空";
	public static final String DFFX_COMPANYISCHECK_COMPANYNAME_NULL = "企业名称不能为空";

	// ----------------------------用户认证接口--------------------------------//
	public static final String DFFX_USERISCHECK = "用户认证接口";
	public static final String DFFX_USERISCHECK_OK = "用户认证成功";
	public static final String DFFX_USERISCHECK_FAIL = "用户认证失败";
	public static final String DFFX_USERISCHECK_WAIL = "用户资料正在审核中";
	public static final String DFFX_USERISCHECK_NOT_VALID = "不是有效的身份证号码";
	public static final String DFFX_USERISCHECK_EXIST = "该身份证号码已被使用";
	public static final String DFFX_USERISCEHCK_IDENTITY_NULL = "身份证号不能为空";
	public static final String DFFX_USERISCHECK_NAME_NULL = "用户姓名不能为空";
	public static final String DFFX_USERISCHECK_SAVE_INFO_FAIL = "保存认证信息失败";
	public static final String DFFX_USERISCHECK_SAVE_STATE_FAIL = "保存认证状态失败";

	// ------------------上传文件接口-----------------//
	public static final String DFFX_UPLOADFILE = "上传文件接口";
	public static final String DFFX_UPLOADFILE_MSG_FAIL = "上传文件失败";
	public static final String DFFX_UPLOADFILE_MSG_OK = "上传文件成功";
	public static final String DFFX_UPLOADFILE_MSG_UPLOAD = "正在上传...";
	public static final String DFFX_UPLOADFILE_MSG_UPLOAD_FINISHED = "上传结束";
	public static final String DFFX_UPLOADFILE_FILENAME_NOT_NULL = "文件名不能为空";
	public static final String DFFX_UPLOADFILE_FILELENGTH_NOT_NULL = "文件长度不能为空";
	public static final String DFFX_UPLOADFILE_FILETYPE_NOT_NULL = "文件类型不能为空";
	public static final String DFFX_UPLOADFILE_PORTFIX_ERROR = "文件后缀名错误";

	// -----------------下载文件接口------------------//
	public static final String DFFX_DOWNLOADFILE = "下载文件接口";
	public static final String DFFX_DOWNLOADFILE_MSG_FAIL = "下载文件失败";
	public static final String DFFX_DOWNLOADFILE_MSG_OK = "下载文件成功";
	public static final String DFFX_DOWNLOADFILE_FILE_IS_NOT_EXIST = "文件不存在";

	// -----------------获取用户订单接口------------------//
	public static final String DFFX_GETUSERORDER = "获取用户订单接口";
	public static final String DFFX_GETUSERORDER_MSG_FAIL = "获取订单失败";
	public static final String DFFX_GETUSERORDER_MSG_OK = "获取用户订单成功";

	// ----------------获取订单详情接口-------------------//
	public static final String DFFX_GETORDERDETAILS = "获取订单详情接口";
	public static final String DFFX_GETORDERDETAILS_MSG_FAIL = "获取订单详情失败";
	public static final String DFFX_GETOEDERDETAILS_MSG_OK = "获取订单详情成功";
	public static final String DFFX_GETOEDERDETAILS_EXIST = "该订单已经被其他律师处理";
	public static final String DFFX_GETOEDERDETAILS_TIMEPOUT = "该订单已经过期";
	public static final String DFFX_GETOEDERDETAILS_USER_CANCEL = "用户已取消该订单";

	// ----------------获取订单类型数量接口-------------------//
	public static final String DFFX_GETCASETYPECOUNT = "获取订单类型数量接口";
	public static final String DFFX_GETCASETYPECOUNT_MSG_FAIL = "获取订单类型数量失败";
	public static final String DFFX_GETCASETYPECOUNT_MSG_OK = "获取订单类型数量成功";

	// ---------------获取抢单list接口--------------------//
	public static final String DFFX_GRABCASELIST = "获取抢单list接口";
	public static final String DFFX_GRABCASELIST_MSG_FAIL = "获取list 失败";
	public static final String DFFX_GRABCASELIST_MSG_OK = "获取list 成功";
	public static final String DFFX_GRABCASELIST_TYPE_NOT_NULL = "案件类型不能为空";

	// -----------------添加用户配置接口------------------//
	public static final String DFFX_ADDUSERCONFIG = "添加用户配置接口";
	public static final String DFFX_ADDUSERCONFIG_CONFIG_DOUBLE_ERROR = "不能重复添加配置";
	public static final String DFFX_ADDUSERCONFIG_MSG_OK = "配置文件插入成功";
	public static final String DFFX_ADDUSERCONFIG_MSG_FAIL = "配置文件插入失败";

	// ----------------修改用户配置接口-------------------//
	public static final String DFFX_UPDATEUSERCONFIG = "修改用户配置接口";
	public static final String DFFX_UPDATEUSERCONFIG_TOKEN_ISNULL_ERROR = "用户口令不能为空";
	public static final String DFFX_UPDATEUSERCONFIG_USERID_ISNULL_ERROR = "用户帐号不能为空";
	public static final String DFFX_UPDATEUSERCONFIG_MSG_OK = "配置文件修改成功";
	public static final String DFFX_UPDATEUSERCONFIG_MSG_FAIL = "配置文件修改失败";
	public static final String DFFX_UPDATEUSERCONFIG_MSG_NOT_EXIST = "配置信息不存在";

	// --------------------------修改密码,短信模板接口---------------------------//
	public static final String DFFX_SENDALTERPWDCODE = "修改密码,短信模板接口";
	public static final String DFFX_SENDALTERPWDCODE_PARAM_ERROR = "修改密码，短信验证模板参数格式有误!";
	public static final String DFFX_SENDALTERPWDCODE_GETKEY_MSG_FAIL = "短信模板获取令牌失败";
	public static final String DFFX_SENDALTERPWDCODE_SENDVERIFICATION_MSG_FAIL = "修改密码，发送短信验证码失败";
	public static final String DFFX_SENDALTERPWDCODE_GETVERIFICATION_MSG_OK = "获取验证码成功";

	// -------------------------用户注册接口------------------------//
	public static final String DFFX_REGISTERUSER = "用户注册接口";
	public static final String DFFX_REGISTERUSER_PASSWORD_ISNULL_ERROR = "用户密码不能为空";
	public static final String DFFX_REGISTERUSER_VERIFICATION_ISNULL_ERROR = "验证码不能为空";
	public static final String DFFX_REGISTERUSER_USERTYPE_ISNULL_ERROR = "用户类型不能为空";
	public static final String DFFX_REGISTERUSER_MSG_ERROR_GETVERIFICATION = "请先获取手机验证码";
	public static final String DFFX_REGISTERUSER_MSG_ERROR_VERIFICATION = "手机验证码,校验不通过";
	public static final String DFFX_REGISTERUSER_COMPANYNAME_ISNULL_ERROR = "公司名称不能为空";
	public static final String DFFX_GETISTERUSER_COMPANY_EXIST_ERROR = "该公司已经被注册";
	public static final String DFFX_REGISTERUSER_LAWYERCERT_ISNULL_ERROR = "律师证件不能为空";
	public static final String DFFX_REGISTERUSER_LAWYERCERT_ERROR = "该律师资格证明已经被使用";
	public static final String DFFX_REGISTERUSER_PHONE_EXIST_ERROR = "该手机号码已经被注册";
	public static final String DFFX_REGISTERUSER_INVITER_NOT_EXIST = "邀请人不存在";
	public static final String DFFX_REGISTERUSER_MSG_OK = "注册成功";
	public static final String DFFX_REGISTERUSER_MSG_FAIL = "注册失败";

	// -------------------短信验证模板接口-----------------------//
	public static final String DFFX_SMSTEMPLET = "短信验证模板接口";
	public static final String DFFX_SMSTEMPLET_TYPE_IS_NOT_NULL = "发送短信类型不能为空";
	public static final String DFFX_SMSTAMPLET_PHONE_EXIST_ERROR = "该手机号码已被注册";
	public static final String DFFX_SMSTAMPLET_PHONE_NOT_EXIST_ERROR = "用户不存在";
	public static final String DFFX_SMSTAMPLET_GETKEY_FAIL = "令牌获取失败";
	public static final String DFFX_SMSTAMPLET_ENDVERIFICATION_MSG_FAIL = "短信验证模块,发送短信验证码失败";
	public static final String DFFX_SMSTAMPLET_GETVERIFICATION_MSG_OK = "验证码发送成功";
	public static final String DFFX_SMSTAMPLET_PHONE_NOT_SAME = "原手机号码不匹配";
	public static final String DFFX_SMSTAMPLET_OPERATE_TOO_OFTEN = "该号码短信发送过于频繁，请稍后操作";

	// ----------------用户登录接口--------------//
	public static final String DFFX_USERLOGIN = "用户登录接口";
	public static final String DFFX_USERLOGIN_CLIENTTYPE_ISNULL_ERROR = "客户端类型不能为空";
	public static final String DFFX_USERLOGIN_PHONEORUSERUID_ISNULL_ERROR = "手机号码或者用户账户不能为空";
	public static final String DFFX_USERLOGIN_PASSWORD_ISNULL_ERROR = "用户密码不能为空";
	public static final String DFFX_USERLOGIN_USERUID_NOTEXIST_ERROR = "用户不存在";
	public static final String DFFX_USERLOGIN_PASSWORD_ERROR = "用户密码不正确";
	public static final String DFFX_USERLOGIN_MSG_OK = "登录成功";
	public static final String DFFX_USERLOGIN_MSG_FAIL = "登录失败";
	public static final String DFFX_USERUID_MUST_IS_NUMBER = "登录账户必须是数字类型";

	// -------------------------订单接口错误提示信息--------------------------//
	public static final String DFFX_ORDER_ID_IS_NOT_NULL = "订单id不能为空!";
	public static final String DFFX_LOGIC_ERROR = "业务逻辑错误：";

	// -----------------------创建订单接口错误提示信息-------------------------//
	public static final String DFFX_SAVE_ORDER = "保存订单接口";
	public static final String DFFX_SAVE_ORDER_ERROR = "保存订单接口";
	public static final String DFFX_SAVE_ORDER_TITLE_IS_NOT_NULL = "标题不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_DESCRIPE_IS_NOT_NULL = "案件描述不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_TYPE_IS_NOT_NULL = "案件类型不能为空!";
	public static final String DFFX_SAVE_CONSULT_CHILDREN_IS_NOT_NULL = "咨询子类型别名不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_STYLE_IS_NOT_NULL = "案件专业不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_PHONE_IS_NOT_NULL = "客户电话不能为空!";
	public static final String DFFX_SAVE_ORDER_PAID_ISFREE_IS_NOT_NULL = "使用免费订单机会不能为空!";
	public static final String DFFX_SAVE_ORDER_PAID_AWARD_IS_NOT_NULL = "悬赏额度不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_ETIME_IS_NOT_NULL = "悬赏结束时间不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_WORK_YEAR_IS_NOT_NULL = "工作年限不能为空!";
	public static final String DFFX_SAVE_ORDER_LIMITLOW = "悬赏额度不能小于";
	public static final String DFFX_SAVE_ORDER_LIMITUP = "，且不能大于";
	public static final String DFFX_SAVE_ORDER_FB_INSUFFICIENT = "用户剩余法币不足！";
	public static final String DFFX_SAVE_ORDER_LIMIT_NOT_EX = "专业价格配置信息不存在！";
	public static final String DFFX_SAVE_ORDER_SUCCESS = "订单生成成功!";
	public static final String DFFX_SAVE_ORDER_FAIL = "订单生成失败!";
	public static final String DFFX_SAVE_ORDER_CASE_CITY_TYPE_IS_NOT_NULL = "城市类别不能为空!";
	public static final String DFFX_SAVE_ORDER_CASE_ETIME_IS_LESS_THAN_NOWTIEM = "悬赏结束时间不能小于当前时间!";
	public static final String DFFX_SAVE_FREE_ORDER_IS_FINISH = "免费机会已使用完!";
	public static final String DFFX_SAVE_FREE_PAID_ISFREE_NO_NULL = "是否免费不能为空，或者非免费订单";

	public static final String DFFX_SAVE_ORDER_LAWYERADDR_IS_NOT_NULL = "律师地址不能为空";
	public static final String DFFX_SAVE_ORDER_PRECISION_IS_NOT_NULL = "发单用户所在地经度不能为空";
	public static final String DFFX_SAVE_ORDER_LATITUDE_IS_NOT_NULL = "发单用户所在地维度不能为空";

	public static final String ORDER_STATUS_ACCEPT_CAREER = "委托订单，律师账好不能为空";

	// ---------------------获取用户类型接口错误提示信息-----------------------//
	public static final String DFFX_BUSINESS_TYPE = "获取业务类型接口";
	public static final String DFFX_BUSINESS_TYPE_SUCCESS = "业务类型获取成功!";
	public static final String DFFX_BUSINESS_TYPE_FAIL = "业务类型获取失败!";

	// --------------------保存律师抢单信息接口错误提示信息---------------------//
	public static final String DFFX_SAVE_GRABORDER = "律师抢单接口";
	public static final String DFFX_SAVE_GRABORDER_IS_NOT_REPEAT = "不能重复抢单!";
	public static final String DFFX_ORDER_IS_NOT_EXIST = "订单不存在";
	public static final String DFFX_GRAB_USERUID_IS_NOT_NULL = "发单用户账号不能为空!";
	public static final String DFFX_GRAB_LAWYERUID_IS_NOT_NULL = "抢单用户账号不能为空!";
	public static final String DFFX_SAVE_GRABORDER_IS_FULL = "抢单队列已满!";
	public static final String DFFX_SAVE_GRABORDER_SUCCESS = "用户（律师）抢单成功!";
	public static final String DFFX_SAVE_GRABORDER_FAIL = "用户（律师）抢单失败!";
	public static final String DFFX_SAVE_GRABORDER_SPECIFY_YES = "发单用户已指定抢单律师";
	public static final String DFFX_ORDER_STATUS_CANCEL = "订单已过期或用户已取消";

	// -------------------删除律师抢单信息接口错误提示信息---------------------//
	public static final String DFFX_DELETE_GRABORDER = "删除律师抢单信息接口";
	public static final String DFFX_DELETE_GRABORDER_ID_IS_NOT_NULL = "抢单id不能为空!";
	public static final String DFFX_DELETE_GRABORDER_NOT_EXIST = "抢单信息不存在!";
	public static final String DFFX_DELETE_GRABORDER_SUCCESS = "删除律师抢单信息成功!";
	public static final String DFFX_DELETE_GRABORDER_FAIL = "删除律师抢单信息失败!";

	// ----------------------申请付款接口错误提示信息-----------------------//
	public static final String DFFX_APPLY_PAYMENT = "申请付款接口";
	public static final String DFFX_APPLY_PAYMENT_APPLYPAID_IS_NOT_NULL = "申请金额不能为空!";
	public static final String DFFX_APPLY_PAYMENT_ERROR = "律师抢单信息不存在!";
	public static final String DFFX_APPLY_PAYMENT_REPEAT = "重复提交申请!";
	public static final String DFFX_PAID_AWARD_TYPE = "法援类型不能为空!";
	public static final String DFFX_APPLY_PAYMENT_SUCCESS = "申请付款成功!";
	public static final String DFFX_APPLY_PAYMENT_FAIL = "申请付款失败!";
	public static final String DFFX_NOT_POINT_LAWYER = "不是指定律师";
	public static final String DFFX_CANNOT_LAW_HELP = "非平台免费订单，不能选择法援";

	// ---------------------用户修改密码接口错误提示信息----------------------//
	public static final String DFFX_UPDATE_USER_PASSWORD = "用户修改密码接口";
	public static final String DFFX_OLD_PASSWORD_IS_NOT_NULL = "用户原密码不能为空!";
	public static final String DFFX_NEW_PASSWORD_IS_NOT_NULL = "用户新密码不能为空!";
	public static final String DFFX_ALTER_PASSWORD_TYPE = "修改密码类型不能为空!";
	public static final String DFFX_USER_PHONE_IS_NOT_NULL = "手机号码不能为空!";
	public static final String DFFX_PHONE_IS_NOT_SAME = "手机号码与预留手机号不匹配!";
	public static final String DFFX_OLD_PASSWORD_ERROR = "原始密码不正确!";
	public static final String DFFX_UPDATE_USER_PASSWORD_SUCCESS = "密码修改成功!";
	public static final String DFFX_UPDATE_USER_PASSWORD_FAIL = "修改密码失败!";
	public static final String DFFX_VERIFICATION_NOT_SAME = "验证码不正确";
	public static final String DFFX_VERIFICATION_IS_NOT_NULL = "验证码不能为空";
	public static final String DFFX_SETPAY_PASSWORD_SUCCESS = "设置密码成功";
	public static final String DFFX_SERPAY_PASSWORD_FAIL = "设置密码失败";
	public static final String DFFX_LOGIN_PASSWORD_NOT_SUCCESS = "登录密码不正确";
	public static final String DFFX_USER_EXIST_PAYPASSWORD_ERROR = "用户存在支付密码";
	public static final String DFFX_UPDATE_USER_PASSWORD_LESS_5 = "当日修改次数超过";
	public static final String DFFX_UPDATE_USER_PASSWORD_NOT_TYPE = "不存在的操作类型";
	public static final String DFFX_UPDATE_USER_PASSWORD_LOGINPASSWORD_FAIL = "登录密码不正确";
	public static final String DFFX_UPDATE_USER_PASSWORD_LOGINPASSWOTD_NOT_NULL = "登录密码不能为空";
	public static final String DFFX_UPDATE_USER_PASSWORD_VERIFY_SUCCESS = "密码验证成功!";
	public static final String DFFX_UPDATE_USER_PASSWORD_VERIFY_FAIL = "密码验证失败!";

	// -----------------------验证支付密码接口-----------------------//
	public static final String DFFX_VERIFYPAY = "验证支付密码接口";
	public static final String DFFX_VERIFYPAY_TOKEN_NOT_NULL_ERROR = "回话密令不能为空";
	public static final String DFFX_VERIFYPAY_PASWORD_NOT_NULL_ERROR = "支付密码不能为空";
	public static final String DFFX_VERIFYPAY_WALLET_NOT_EXIST_ERROR = "钱包信息不存在";
	public static final String DFFX_VERIFYPAY_PAYPASSWORD_MSG_FAIL = "支付密码验证失败";
	public static final String DFFX_VERIFYPAY_PAYPASSWORD_MAG_OK = "支付密码验证成功";

	// ------------------------查询免费订单使用情况----------------------//
	public static final String DFFX_GETFREEMAKEORDER = "查询免费订单使用情况";
	public static final String DFFX_GETDREEMAKEORDER_ORDERTYPE_NOT_NULL_ERROR = "订单类型不能为空";
	public static final String DFFX_GETFREEMAKEORDER_STARTTIME_NOT_NULL_ERROR = "开始时间不能为空";
	public static final String DFFX_GETFREEMAKEORDER_ENDTIME_NOT_NULL_ERROR = "结束时间不能为空";
	public static final String DFFX_GETFREEMAKEORDER_MSG_OK = "免费订单使用次数查询成功";
	public static final String DFFX_GETFREEMAKEORDER_MSG_FAIL = "免费订单使用次数查询失败";
	public static final String DFFX_GETFREEMAKEORDER_TKOEN_NOT_NULL_ERROR = "会话密令不能为空";
	public static final String DFFX_GETFREEMAKEORDER_MSG_VIP_NOT_EXIST = "vip不存在";
	public static final String DFFX_GETFREEMAKEORDER_MSG_VIP_IS_END = "vip已到期";
	public static final String DFFX_GETFREEMAKEORDER_USER_EXIST = "用户不存在";

	// --------------------------修改绑定手机号接口-----------------------//
	public static final String DFFX_ALTER_BIND_PHONE = "用户修改绑定手机号接口";
	public static final String DFFX_OLD_PHONE_IS_NOT_NULL = "用户原手机号不能为空";
	public static final String DFFX_NEW_PHONE_IS_NOT_NULL = "新手机号不能为空";
	public static final String DFFX_ALTER_BIND_PHONE_SUCCESS = "修改手机号码成功";
	public static final String DFFX_ALTER_BIND_PHONE_FAIL = "修改手机号码失败";

	// --------------------------发单用户确认订单接口-----------------------//
	public static final String DFFX_USER_CONFIRM_ORDER = "用户确认订单接口";
	public static final String DFFX_USER_UID_IS_NOT_NULL = "发单用户uid不能为空";
	public static final String DFFX_LAWYER_UID_NOT_NULL = "律师uid不能为空";
	public static final String DFFX_ORDER_ID_NOT_NULL = "订单id不能为空";
	public static final String DFFX_PAID_AWARD_NOT_NULL = "用户确认订单金额不能为空";
	public static final String DFFX_AWARD_TYPE_NOT_NULL = "法援类型不能为空";
	public static final String DFFX_CASE_TYPE = "案件类型不能为空";
	public static final String DFFX_USER_CONFIRM_ORDER_SUCCESS = "用户确认订单成功";
	public static final String DFFX_USER_CONFIRM_ORDER_FAIL = "用户确认订单失败";
	public static final String DFFX_PAID_IS_FREE = "免费类型不能为空";
	public static final String DFFX_MONEY_DISAFFINITY = "确定金额和律师申请金额不一致";
	public static final String DFFX_GREATER_MONEY = "确定金额和大于用户冻结金额";
	public static final String DFFX_EVALUATE_LEVEL_IS_NOT_NULL = "专业水平不能为空";
	public static final String DFFX_EVALUATE_EFFICIENCY_IS_NOT_NULL = "工作效率不能为空";
	public static final String DFFX_EVALUATE_ATTITUDE_IS_NOT_NULL = "服务态度不能为空";
	public static final String DFFX_EVALUATE_LEAVEMSG_IS_NOT_NULL = "评价留言不能为空";
	public static final String DFFX_WALLET_PASSWORD_IS_NOT_NULL = "支付密码不能为空";

	// ------------------------获取免费金额和下限额度接口---------------------//
	public static final String DFFX_GET_FREE_MONEY = "获取免费金额和下限额度接口";
	public static final String DFFX_GET_FREE_MONEY_FAIL = "获取免费金额和下限额度失败";
	public static final String DFFX_GET_FREE_MONEY_SUCCESS = "获取免费金额和下限额度成功";

	// -------------------------公众用户确认抢单律师接口-----------------------//
	public static final String DFFX_CONFIRM_GRABORDER_ORDER = "公众用户确认抢单律师接口";
	public static final String DFFX_CONFIRM_GRABORDER_ORDER_FAIL = "公众用户确认抢单律师失败";
	public static final String DFFX_CONFIRM_GRABORDER_ORDER_SUCCESS = "公众用户确认抢单律师成功";
	public static final String DFFX_GRABORDER_LAWYER_IS_NOT_EXIST = "律师不在抢单列表中";
	public static final String DFFX_GRABORDER_CANNOT_REPEAT_CONFIRM = "该订单已指定抢单律师";

	// --------------------------公众用户取消付款接口------------------------//
	public static final String DFFX_USER_CANCEL_PAYMENT = "公众用户取消付款接口";
	public static final String DFFX_CANCEL_TYPE_IS_NOT_NULL = "撤单类型不能为空";
	public static final String DFFX_CANCEL_REMARK_IS_NOT_NULL = "撤单备注不能为空";
	public static final String DFFX_USER_CANCEL_PAYMENT_FAIL = "公众用户取消付款失败";
	public static final String DFFX_USER_CANCEL_PAYMENT_SUCCESS = "公众用户取消付款成功";
	public static final String DFFX_USER_CANCEL_PAYMENT_OVERMUCH = "公众用户取消付款不能超过两次";

	// ------------------------获取前5个抢单律师的信息接口----------------------//
	public static final String DFFX_GET_GRABORDER_LAWYER = "获取前5个抢单律师信息接口";
	public static final String DFFX_GET_GRABORDER_LAWYER_FAIL = "获取前5个抢单律师信息失败";
	public static final String DFFX_GET_GRABORDER_LAWYER_SUCCESS = "获取前5个抢单律师信息成功";

	// --------------------------公众用户取消订单接口------------------------//
	public static final String DFFX_USER_CANCEL_ORDER = "公众用户取消订单接口";
	public static final String DFFX_USER_CANCEL_ORDER_FAIL = "用户取消订单失败";
	public static final String DFFX_USER_CANCEL_ORDER_SUCCESS = "用户取消订单成功";
	public static final String DFFX_USER_CANCEL_LAWYER_IS_ACCEPT = "该订单已被律师受理";
	public static final String DFFX_IS_NOT_USER_SELF = "非发单用户";

	// -------------------------获取用户支付列表接口------------------------//
	public static final String DFFX_USER_TRANSACTION_INFO_LIST = "获取用户支付列表接口";
	public static final String DFFX_TRANSACTION_TYPE_IS_NOT_NULL = "交易类型不能为空";
	public static final String DFFX_USER_TRANSACTION_INFO_LIST_FAIL = "获取用户支付列表失败";
	public static final String DFFX_USER_TRANSACTION_INFO_LIST_SUCCESS = "获取用户支付列表成功";

	// -------------------------获取用户交易详情接口------------------------//
	public static final String DFFX_USER_TRANSACTION_DETAILS = "获取用户交易详情接口";

	public static final String DFFX_USER_TRANSACTION_DETAILS_FAIL = "获取用户交易详情失败";
	public static final String DFFX_USER_TRANSACTION_DETAILS_SUCCESS = "获取用户交易详情成功";

	// -----------------------获取订单支付情况信息接口----------------------//
	public static final String DFFX_ORDER_PAID_INFO = "获取订单支付情况信息接口";
	public static final String DFFX_ORDER_PAID_INFO_SUCCESS = "获取订单支付情况信息成功";
	public static final String DFFX_ORDER_PAID_INFO_FAIL = "获取订单支付情况信息失败";

	// ------------------------获取用户积分列表接口----------------=-------//
	public static final String DFFX_SCORE_RECORD_LIST = "获取用户积分列表接口";
	public static final String DFFX_SCORE_TYPE_IS_NOT_NULL = "积分类型不能为空";
	public static final String DFFX_SCORE_RECORD_LIST_FAIL = "获取用户积分列表失败";
	public static final String DFFX_SCORE_RECORD_LIST_SUCCESS = "获取用户积分列表成功";

	// --------------------------律师确认受理接口----------------=-------//
	public static final String DFFX_LAWYER_CONFIRM_ACCEPT = "律师确认受理接口";
	public static final String DFFX_CANNOT_REPEAT_ACCEPT = "不能重复受理";
	public static final String DFFX_LAWYER_CONFIRM_ACCEPT_FAIL = "律师确认受理接口失败";
	public static final String DFFX_LAWYER_CONFIRM_ACCEPT_SUCCESS = "律师确认受理接口成功";
	public static final String DFFX_NOT_POINT_ACCEPT_LAWYER = "不是指定受理律师";
	public static final String DFFX_NOT_ACCEPT_ORDER = "不是委托订单";

	// --------------------------提现接口-----------------------------//
	public static final String DFFX_DRAWMONEY = "提现接口";
	public static final String DFFX_DRAWMONEY_WAIT = "你的申请已经提交,等待系统处理...";
	public static final String DFFX_DRAWMONEY_CASH_NOT_ENOUGH = "提现失败,余额不足";
	public static final String DFFX_DRAWMONEY_PSW_ERROR = "提现失败 ,密码错误";
	public static final String DFFX_DRAWMONEY_ERROR = "出现异常";
	public static final String DFFX_DRAWMONEY_DRAWTYPE_NOT_NULL = "提现类型不能为空";
	public static final String DFFX_DEAWMONEY_FAIL = "提现失败";

	// ------------------------查看vip详情接口--------------------------//
	public static final String DFFX_GETVIPDES_INFO = "查看vip详情接口";
	public static final String DFFX_GETVIPDES_OK = "获取信息成功";
	public static final String DFFX_GETVIPDES_FAIL = "获取信息失败";

	// ------------------------用户购买vip接口--------------------------//
	public static final String DFFX_SETUSERVIP = "购买用户vip接口";
	public static final String DFFX_SETUSERVIP_OK = "购买vip成功";
	public static final String DFFX_SETUSERVIP_FAIL = "购买vip失败";
	public static final String DFFX_SETUSERVIP_CASH_NOT_ENOUGH = "用户余额不足";
	public static final String DFFX_SETUSERVIP_IS_VIP = "您已经是vip会员,会员升级等待后续开发";
	public static final String DFFX_SETUSERVIP_ERROR = "购买会员异常";
	public static final String DFFX_SETUSERVIP_PSW_ERROR = "支付密码错误";
	public static final String DFFX_SETUSERVIP_ERR_TYPE = "购买的会员类型不能为0";
	public static final String DFFX_SETUSERVIP_ERR_TYPE_NOT_NULL = "购买的会员类型不能为空";

	// -------------------------获取用户所有银行信息--------------------------//
	public static final String DFFX_GETBANKLIST_INFO = "获取我的所有银行信息";
	public static final String DFFX_GETBANKLIST_OK = "获取我的银行卡信息成功";
	public static final String DFFX_GETBANKLIST_FAIL = "获取银行卡信息失败";

	// ----------------------添加用户银行卡---------------------//
	public static final String DFFX_ADDMYBANK_INFO = "添加我的银行卡";
	public static final String DFFX_ADDMYBANK_OK = "添加银行卡成功";
	public static final String DFFX_ADDMYBANK_FAIL = "添加银行卡失败";
	public static final String DFFX_ADDMYBANK_CARE_EXIST = "已存在的银行卡";
	public static final String DFFX_ADDMYBANK_BANKNAME_NOT_EXIST = "银行名称不能为空";
	public static final String DFFX_ADDMYBANK_BANKNUM_NOT_EXIST = "银行卡号不能为空";
	public static final String DFFX_ADDMYBANK_USERNAME_NOT_EXIST = "银行卡对应的真实姓名不能为空";
	public static final String DFFX_ADDMYBANK_BANKBRANCHNAME_NOT_EXIST = "开户支行名称不能为空";
	public static final String DFFX_ADDMYBANK_USERPHONE_NOT_EXIST = "银行预留手机号码不能为空";
	public static final String DFFX_ADDMYBANK_BANKCARENUM_MORE = "添加的银行卡数量大于";

	// -----------------------获取提现记录------------------------------//
	public static final String DFFX_GETCASHLOG = "获取提现记录";
	public static final String DFFX_GETCASHLOG_OK = "获取提现日志成功";
	public static final String DFFX_GETCASHLOG_FAIL = "获取提现日志失败";

	// --------------------获取默认银行卡信息----------------------//
	public static final String DFFX_SETUSERDEFBANK = "设置用户默认银行卡";
	public static final String DFFX_SETUSERDEFBANK_OK = "设置用户默认银行卡成功";
	public static final String DFFX_SETUSERDEFBANK_FAIL = "设置用户默认银行卡失败";

	// ---------------------删除银行卡接口-----------------------//
	public static final String DFFX_DELBANKINFO = "删除银行卡接口";
	public static final String DFFX_DELBANKINFO_OK = "删除银行卡成功";
	public static final String DFFX_DELBANKINFO_FAIL = "删除银行卡失败";
	public static final String DFFX_DELBANKINFO_NOT_EXIST = "不存在的银行卡";
	public static final String DFFX_DELBANKINFO_EXCEPTION = "删除银行卡异常";

	// --------------------------用户获取默认银行卡-----------------------------//
	public static final String DFFX_GETDEFUSERBANK = "获取用户默认银行卡";
	public static final String DFFX_GETDEFUSERBANK_NOT_EXIST = "您还没有设置默认银行卡";
	public static final String DFFX_GETDEFUSERBANK_OK = "获取用户银行卡成功";
	public static final String DFFX_GETDEFUSERBANK_FAIL = "获取用户银行卡失败";

	// --------------------------快钱用户充值--------------------------//
	public static final String DFFX_BILLPAYPC = "快钱用户PC充值接口";
	public static final String DFFX_BILLPAYPHONE = "快钱用户phone充值接口";
	public static final String DFFX_BILLPAYPC_OK = "ok";
	public static final String DFFX_BILLPAYPHONE_OK = "ok";
	public static final String DFFX_BILLPAYPC_FAIL = "fail";
	public static final String DFFX_BILLPAYPHONE_FAIL = "fail";

	// ---------------------------alipay充值接口pc---------------------------//
	public static final String DFFX_ALIPAYPC = "ailipayPC用户充值";
	public static final String DFFX_ALIPAY_OK = "ok";
	public static final String DFFX_ALIPAY_FAIL = "fail";
	public static final String DFFX_ALIPAYPHONE = "alipayPhone用户充值";

	// -------------------------订单回复接口-------------------------//
	public static final String DFFX_CASEREPLY = "订单回复接口";
	public static final String DFFX_CASEREPLY_ORDERID_NOT_NULL = "订单id不能为空";
	public static final String DFFX_CASEREPLY_OK = "订单回复成功";
	public static final String DFFX_CASEREPLY_FAIL = "订单回复失败";

	// -----------------------获取订单支付接口-----------------------//
	public static final String DFFX_GETORDERPAID = "获取订单支付接口";
	public static final String DFFX_GETORDERPAID_ORDERID_NOT_NULL = "订单id不能为空";
	public static final String DFFX_GETORDERPAID_OK = "获取订单支付成功";
	public static final String DFFX_GETORDERPAID_FAIL = "获取订单支付失败";

	// ----------------------------获取律师对用银行----------------------------//
	public static final String DFFX_LAWYERPUBLICBANK = "获取律师对公银行接口";
	public static final String DFFX_LAWYERPUBLICBANK_OK = "获取律师对公银行成功";
	public static final String DFFX_LAWYERPUBLICBANK_FAIL = "获取律师对公银行失败";

	// ----------------------------获取我的信息--------------------------//
	public static final String DFFX_GETMEINFO = "获取我的信息";
	public static final String DFFX_GETMEINFO_OK = "获取我的信息成功";
	public static final String DFFX_GETMEINFO_FAIL = "获取我的信息失败";
	public static final String DFFX_GETMEINFO_USER_NOT_NULL = "用户类型不能为空";

	// ----------------------------获取用户认证信息-----------------------------//
	public static final String DFFX_GETUSERCHECKINFO = "获取用户认证资料";
	public static final String DFFX_GETUSERCHECKINFO_OK = "获取用户认证资料成功";
	public static final String DFFX_GETUSERCHECKINFO_FAIL = "获取用户认证资料失败";

	// ----------------------------查看用户是否存在支付密码------------------------//
	public static final String DFFX_EXISTPWD = "是否存在支付密码接口";
	public static final String DFFX_EXISTPWD_OK = "成功";
	public static final String DFFX_EXISTPWD_FAIL = "失败";

	// --------------------------查询用户所有免费使用情况信息接口------------------------//
	public static final String DFFX_GET_ALL_FREE_MAKE_ORDER = "查询用户所有免费使用情况信息接口";
	public static final String DFFX_GET_ALL_FREE_MAKE_ORDER_SUCCESS = "查询用户所有免费使用情况信息成功";
	public static final String DFFX_GET_ALL_FREE_MAKE_ORDER_FAIL = "查询用户所有免费使用情况信息失败";

	// --------------------------获取邀请的用户信息------------------------------------//
	public static final String DFFX_INVITER = "获取邀请的用户信息";
	public static final String DFFX_INVITER_OK = "获取邀请的用户信息成功";
	public static final String DFFX_INVITER_FAIL = "获取邀请的用户信息失败";
	public static final String DFFX_INVITER_USERUID_NOT_NULL = "用户法宝号不能为空";
	public static final String DFFX_INVITER_TOKEN_NOT_NULL = "用户token不能为空";
	public static final String DFFX_INVITER_LOGINTYPE_NOT_NULL = "用户登录类型不能为空";

	// --------------------------用户修改绑定手机验证码校验接口------------------------//
	public static final String DFFX_AUTH_VERIFY_CODE = "用户修改绑定原手机验证码校验接口";
	public static final String DFFX_AUTH_VERIFY_CODE_SUCCESS = "用户修改绑定原手机验证码校验成功";
	public static final String DFFX_AUTH_VERIFY_CODE_FAIL = "用户修改绑定原手机验证码校验失败";

	// ----------------------用户获取订单查看状态----------------------------//
	public static final String DFFX_UNREADORDERSTATE = "用户获取未读订单状态";
	public static final String DFFX_UNREADORDERSTATE_OK = "获取未读状态成功";
	public static final String DFFX_UNREADORDERSTATE_FAIL = "获取未读状态失败";

	// --------------------------用户获取咨询列表----------------------------//
	public static final String DFFX_ADVICEORDERLIST = "用户获取咨询列表";
	public static final String DFFX_ADVICEORDERLIST_OK = "用户获取咨询列表成功";
	public static final String DFFX_ADVICEORDERLIST_FAIL = "用户获取咨询列表失败";
	public static final String DFFX_ADVICEORDERLIST_STATE_NULL="订单状态不能为空";

	// ------------------------用户获取咨询详情-------------------------//
	public static final String DFFX_ADVICEDETAILLIST = "用户获取咨询详情";
	public static final String DFFX_ADVICEDETAILLIST_OK = "用户获取咨询详情成功";
	public static final String DFFX_ADVICEDETAILLIST_FAIL = "用户获取咨询详情失败";
	public static final String DFFX_ADVICEDETAILLIST_ADVICE_ID_NULL ="咨询订单id不能为空";
	
	//-------------------------保存用户咨询接口-------------------------//
	public static final String DFFX_SAVE_USER_CONSULT = "保存用户咨询信息接口";
	public static final String DFFX_SAVE_USER_CONSULT_SUCCESS = "保存用户咨询信息成功";
	public static final String DFFX_SAVE_USER_CONSULT_FAIL = "保存用户咨询信息失败";
	public static final String DFFX_CONSULT_USERNAME_IS_NOT_NULL = "用户名不能为空";
	public static final String DFFX_CONSULT_CONSULT_CONTEXT_IS_NOT_NULL = "咨询内容不能为空";
	public static final String DFFX_CONSULT_CONSULT_TYPE_IS_NOT_NULL = "咨询类型不能为空";
	
	//-----------------------保存用户咨询详情接口------------------------//
	public static final String DFFX_SAVE_USER_CONSULT_DETAIL = "保存用户咨询详情信息接口";
	public static final String DFFX_SAVE_USER_CONSULT_DETAIL_SUCCESS = "保存用户咨询详情信息成功";
	public static final String DFFX_SAVE_USER_CONSULT_DETAIL_FAIL = "保存用户咨询详情信息失败";
	public static final String DFFX_CONSULT_DETAIL_CONTEXT_OR_FILE_IS_NOT_NULL = "咨询内容或咨询上传文件不能为空";
	public static final String DFFX_CONSULT_DETAIL_ADVICE_ID_IS_NOT_NULL = "咨询主id不能为空";
	public static final String ADVICE_ORDER_NOT_EXIST = "咨询主内容不存在";
	public static final String ADVICE_ORDER_CLOSE = "该咨询内容已关闭";
	
	//-----------------------保存用户反馈信息接口----------------------//
	public static final String DFFX_SAVE_USER_ADVICE = "保存用户反馈信息接口";
	public static final String DFFX_SAVE_USER_ADVICE_SUCCESS = "保存用户反馈信息成功";
	public static final String DFFX_SAVE_USER_ADVICE_FAIL = "保存用户反馈信息失败";
	public static final String DFFX_ADVICE_CONTEXT_IS_NOT_NULL = "意见反馈内容不能为空";
	

	//-------------------获取系统版本信息----------------------//
	public static final String DFFX_GETSYSTEMVERSION = "获取系统版本信息";
	public static final String DFFX_GETSYSTEMVERSION_OK ="获取系统版本信息成功";
	public static final String DFFX_GETSYSTEMVERSION_FAIL="获取系统版本信息失败";
	public static final String DFFX_GETSYSTEMVERSION_CLIENTTYPE_NULL="客户端登录类型不能为空";
	public static final String DFFX_GETSYSTEMVERSION_CLIENTVERSION_NULL= "客户端版本号不能为空";

	//------------------------发单获取下限额度接口---------------------//
	public static final String DFFX_GET_LOWER_VALUE = "获取下限额度接口";
	public static final String DFFX_GET_LOWER_VALUE_SUCCESS = "获取下限额度成功";
	public static final String DFFX_GET_LOWER_VALUE_FAIL = "获取下限额度失败";
	
	//-----------------------获取咨询业务子类型接口--------------------//
	public static final String DFFX_GET_SKILL_CHILDREN_LIST = "获取咨询业务子类型接口";
	public static final String DFFX_GET_SKILL_CHILDREN_LIST_SUCCESS = "获取咨询业务子类型成功";
	public static final String DFFX_GET_SKILL_CHILDREN_LIST_FAIL = "获取咨询业务子类型失败";
	public static final String DFFX_SKILL_ID_IS_NOT_NULL = "业务类型不能为空";
	
	//-------------------------保存临时订单接口---------------------//
	public static final String DFFX_SAVE_INTERIM_ORDER = "保存临时订单接口";
	public static final String DFFX_SAVE_INTERIM_ORDER_SUCCESS = "保存临时订单成功";
	public static final String DFFX_SAVE_INTERIM_ORDER_FAIL = "保存临时订单失败";
	
	public static final String DFFX_USER_PAYMENT ="用户支付接口";
	public static final String DFFX_USER_PAYMENT_OK ="成功";
	public static final String DFFX_USER_PAYMENT_FAIL = "失败";
	public static final String DFFX_USER_PAYMENT_ORDERSN_NOT_EXIST="该订单不存在或者已经失效";
	public static final String DFFX_USER_PAYMENT_WALLETCASH_NOTENOUGH ="钱包余额不足";
	public static final String DFFX_USER_PAYMENT_PARAME_ERROR ="请更换其他方式充值";
	public static final String DFFX_USER_PAYMENT_CREATEORDER_FAIL ="生成订单失败,消费金额已退回到您的余额账户";
	
	
	
}
