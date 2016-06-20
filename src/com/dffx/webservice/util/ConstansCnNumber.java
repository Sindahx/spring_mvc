package com.dffx.webservice.util;

public class ConstansCnNumber {

	// 公共部分
	public static final int DFFX_PARAM_ERROR = 1010001; // 参数格式有误
	public static final int DFFX_CHAR_KEY_ERROR = 1010002; // 会话密令错误
	public static final int DFFX_VERIFYTOKEN_ERROR = 1010003; // 会话密令验证失败
	public static final int DFFX_USERUID_ISNULL_ERROR = 1010004; // 用户帐号不能为空
	public static final int DFFX_PHONE_ISNULL_ERROR = 1010005; // 手机号码不能为空
	public static final int DFFX_FREE_CONFIG_NOT_EXIST = 1010006; // 免费次数配置信息不存在
	public static final int DFFX_FREE_IS_USE = 1010007; // 免费次数已使用完
	public static final int DFFX_CODE_TYPE_IS_NOT_NULL = 1010008; // 验证码类型不能为空
	public static final int DFFX_VERIFY_CODE_IS_NOT_NULL = 1010009; // 验证码不能为空
	public static final int DFFX_VERIFY_CODE_ERROR = 1010010; // 验证码不正确
	public static final int DFFX_ORDER_STATE_ERROR = 1010011; // 订单状态不正确
	public static final int DFFX_IS_NOT_POINT_LAWYER = 1010012; // 不是指定律师!
	public static final int DFFX_PAGE_START_INDEX_IS_NOT_NULL = 1010013; // 分页查询起点位置不能为空
	public static final int DFFX_PAGE_SIZE_IS_NOT_NULL = 1010014; // 每页条数不能为空
	public static final int DFFX_ORDERSN_IS_NOT_NULL = 1010015; // 订单编号不能为空
	public static final int DFFX_LAWYER_IS_NOT_AUTH = 1010016; // 律师未被认证
	public static final int DFFX_WALLET_PASSWORD_IS_ERROR = 1010017; // 支付密码不正确
	public static final int DFFX_PLEASE_SET_PASSWORD = 1010018; // 请先设置支付密码
	public static final int DFFX_ORDER_ID_IS_NOT_NULL = 1010019; // 订单id不能为空
	public static final int DFFX_LOGIC_ERROR = 1010020; // 业务逻辑错误
	public static final int DFFX_RESID_CONNECTION_ERROR = 1010021; // redis 连接出错
	public static final int DFFX_PLEASE_SET_PASSWORD_ERROR_BEYOND_LIMIT = 1010022; // 当天支付密码输入错误次数超过限制次数

	public static final int DFFX_GETUSER = 10000;// 获取用户信息接口
	public static final int DFFX_GETUSER_MSG_OK = 1000000;// 获取用户信息成功
	public static final int DFFX_GETUSER_MSG_FAIL = 1000001;// 获取用户信息失败
	public static final int DFFX_GETUSER_USERTYPE_NOT_EXIST = 1000002;// 不存在的用户类型
	public static final int DFFX_GETUSER_UPDATETIME_NOT_NULL = 1000003;// 更新时间不能为空
	public static final int DFFX_GETUSER_OPTTYPE_NOT_NULL = 1000004;// 操作类型不能为空
	public static final int DFFX_GETUSER_GUESTUID_NOT_NULL = 1000005;// 需要查询的用户id
	// 不能为空

	public static final int DFFX_ISCHECK = 10001;// 用户获取认证状态接口
	public static final int DFFX_ISCHECK_OK = 1000100;// 获取状态成功
	public static final int DFFX_ISCHECK_FAIL = 1000101;// 获取状态失败

	public static final int DFFX_GETACCOUNT = 10002;// 获取用户登录接口
	public static final int DFFX_GETACCOUNT_MSG_FAIL = 1000200;// 获取用户信息成功
	public static final int DFFX_GETACCOUNT_MSG_OK = 1000201;// 获取用户信息失败

	public static final int DFFX_GETLAWYER = 10003;// 律师信息接口
	public static final int DFFX_GETLAWYER_MSG_OK = 1000300;// 获取律师信息成功
	public static final int DFFX_GETLAWYER_MSG_FAIL = 1000301;// 获取律师信息失败
	public static final int DFFX_SETLAWYER_MSG_FAIL = 1000302;// 设置律师信息失败
	public static final int DFFX_SETLAWYER_MSG_FAIL_USER_NOT_EXIST = 1000303;// 设置律师信息失败,律师不存在
	public static final int DFFX_SETLAWYER_MSG_OK = 1000304;// 设置律师信息成功
	public static final int DFFX_LAWYER_UPDATETIME_NOT_NULL = 1000305;// 更新时间不能为空

	public static final int DFFX_GETCOMPANY = 10004;// 获取企业信息接口
	public static final int DFFX_GETCOMPAMY_MSG_OK = 1000400;// 获取企业信息成功
	public static final int DFFX_GETCOMPANY_MSG_FAIL = 1000401;// 获取企业信息失败
	public static final int DFFX_SERCOMPANY_MSG_FAIL = 1000402;// 设置企业信息失败
	public static final int DFFX_SERCOMPANY_MSG_FAIL_USER_NOTEXIST = 1000403;// 设置企业信息失败,企业信息不存在
	public static final int DFFX_SETCOMPANY_MSG_OK = 1000404;// 设置企业信息成功

	public static final int DFFX_GETVERIFICATION = 10005;// 获取验证码接口
	public static final int DFFX_GETVERIFICATION_MSG_OK = 1000500;// 获取验证码成功
	public static final int DFFX_GETVERIFICATION_MSG_FAIL = 1000501;// 获取验证码失败

	public static final int DFFX_GETQRCODE = 10006;// 获取二维码接口
	public static final int DFFX_GETQRCODE_MSG_OK = 1000600;// 获取二维码成功
	public static final int DFFX_GETQRCODE_MSG_FAIL = 1000601;// 获取二维码失败

	public static final int DFFX_SETUSER = 10007;// 设置用户信息接口
	public static final int DFFX_SERUSER_MSG_OK = 1000700;// 设置用户信息成功
	public static final int DFFX_SETUSER_MSG_FAIL = 1000701;// 设置用户信息是失败
	public static final int DFFX_SETUSER_MSG_FAIL_USER_NOTEXIST = 1000702;// 设置用户信息是失败,用户不存在
	public static final int DFFX_SETUSER_ERROR = 1000703;// 设置用户信息异常
	public static final int DFFX_SETUSER_TYPE_NOT_EXIST = 1000704; // 不存在的操作类型

	public static final int DFFX_LAWYERISCHECK = 10008;// 律师认证接口
	public static final int DFFX_LAWYERISCHECK_OK = 1000800;// 律师认证成功
	public static final int DFFX_LAWYERISCHECK_FAIL = 1000801;// 律师认证失败
	public static final int DFFX_LAWYERISCHECK_WAIT = 1000802;// 用户资料正在审核中
	public static final int DFFX_LAWYERISCHECK_CERT_FULL = 1000803;// 律师认证的专业已经有2个了
	public static final int DFFX_LAWYERISCHECK_CERT_CHAT = 1000804;// 保存数据到即时通讯失败
	public static final int DFFX_LAWYERISCHECK_CERT_LINK_FAIL = 1000805;// 保存律师链接失败
	public static final int DFFX_LAWYERISCHECK_CERT_ADD_FAIL = 1000806;// 保存律师地址失败
	public static final int DFFX_LAWYERISCHECK_CERT_DATA_FAIL = 1000807;// 保存律师信息失败
	public static final int DFFX_LAWYERISCHECK_CERT_STATU_FAIL = 1000808;// 更改认证状态失败
	public static final int DFFX_LAWYERISCHECK_OFFICE_NULL = 1000809;// 律师事务所名称不能为空
	public static final int DFFX_LAWYERISCHECK_SKILLID_NULL = 1000810;// 律师专业不能为空
	public static final int DFFX_LAWYERISCHECK_WORKTIME_NULL = 1000811;// 律师职业年限不能为空
	public static final int DFFX_LAWYERISCHECK_OFFICEPHONE_NULL = 1000812;// 律师事务所电话不能空
	public static final int DFFX_LAWYERISCHECK_BANKCODE_NULL = 1000813;// 律师对公账号不能为空
	public static final int DFFX_LAWYERISCHECK_BANKNAME_NULL = 1000814;// 律师对公银行名称不能为空
	public static final int DFFX_LAWYERISCHECK_CERTCODE_NULL = 1000815;// 律师职业资格证号不能为空
	public static final int DFFX_LAWYERISCHECK_CERT_NULL = 1000816;// 律师职业资格证不能为空
	public static final int DFFX_LAWYERISCHECK_NAME_NULL = 1000817;// 律师真实姓名不能为空
	public static final int DFFX_LAWYERISCHECK_ORDERAREA_NULL = 1000818;// 律师接单地区不能为空
	public static final int DFFX_LAWYERISCHECK_BANKNAME_LENGTH_ISLONG = 1000819; // 银行名称太长
	public static final int DFFX_LAWYERISCHECK_WORKTIME_ERROR = 1000920; // 律师工作年限不能大于当前时间

	public static final int DFFX_COMPANYISCHECK = 10009;// 企业认证接口
	public static final int DFFX_COMPANYISCHECK_OK = 1000900;// 企业认证成功
	public static final int DFFX_COMPANYISCHECK_FAIL = 1000901;// 企业认证失败
	public static final int DFFX_COMPANYISCHECK_CERT_LINK_FAIL = 1000902;// 保存企业链接失败
	public static final int DFFX_COMPANYISCHECK_CERT_INFO_FAIL = 1000903;// 保存企业信息失败
	public static final int DFFX_COMPANYISCHECK_CERT_STATE_FAIL = 1000904;// 保存认证状态失败
	public static final int DFFX_COMPANYISCHECK_CERT_WAIT = 1000905;// 企业资料正在审核中
	public static final int DFFX_COMPANYISCHECK_CERT_CHAT = 1000906;// 保存数据到即时通讯失败
	public static final int DFFX_COMPANYISCHECK_COMPANYCERT_NULL = 1000907;// 执业证不能为空
	public static final int DFFX_COMPANYISCHECK_COMPANYCERTCODE_NULL = 1000908;// 执业证号码不能为空
	public static final int DFFX_COMPANYISCHECK_COMPANYNAME_NULL = 1000909;// 企业名称不能为空

	public static final int DFFX_USERISCHECK = 10010;// 用户认证接口
	public static final int DFFX_USERISCHECK_OK = 1001000;// 用户认证成功
	public static final int DFFX_USERISCHECK_FAIL = 1001001;// 用户认证失败
	public static final int DFFX_USERISCHECK_WAIL = 1001002;// 用户资料正在审核中
	public static final int DFFX_USERISCHECK_NOT_VALID = 1001003;// 不是有效的身份证号码
	public static final int DFFX_USERISCHECK_EXIST = 1001004;// 该身份证号码已被使用
	public static final int DFFX_USERISCEHCK_IDENTITY_NULL = 1001005;// 身份证号不能为空
	public static final int DFFX_USERISCHECK_NAME_NULL = 1001006;// 用户姓名不能为空
	public static final int DFFX_USERISCHECK_SAVE_INFO_FAIL = 1001007;// 保存认证信息失败
	public static final int DFFX_USERISCHECK_SAVE_STATE_FAIL = 1001008;// 保存认证状态失败

	public static final int DFFX_UPLOADFILE = 10011;// 上传文件接口
	public static final int DFFX_UPLOADFILE_MSG_OK = 1001100;// 上传文件成功
	public static final int DFFX_UPLOADFILE_MSG_FAIL = 1001101;// 上传文件失败
	public static final int DFFX_UPLOADFILE_MSG_UPLOAD = 1001102;// 正在上传...
	public static final int DFFX_UPLOADFILE_MSG_UPLOAD_FINISHED = 1001103;// 上传结束
	public static final int DFFX_UPLOADFILE_FILENAME_NOT_NULL = 1001104;// 文件名不能为空"
	public static final int DFFX_UPLOADFILE_FILELENGTH_NOT_NULL = 1001105;// 文件长度不能为空
	public static final int DFFX_UPLOADFILE_FILETYPE_NOT_NULL = 1001106;// 文件类型不能为空
	public static final int DFFX_UPLOADFILE_PORTFIX_ERROR = 1001107;// 文件后缀名错误

	public static final int DFFX_DOWNLOADFILE = 10012;// 下载文件接口
	public static final int DFFX_DOWNLOADFILE_MSG_OK = 1001200;// 下载文件成功
	public static final int DFFX_DOWNLOADFILE_MSG_FAIL = 1001201;// 下载文件失败
	public static final int DFFX_DOWNLOADFILE_FILE_IS_NOT_EXIST = 1001202;// 文件不存在

	public static final int DFFX_GETUSERORDER = 10013;// 获取用户订单接口
	public static final int DFFX_GETUSERORDER_MSG_OK = 1001300;// 获取用户订单成功
	public static final int DFFX_GETUSERORDER_MSG_FAIL = 1001301;// 获取订单失败

	public static final int DFFX_GETORDERDETAILS = 10014;// 获取订单详情接口
	public static final int DFFX_GETOEDERDETAILS_MSG_OK = 1001400;// 获取订单详情成功
	public static final int DFFX_GETORDERDETAILS_MSG_FAIL = 1001401;// 获取订单详情失败
	public static final int DFFX_GETOEDERDETAILS_EXIST = 1001402;// 该订单已经被其他律师处理
	public static final int DFFX_GETOEDERDETAILS_TIMEPOUT = 1001403;// 该订单已经过期
	public static final int DFFX_GETOEDERDETAILS_USER_CANCEL = 1001404;// 用户已取消该订单

	public static final int DFFX_GETCASETYPECOUNT = 10015;// 获取订单类型数量接口
	public static final int DFFX_GETCASETYPECOUNT_MSG_OK = 1001500;// 获取订单类型数量成功
	public static final int DFFX_GETCASETYPECOUNT_MSG_FAIL = 1001501;// 获取订单类型数量失败

	public static final int DFFX_GRABCASELIST = 10016;// 获取抢单list接口
	public static final int DFFX_GRABCASELIST_MSG_OK = 1001600;// 获取list 成功
	public static final int DFFX_GRABCASELIST_MSG_FAIL = 1001601;// 获取list 失败
	public static final int DFFX_GRABCASELIST_TYPE_NOT_NULL = 1001602;// 案件类型不能为空

	public static final int DFFX_ADDUSERCONFIG = 10017;// 添加用户配置接口
	public static final int DFFX_ADDUSERCONFIG_MSG_OK = 1001700;// 配置文件插入成功
	public static final int DFFX_ADDUSERCONFIG_MSG_FAIL = 1001701;// 配置文件插入失败
	public static final int DFFX_ADDUSERCONFIG_CONFIG_DOUBLE_ERROR = 1001702;// 不能重复添加配置

	public static final int DFFX_UPDATEUSERCONFIG = 10018;// 修改用户配置接口
	public static final int DFFX_UPDATEUSERCONFIG_MSG_OK = 1001800;// 配置文件修改成功
	public static final int DFFX_UPDATEUSERCONFIG_MSG_FAIL = 1001801;// 配置文件修改失败
	public static final int DFFX_UPDATEUSERCONFIG_TOKEN_ISNULL_ERROR = 1001802;// 用户口令不能为空
	public static final int DFFX_UPDATEUSERCONFIG_USERID_ISNULL_ERROR = 1001803;// 用户帐号不能为空
	public static final int DFFX_UPDATEUSERCONFIG_MSG_NOT_EXIST = 1001804;// 配置信息不存在

	public static final int DFFX_SENDALTERPWDCODE = 10019;// 修改密码,短信模板接口
	public static final int DFFX_SENDALTERPWDCODE_GETVERIFICATION_MSG_OK = 1001900;// 获取验证码成功
	public static final int DFFX_SENDALTERPWDCODE_PARAM_ERROR = 1001901;// 修改密码，短信验证模板参数格式有误
	public static final int DFFX_SENDALTERPWDCODE_GETKEY_MSG_FAIL = 1001902;// 短信模板获取令牌失败
	public static final int DFFX_SENDALTERPWDCODE_SENDVERIFICATION_MSG_FAIL = 1001903;// 修改密码，发送短信验证码失败
	public static final int DFFX_SMSTEMPLET_TYPE_IS_NOT_NULL = 1001904; // 发送短信类型不能为空
	public static final int DFFX_SMSTEMPLET_SEND_MESSAGE_TOO_MANY = 1001905; // 当天发送短信次数过多

	public static final int DFFX_REGISTERUSER = 10020;// 用户注册接口
	public static final int DFFX_REGISTERUSER_MSG_OK = 1002000;// 注册成功
	public static final int DFFX_REGISTERUSER_MSG_FAIL = 1002001;// 注册失败
	public static final int DFFX_REGISTERUSER_INVITER_NOT_EXIST = 1002002;// 邀请人不存在
	public static final int DFFX_REGISTERUSER_PHONE_EXIST_ERROR = 1002003;// 该手机号码已经被注册
	public static final int DFFX_REGISTERUSER_LAWYERCERT_ERROR = 1002004;// 该律师资格证明已经被使用
	public static final int DFFX_REGISTERUSER_LAWYERCERT_ISNULL_ERROR = 1002005;// 律师证件不能为空
	public static final int DFFX_GETISTERUSER_COMPANY_EXIST_ERROR = 1002006;// 该公司已经被注册
	public static final int DFFX_REGISTERUSER_COMPANYNAME_ISNULL_ERROR = 1002007;// 公司名称不能为空
	public static final int DFFX_REGISTERUSER_MSG_ERROR_VERIFICATION = 1002008;// 手机验证码,校验不通过
	public static final int DFFX_REGISTERUSER_MSG_ERROR_GETVERIFICATION = 1002009;// 请先获取手机验证码
	public static final int DFFX_REGISTERUSER_USERTYPE_ISNULL_ERROR = 1002010;// 用户类型不能为空
	public static final int DFFX_REGISTERUSER_VERIFICATION_ISNULL_ERROR = 1002011;// 验证码不能为空
	public static final int DFFX_REGISTERUSER_PASSWORD_ISNULL_ERROR = 1002012;// 用户密码不能为空

	public static final int DFFX_SMSTEMPLET = 10021;// 短信验证模板接口
	public static final int DFFX_SMSTAMPLET_GETVERIFICATION_MSG_OK = 1002100;// 验证码发送成功
	public static final int DFFX_SMSTAMPLET_ENDVERIFICATION_MSG_FAIL = 1002101;// 短信验证模块,发送短信验证码失败
	public static final int DFFX_SMSTAMPLET_GETKEY_FAIL = 1002102;// 令牌获取失败
	public static final int DFFX_SMSTAMPLET_PHONE_NOT_EXIST_ERROR = 1002103;// 用户不存在
	public static final int DFFX_SMSTAMPLET_PHONE_NOT_SAME = 1002104;// 原手机号码不匹配
	public static final int DFFX_SMSTAMPLET_PHONE_EXIST_ERROR = 1002105;// 该手机号码已被注册
	public static final int DFFX_SMSTAMPLET_OPERATE_TOO_OFTEN = 1002106;// 该号码短信发送过于频繁，请稍后操作

	public static final int DFFX_USERLOGIN = 10022;// 用户登录接口
	public static final int DFFX_USERLOGIN_MSG_OK = 1002200;// 登录成功
	public static final int DFFX_USERLOGIN_MSG_FAIL = 1002201;// 登录失败
	public static final int DFFX_USERUID_MUST_IS_NUMBER = 1002202;// 登录账户必须是数字类型
	public static final int DFFX_USERLOGIN_PASSWORD_ERROR = 1002203;// 用户密码不正确
	public static final int DFFX_USERLOGIN_USERUID_NOTEXIST_ERROR = 1002204;// 用户不存在
	public static final int DFFX_USERLOGIN_PASSWORD_ISNULL_ERROR = 1002205;// 用户密码不能为空
	public static final int DFFX_USERLOGIN_PHONEORUSERUID_ISNULL_ERROR = 1002206;// 手机号码或者用户账户不能为空
	public static final int DFFX_USERLOGIN_CLIENTTYPE_ISNULL_ERROR = 1002207;// 客户端类型不能为空

	public static final int DFFX_SAVE_ORDER = 10023;// 保存订单接口
	public static final int DFFX_SAVE_ORDER_SUCCESS = 1002300;// 订单生成成功
	public static final int DFFX_SAVE_ORDER_FAIL = 1002301;// 订单生成失败
	public static final int DFFX_SAVE_ORDER_TITLE_IS_NOT_NULL = 1002302;// 标题不能为空
	public static final int DFFX_SAVE_ORDER_CASE_DESCRIPE_IS_NOT_NULL = 1002303;// 案件描述不能为空
	public static final int DFFX_SAVE_ORDER_CASE_TYPE_IS_NOT_NULL = 1002304;// 案件类型不能为空
	public static final int DFFX_SAVE_ORDER_CASE_STYLE_IS_NOT_NULL = 1002305;// 案件专业不能为空
	public static final int DFFX_SAVE_ORDER_CASE_PHONE_IS_NOT_NULL = 1002306;// 客户电话不能为空
	public static final int DFFX_SAVE_ORDER_PAID_ISFREE_IS_NOT_NULL = 1002307;// 使用免费订单机会不能为空
	public static final int DFFX_SAVE_ORDER_PAID_AWARD_IS_NOT_NULL = 1002308;// 悬赏额度不能为空
	public static final int DFFX_SAVE_ORDER_CASE_ETIME_IS_NOT_NULL = 1002309;// 悬赏结束时间不能为空
	public static final int DFFX_SAVE_ORDER_CASE_WORK_YEAR_IS_NOT_NULL = 1002310;// 工作年限不能为空
	public static final int DFFX_SAVE_ORDER_LIMITLOW = 1002311;// 悬赏额度不能小于
	public static final int DFFX_SAVE_ORDER_LIMITUP = 1002312;// 不能大于
	public static final int DFFX_SAVE_ORDER_FB_INSUFFICIENT = 1002313;// 用户剩余法币不足
	public static final int DFFX_SAVE_ORDER_LIMIT_NOT_EX = 1002314;// 专业价格配置信息不存在
	public static final int DFFX_SAVE_ORDER_CASE_CITY_TYPE_IS_NOT_NULL = 1002315;// 城市类别不能为空
	public static final int DFFX_SAVE_ORDER_CASE_ETIME_IS_LESS_THAN_NOWTIEM = 1002316;// 悬赏结束时间不能小于当前时间
	public static final int DFFX_SAVE_FREE_ORDER_IS_FINISH = 1002317;// 免费机会已使用完
	public static final int DFFX_SAVE_ORDER_LAWYERADDR_IS_NOT_NULL = 1002318;// 律师地址不能为空
	public static final int DFFX_SAVE_ORDER_PRECISION_IS_NOT_NULL = 1002319;// 发单用户所在地经度不能为空
	public static final int DFFX_SAVE_ORDER_LATITUDE_IS_NOT_NULL = 1002321;// 发单用户所在地经度不能为空
	public static final int ORDER_STATUS_ACCEPT_CAREER = 1002320;// 委托订单，律师账好不能为空
	public static final int DFFX_SAVE_CONSULT_CHILDREN_IS_NOT_NULL = 1002321;// 咨询子类型别名不能为空;
	public static final int DFFX_SAVE_FREE_PAID_ISFREE_NO_NULL = 1002322;// 是否免费不能为空，或者非免费订单

	// ---------------------获取用户类型接口错误提示信息-----------------------//
	public static final int DFFX_BUSINESS_TYPE = 10024; // 获取业务类型接口
	public static final int DFFX_BUSINESS_TYPE_SUCCESS = 1002400; // 业务类型获取成功!
	public static final int DFFX_BUSINESS_TYPE_FAIL = 1002401; // 业务类型获取失败!

	// --------------------保存律师抢单信息接口错误提示信息---------------------//
	public static final int DFFX_SAVE_GRABORDER = 10025; // 律师抢单接口
	public static final int DFFX_SAVE_GRABORDER_SUCCESS = 1002500; // 用户（律师）抢单成功!
	public static final int DFFX_SAVE_GRABORDER_FAIL = 1002501; // 用户（律师）抢单失败!
	public static final int DFFX_SAVE_GRABORDER_IS_NOT_REPEAT = 1002502; // 不能重复抢单!
	public static final int DFFX_ORDER_IS_NOT_EXIST = 1002503; // 订单不存在
	public static final int DFFX_GRAB_USERUID_IS_NOT_NULL = 1002504; // 发单用户账号不能为空!
	public static final int DFFX_GRAB_LAWYERUID_IS_NOT_NULL = 1002505; // 抢单用户账号不能为空!
	public static final int DFFX_SAVE_GRABORDER_IS_FULL = 1002506; // 抢单队列已满!
	public static final int DFFX_SAVE_GRABORDER_SPECIFY_YES = 1002507; // 发单用户已指定抢单律师

	// -------------------删除律师抢单信息接口错误提示信息---------------------//
	public static final int DFFX_DELETE_GRABORDER = 10026; // 删除律师抢单信息接口
	public static final int DFFX_DELETE_GRABORDER_SUCCESS = 1002600; // 删除律师抢单信息成功!
	public static final int DFFX_DELETE_GRABORDER_FAIL = 1002601; // 删除律师抢单信息失败!
	public static final int DFFX_DELETE_GRABORDER_ID_IS_NOT_NULL = 1002602; // 抢单id不能为空!
	public static final int DFFX_DELETE_GRABORDER_NOT_EXIST = 1002603; // 抢单信息不存在!

	// ----------------------申请付款接口错误提示信息-----------------------//
	public static final int DFFX_APPLY_PAYMENT = 10027; // 申请付款接口
	public static final int DFFX_APPLY_PAYMENT_SUCCESS = 1002700; // 申请付款成功!
	public static final int DFFX_APPLY_PAYMENT_FAIL = 1002701; // 申请付款失败!
	public static final int DFFX_APPLY_PAYMENT_APPLYPAID_IS_NOT_NULL = 1002702; // 申请金额不能为空!
	public static final int DFFX_APPLY_PAYMENT_ERROR = 1002703; // 律师抢单信息不存在!
	public static final int DFFX_APPLY_PAYMENT_REPEAT = 1002704; // 重复提交申请!
	public static final int DFFX_PAID_AWARD_TYPE = 1002705; // 法援类型不能为空!
	public static final int DFFX_NOT_POINT_LAWYER = 1002706; // 不是指定律师
	public static final int DFFX_CANNOT_LAW_HELP = 1002707; // 非平台免费订单，不能选择法援

	// -----------------------验证支付密码接口-----------------------//
	public static final int DFFX_VERIFYPAY = 10028; // 验证支付密码接口
	public static final int DFFX_VERIFYPAY_PAYPASSWORD_MAG_OK = 1002800; // 支付密码验证成功
	public static final int DFFX_VERIFYPAY_PAYPASSWORD_MSG_FAIL = 1002801; // 支付密码验证失败
	public static final int DFFX_VERIFYPAY_TOKEN_NOT_NULL_ERROR = 1002802; // 回话密令不能为空
	public static final int DFFX_VERIFYPAY_PASWORD_NOT_NULL_ERROR = 1002803; // 支付密码不能为空
	public static final int DFFX_VERIFYPAY_WALLET_NOT_EXIST_ERROR = 1002804; // 钱包信息不存在

	// ------------------------查询免费订单使用情况----------------------//
	public static final int DFFX_GETFREEMAKEORDER = 10029; // 查询免费订单使用情况
	public static final int DFFX_GETFREEMAKEORDER_MSG_OK = 1002900; // 免费订单使用次数查询成功
	public static final int DFFX_GETFREEMAKEORDER_MSG_FAIL = 1002901; // 免费订单使用次数查询失败
	public static final int DFFX_GETDREEMAKEORDER_ORDERTYPE_NOT_NULL_ERROR = 1002902; // 订单类型不能为空
	public static final int DFFX_GETFREEMAKEORDER_STARTTIME_NOT_NULL_ERROR = 1002903; // 开始时间不能为空
	public static final int DFFX_GETFREEMAKEORDER_ENDTIME_NOT_NULL_ERROR = 1002904; // 结束时间不能为空
	public static final int DFFX_GETFREEMAKEORDER_TKOEN_NOT_NULL_ERROR = 1002905; // 会话密令不能为空
	public static final int DFFX_GETFREEMAKEORDER_MSG_VIP_NOT_EXIST = 1002906; // vip不存在
	public static final int DFFX_GETFREEMAKEORDER_MSG_VIP_IS_END = 1002907; // vip已到期
	public static final int DFFX_GETFREEMAKEORDER_USER_EXIST = 1002908; // 用户不存在

	// --------------------------修改绑定手机号接口-----------------------//
	public static final int DFFX_ALTER_BIND_PHONE = 1003000; // 用户修改绑定手机号接口
	public static final int DFFX_ALTER_BIND_PHONE_SUCCESS = 1003001; // 修改手机号码成功
	public static final int DFFX_ALTER_BIND_PHONE_FAIL = 1003002; // 修改手机号码失败
	public static final int DFFX_OLD_PHONE_IS_NOT_NULL = 1003003; // 用户原手机号不能为空
	public static final int DFFX_NEW_PHONE_IS_NOT_NULL = 1003004; // 新手机号不能为空

	// --------------------------发单用户确认订单接口-----------------------//
	public static final int DFFX_USER_CONFIRM_ORDER = 10031; // 用户确认订单接口
	public static final int DFFX_USER_CONFIRM_ORDER_SUCCESS = 1003100; // 用户确认订单成功
	public static final int DFFX_USER_CONFIRM_ORDER_FAIL = 1003101; // 用户确认订单失败
	public static final int DFFX_USER_UID_IS_NOT_NULL = 1003102; // 发单用户uid不能为空
	public static final int DFFX_LAWYER_UID_NOT_NULL = 1003103; // 律师uid不能为空
	public static final int DFFX_ORDER_ID_NOT_NULL = 1003104; // 订单id不能为空
	public static final int DFFX_PAID_AWARD_NOT_NULL = 1003105; // 用户确认订单金额不能为空
	public static final int DFFX_AWARD_TYPE_NOT_NULL = 1003106; // 法援类型不能为空
	public static final int DFFX_CASE_TYPE = 1003107; // 案件类型不能为空
	public static final int DFFX_PAID_IS_FREE = 1003108; // 免费类型不能为空
	public static final int DFFX_MONEY_DISAFFINITY = 1003109; // 确定金额和律师申请金额不一致
	public static final int DFFX_GREATER_MONEY = 1003110; // 确定金额和大于用户冻结金额
	public static final int DFFX_EVALUATE_LEVEL_IS_NOT_NULL = 1003111; // 专业水平不能为空
	public static final int DFFX_EVALUATE_EFFICIENCY_IS_NOT_NULL = 1003112; // 工作效率不能为空
	public static final int DFFX_EVALUATE_ATTITUDE_IS_NOT_NULL = 1003113; // 服务态度不能为空
	public static final int DFFX_EVALUATE_LEAVEMSG_IS_NOT_NULL = 1003114; // 评价留言不能为空
	public static final int DFFX_WALLET_PASSWORD_IS_NOT_NULL = 1003115; // 支付密码不能为空

	// ------------------------获取免费金额和下限额度接口---------------------//
	public static final int DFFX_GET_FREE_MONEY = 10032; // 获取免费金额和下限额度接口
	public static final int DFFX_GET_FREE_MONEY_SUCCESS = 1003200; // 获取免费金额和下限额度成功
	public static final int DFFX_GET_FREE_MONEY_FAIL = 1003201; // 获取免费金额和下限额度失败

	// -------------------------公众用户确认抢单律师接口-----------------------//
	public static final int DFFX_CONFIRM_GRABORDER_ORDER = 10033; // 公众用户确认抢单律师接口
	public static final int DFFX_CONFIRM_GRABORDER_ORDER_SUCCESS = 1003300; // 公众用户确认抢单律师成功
	public static final int DFFX_CONFIRM_GRABORDER_ORDER_FAIL = 1003301; // 公众用户确认抢单律师失败
	public static final int DFFX_GRABORDER_LAWYER_IS_NOT_EXIST = 1003302; // 律师不在抢单列表中
	public static final int DFFX_GRABORDER_CANNOT_REPEAT_CONFIRM = 1003303; // 该订单已指定抢单律师

	// --------------------------公众用户取消付款接口------------------------//
	public static final int DFFX_USER_CANCEL_PAYMENT = 10034; // 公众用户取消付款接口
	public static final int DFFX_USER_CANCEL_PAYMENT_SUCCESS = 1003400; // 公众用户取消付款成功
	public static final int DFFX_USER_CANCEL_PAYMENT_FAIL = 1003401; // 公众用户取消付款失败
	public static final int DFFX_CANCEL_TYPE_IS_NOT_NULL = 1003402; // 撤单类型不能为空
	public static final int DFFX_CANCEL_REMARK_IS_NOT_NULL = 1003403; // 撤单备注不能为空
	public static final int DFFX_USER_CANCEL_PAYMENT_OVERMUCH = 1003404; // 公众用户取消付款不能超过两次

	// ------------------------获取前5个抢单律师的信息接口----------------------//
	public static final int DFFX_GET_GRABORDER_LAWYER = 10035; // 获取前5个抢单律师信息接口
	public static final int DFFX_GET_GRABORDER_LAWYER_SUCCESS = 1003500; // 获取前5个抢单律师信息成功
	public static final int DFFX_GET_GRABORDER_LAWYER_FAIL = 1003501; // 获取前5个抢单律师信息失败

	// --------------------------公众用户取消订单接口------------------------//
	public static final int DFFX_USER_CANCEL_ORDER = 10036; // 公众用户取消订单接口
	public static final int DFFX_USER_CANCEL_ORDER_SUCCESS = 1003600; // 用户取消订单成功
	public static final int DFFX_USER_CANCEL_ORDER_FAIL = 1003601; // 用户取消订单失败
	public static final int DFFX_USER_CANCEL_LAWYER_IS_ACCEPT = 1003602; // 该订单已被律师受理
	public static final int DFFX_IS_NOT_USER_SELF = 1003603; // 非发单用户

	// -------------------------获取用户支付列表接口------------------------//
	public static final int DFFX_USER_TRANSACTION_INFO_LIST = 10037; // 获取用户支付列表接口
	public static final int DFFX_USER_TRANSACTION_INFO_LIST_SUCCESS = 1003700; // 获取用户支付列表成功
	public static final int DFFX_USER_TRANSACTION_INFO_LIST_FAIL = 1003701; // 获取用户支付列表失败
	public static final int DFFX_TRANSACTION_TYPE_IS_NOT_NULL = 1003702; // 交易类型不能为空

	// -------------------------获取用户交易详情接口------------------------//
	public static final int DFFX_USER_TRANSACTION_DETAILS = 10038; // 获取用户交易详情接口
	public static final int DFFX_USER_TRANSACTION_DETAILS_SUCCESS = 1003800; // 获取用户交易详情成功
	public static final int DFFX_USER_TRANSACTION_DETAILS_FAIL = 1003801; // 获取用户交易详情失败

	// -----------------------获取订单支付情况信息接口----------------------//
	public static final int DFFX_ORDER_PAID_INFO = 10039; // 获取订单支付情况信息接口
	public static final int DFFX_ORDER_PAID_INFO_SUCCESS = 1003900; // 获取订单支付情况信息成功
	public static final int DFFX_ORDER_PAID_INFO_FAIL = 1003901; // 获取订单支付情况信息失败

	// ------------------------获取用户积分列表接口----------------=-------//
	public static final int DFFX_SCORE_RECORD_LIST = 10040; // 获取用户积分列表接口
	public static final int DFFX_SCORE_RECORD_LIST_SUCCESS = 1004000; // 获取用户积分列表成功
	public static final int DFFX_SCORE_RECORD_LIST_FAIL = 1004001; // 获取用户积分列表失败
	public static final int DFFX_SCORE_TYPE_IS_NOT_NULL = 1004002; // 积分类型不能为空

	// --------------------------律师确认受理接口----------------=-------//
	public static final int DFFX_LAWYER_CONFIRM_ACCEPT = 10041; // 律师确认受理接口
	public static final int DFFX_LAWYER_CONFIRM_ACCEPT_SUCCESS = 1004100; // 律师确认受理接口成功
	public static final int DFFX_LAWYER_CONFIRM_ACCEPT_FAIL = 1004101; // 律师确认受理接口失败
	public static final int DFFX_CANNOT_REPEAT_ACCEPT = 1004102; // 不能重复受理
	public static final int DFFX_NOT_POINT_ACCEPT_LAWYER = 1004103; // 不是指定受理律师
	public static final int DFFX_NOT_ACCEPT_ORDER = 1004104; // 不是委托订单
	public static final int DFFX_ORDER_STATUS_CANCEL = 1004105; // 订单已过期或用户已取消

	// --------------------------查询用户所有免费使用情况信息接口------------------------//
	public static final int DFFX_GET_ALL_FREE_MAKE_ORDER = 10042; // 查询用户所有免费使用情况信息接口
	public static final int DFFX_GET_ALL_FREE_MAKE_ORDER_SUCCESS = 1004200; // 查询用户所有免费使用情况信息成功
	public static final int DFFX_GET_ALL_FREE_MAKE_ORDER_FAIL = 1004201; // 查询用户所有免费使用情况信息失败

	// --------------------------用户修改绑定手机验证码校验接口------------------------//
	public static final int DFFX_AUTH_VERIFY_CODE = 10043; // 用户修改绑定原手机验证码校验接口
	public static final int DFFX_AUTH_VERIFY_CODE_SUCCESS = 1004300; // 用户修改绑定原手机验证码校验成功
	public static final int DFFX_AUTH_VERIFY_CODE_FAIL = 1004301; // 用户修改绑定原手机验证码校验失败

	public static final int DFFX_UPDATE_USER_PASSWORD = 10050;// 用户修改密码接口
	public static final int DFFX_SETPAY_PASSWORD_SUCCESS = 1005000;// 设置密码成功
	public static final int DFFX_SERPAY_PASSWORD_FAIL = 1005001;// 设置密码失败
	public static final int DFFX_OLD_PASSWORD_IS_NOT_NULL = 1005002;// 用户原密码不能为空!
	public static final int DFFX_NEW_PASSWORD_IS_NOT_NULL = 1005003;// 用户新密码不能为空!
	public static final int DFFX_ALTER_PASSWORD_TYPE = 1005004;// 修改密码类型不能为空!
	public static final int DFFX_USER_PHONE_IS_NOT_NULL = 1005005;// 手机号码不能为空!
	public static final int DFFX_PHONE_IS_NOT_SAME = 1005006;// 手机号码与预留手机号不匹配!
	public static final int DFFX_OLD_PASSWORD_ERROR = 1005007;// 原始密码不正确!
	public static final int DFFX_UPDATE_USER_PASSWORD_SUCCESS = 1005008;// 密码修改成功!
	public static final int DFFX_UPDATE_USER_PASSWORD_FAIL = 1005009;// 修改密码失败!
	public static final int DFFX_VERIFICATION_NOT_SAME = 1005010;// 验证码不正确
	public static final int DFFX_VERIFICATION_IS_NOT_NULL = 1005011;// 验证码不能为空
	public static final int DFFX_LOGIN_PASSWORD_NOT_SUCCESS = 1005012;// 登录密码不正确
	public static final int DFFX_USER_EXIST_PAYPASSWORD_ERROR = 1005013;// 用户存在支付密码
	public static final int DFFX_UPDATE_USER_PASSWORD_LESS_5 = 1005014;// 当日修改次数超过N次
	public static final int DFFX_UPDATE_USER_PASSWORD_NOT_TYPE = 1005015; // 不存在的操作类型
	public static final int DFFX_UPDATE_USER_PASSWORD_LOGINPASSWORD_FAIL = 1005016; // 登录不密码不正确
	public static final int DFFX_UPDATE_USER_PASSWORD_LOGINPASSWOTD_NOT_NULL = 1005017; // 登录不密码不能为空
	public static final int DFFX_UPDATE_USER_PASSWORD_VERIFY_SUCCESS = 1005018; // 密码验证成功
	public static final int DFFX_UPDATE_USER_PASSWORD_VERIFY_FAIL = 1005019; // 密码验证失败

	public static final int DFFX_DRAWMONEY = 10052;// 提现接口
	public static final int DFFX_DRAWMONEY_WAIT = 1005200;// 你的申请已经提交,等待系统处理...
	public static final int DFFX_DRAWMONEY_CASH_NOT_ENOUGH = 1005201;// 提现失败,余额不足
	public static final int DFFX_DRAWMONEY_PSW_ERROR = 1005202;// 提现失败 ,密码错误
	public static final int DFFX_DRAWMONEY_ERROR = 1005203;// 出现异常
	public static final int DFFX_DEAWMONEY_FAIL = 1005205; // 提现失败
	public static final int DFFX_DRAWMONET_DRAWTYPE_NOT_NULL = 1005204; // 提现类型不能为空

	public static final int DFFX_GETVIPDES_INFO = 10053;// 查看vip详情接口
	public static final int DFFX_GETVIPDES_OK = 1005300;// 获取信息成功
	public static final int DFFX_GETVIPDES_FAIL = 1005301;// 获取信息失败

	public static final int DFFX_SETUSERVIP = 10054;// 购买用户vip接口
	public static final int DFFX_SETUSERVIP_OK = 1005400;// 购买vip成功
	public static final int DFFX_SETUSERVIP_FAIL = 1005401;// 购买vip失败
	public static final int DFFX_SETUSERVIP_CASH_NOT_ENOUGH = 1005402;// 用户余额不足
	public static final int DFFX_SETUSERVIP_IS_VIP = 1005403;// 您已经是vip会员,会员升级等待后续开发
	public static final int DFFX_SETUSERVIP_ERROR = 1005404;// 购买会员异常
	public static final int DFFX_SETUSERVIP_PSW_ERROR = 1005405;// 支付密码错误
	public static final int DFFX_SETUSERVIP_ERR_TYPE = 1005406;// 购买的会员类型不能为0
	public static final int DFFX_SETUSERVIP_ERR_TYPE_NOT_NULL = 1005407;// 购买的会员类型不能为空

	public static final int DFFX_GETBANKLIST_INFO = 10055;// 获取我的所有银行信息
	public static final int DFFX_GETBANKLIST_OK = 1005500;// 获取我的银行卡信息成功
	public static final int DFFX_GETBANKLIST_FAIL = 1005501;// 获取银行卡信息失败

	public static final int DFFX_ADDMYBANK_INFO = 10056;// 添加我的银行卡
	public static final int DFFX_ADDMYBANK_OK = 1005601;// 添加银行卡成功
	public static final int DFFX_ADDMYBANK_FAIL = 1005602;// 添加银行卡失败
	public static final int DFFX_ADDMYBANK_CARE_EXIST = 1005603;// 已存在的银行卡
	public static final int DFFX_ADDMYBANK_BANKNAME_NOT_EXIST = 1005604;// 银行名称不能为空
	public static final int DFFX_ADDMYBANK_BANKNUM_NOT_EXIST = 1005605;// 银行卡号不能为空
	public static final int DFFX_ADDMYBANK_USERNAME_NOT_EXIST = 1005606;// 银行卡对应的真实姓名不能为空
	public static final int DFFX_ADDMYBANK_BANKBRANCHNAME_NOT_EXIST = 1005607;// 开户支行名称不能为空
	public static final int DFFX_ADDMYBANK_USERPHONE_NOT_EXIST = 1005608;// 银行预留手机号码不能为空
	public static final int DFFX_ADDMYBANK_BANKCARENUM_MORE = 1005609; // 添加的银行卡数量太多

	public static final int DFFX_GETCASHLOG = 10057;// 获取提现记录
	public static final int DFFX_GETCASHLOG_OK = 1005700;// 获取提现日志成功
	public static final int DFFX_GETCASHLOG_FAIL = 1005701;// 获取提现日志失败

	public static final int DFFX_SETUSERDEFBANK = 10058;// 设置用户默认银行卡
	public static final int DFFX_SETUSERDEFBANK_OK = 1005800;// 设置用户默认银行卡成功
	public static final int DFFX_SETUSERDEFBANK_FAIL = 1005801;// 设置用户默认银行卡失败

	public static final int DFFX_DELBANKINFO = 10059;// 删除银行卡接口
	public static final int DFFX_DELBANKINFO_OK = 1005900;// 删除银行卡成功
	public static final int DFFX_DELBANKINFO_FAIL = 1005901;// 删除银行卡失败
	public static final int DFFX_DELBANKINFO_NOT_EXIST = 1005902;// 不存在的银行卡
	public static final int DFFX_DELBANKINFO_EXCEPTION = 1005903;// 删除银行卡异常

	public static final int DFFX_GETDEFUSERBANK = 10060;// 获取用户默认银行卡
	public static final int DFFX_GETDEFUSERBANK_NOT_EXIST = 1006000;// 您还没有设置默认银行卡
	public static final int DFFX_GETDEFUSERBANK_OK = 1006001;// 获取用户银行卡成功
	public static final int DFFX_GETDEFUSERBANK_FAIL = 1006002;// 获取用户银行卡失败

	public static final int DFFX_BILLPAYPC = 10061;// 快钱用户PC充值接口
	public static final int DFFX_BILLPAYPC_OK = 1006100;
	public static final int DFFX_BILLPAYPC_FAIL = 1006101;

	public static final int DFFX_BILLPAYPHONE = 10062;// 快钱用户phone充值接口
	public static final int DFFX_BILLPAYPHONE_OK = 1006200; //
	public static final int DFFX_BILLPAYPHONE_FAIL = 1006201;

	public static final int DFFX_ALIPAYPC = 10063;// ailipayPC用户充值
	public static final int DFFX_ALIPAY_OK = 1006300;// 获取充值信息成功
	public static final int DFFX_ALIPAY_FAIL = 1006301;// 获取充值信息失败

	public static final int DFFX_CASEREPLY = 10064;// 订单回复接口
	public static final int DFFX_CASEREPLY_ORDERID_NOT_NULL = 1006402;// 订单id不能为空
	public static final int DFFX_CASEREPLY_OK = 1006400;// 订单回复成功
	public static final int DFFX_CASEREPLY_FAIL = 1006401;// 订单回复失败

	public static final int DFFX_GETORDERPAID = 10065;// 获取订单支付接口
	public static final int DFFX_GETORDERPAID_ORDERID_NOT_NULL = 1006502;// 订单id不能为空
	public static final int DFFX_GETORDERPAID_OK = 1006500;// 获取订单支付成功
	public static final int DFFX_GETORDERPAID_FAIL = 1006501;// 获取订单支付失败

	public static final int DFFX_LAWYERPUBLICBANK = 10066;// 获取律师对公银行接口
	public static final int DFFX_LAWYERPUBLICBANK_OK = 1006600;// 获取律师对公银行成功
	public static final int DFFX_LAWYERPUBLICBANK_FAIL = 1006601;// 获取律师对公银行失败

	public static final int DFFX_GETMEINFO = 10067;// 获取我的信息
	public static final int DFFX_GETMEINFO_OK = 1006700;// 获取我的信息成功
	public static final int DFFX_GETMEINFO_FAIL = 1006701;// 获取我的信息失败
	public static final int DFFX_GETMEINFO_USER_NOT_NULL = 1006702; // 用户类型不能为空

	public static final int DFFX_GETUSERCHECKINFO = 10068;// 获取用户认证资料
	public static final int DFFX_GETUSERCHECKINFO_OK = 1006800;// 获取用户认证资料成功
	public static final int DFFX_GETUSERCHECKINFO_FAIL = 1006801;// 获取用户认证资料失败

	public static final int DFFX_EXISTPWD = 10069;// 是否存在支付密码接口
	public static final int DFFX_EXISTPWD_OK = 1006900;// 成功
	public static final int DFFX_EXISTPWD_FAIL = 1006901;// 失败

	// public static final int DFFX_GET_ALL_FREE_MAKE_ORDER= 10070 ;//
	// 查询用户所有免费使用情况信息接口
	// public static final int DFFX_GET_ALL_FREE_MAKE_ORDER_SUCCESS= 1007000 ;//
	// 查询用户所有免费使用情况信息成功
	// public static final int DFFX_GET_ALL_FREE_MAKE_ORDER_FAIL= 1007001 ;//
	// 查询用户所有免费使用情况信息失败

	public static final int DFFX_INVITER = 10071;// 获取邀请的用户信息
	public static final int DFFX_INVITER_OK = 1007100;// 获取邀请的用户信息成功
	public static final int DFFX_INVITER_FAIL = 1007101;// 获取邀请的用户信息失败
	public static final int DFFX_INVITER_USERUID_NOT_NULL = 1007102;
	public static final int DFFX_INVITER_TOKEN_NOT_NULL = 1007103;
	public static final int DFFX_INVITER_LOGINTYPE_NOT_NULL = 1007104;

	public static final int DFFX_UNREADORDERSTATE = 10072; // 获取用户未读信息状态
	public static final int DFFX_UNREADORDERSTATE_OK = 1007200; // 获取用户未读信息成功
	public static final int DFFX_UNREADORDERSTATE_FAIL = 1007201; // 获取用户为敌信息失败

	public static final int DFFX_ADVICEORDERLIST = 10073; // 用户获取咨询信息列表
	public static final int DFFX_ADVICEORDERLIST_OK = 1007300; // 用户获取咨询信息成功
	public static final int DFFX_ADVICEORDERLIST_FAIL = 1007301; // 用户获取咨询信息失败
	public static final int DFFX_ADVICEORDERLIST_STATE_NULL = 1007302; // 订单状态不能为空

	public static final int DFFX_ADVICEDETAILLIST = 10074; // 用户获取咨询详情
	public static final int DFFX_ADVICEDETAILLIST_OK = 1007400; // 用户获取咨询详情成功
	public static final int DFFX_ADVICEDETAILLIST_FAIL = 1007401; // 用户获取咨询详情失败
	public static final int DFFX_ADVICEDETAILLIST_ADVICE_ID_NULL = 1007402; // 咨询订单id
	// 不能为空

	// --------------------------保存用户咨询信息接口------------------------//
	public static final int DFFX_SAVE_USER_CONSULT = 10080; // 保存用户咨询信息接口
	public static final int DFFX_SAVE_USER_CONSULT_SUCCESS = 1008000; // 保存用户咨询信息成功
	public static final int DFFX_SAVE_USER_CONSULT_FAIL = 1008001; // 保存用户咨询信息失败
	public static final int DFFX_CONSULT_USERNAME_IS_NOT_NULL = 1008002; // 用户名不能为空
	public static final int DFFX_CONSULT_CONSULT_CONTEXT_IS_NOT_NULL = 1008003; // 咨询内容不能为空
	public static final int DFFX_CONSULT_CONSULT_TYPE_IS_NOT_NULL = 1008004; // 咨询类型不能为空

	// -------------------------保存用户咨询详情信息接口----------------------//
	public static final int DFFX_SAVE_USER_CONSULT_DETAIL = 10081; // 保存用户咨询详情信息接口
	public static final int DFFX_SAVE_USER_CONSULT_DETAIL_SUCCESS = 1008100;
	public static final int DFFX_SAVE_USER_CONSULT_DETAIL_FAIL = 1008101;
	public static final int DFFX_CONSULT_DETAIL_CONTEXT_OR_FILE_IS_NOT_NULL = 1008102;
	public static final int DFFX_CONSULT_DETAIL_ADVICE_ID_IS_NOT_NULL = 1008103;
	public static final int ADVICE_ORDER_NOT_EXIST = 1008104;// 咨询主内容不存在
	public static final int ADVICE_ORDER_CLOSE = 1008105;// 该咨询内容已关闭

	// --------------------------保存用户反馈信息接口-----------------------//
	public static final int DFFX_SAVE_USER_ADVICE = 10082;
	public static final int DFFX_SAVE_USER_ADVICE_SUCCESS = 1008200;
	public static final int DFFX_SAVE_USER_ADVICE_FAIL = 1008201;
	public static final int DFFX_ADVICE_CONTEXT_IS_NOT_NULL = 1008202;

	// -----------------------获取系统版本信息------------------------//
	public static final int DFFX_GETSYSTEMVERSION = 10083; // 获取系统版本信息
	public static final int DFFX_GETSYSTEMVERSION_OK = 1008300; // 获取系统版本信息成功
	public static final int DFFX_GETSYSTEMVERSION_FAIL = 1008301; // 获取系统版本信息失败
	public static final int DFFX_GETSYSTEMVERSION_CLIENTVERSION_NULL = 1008302; // 客户端版本号不能为空
	public static final int DFFX_GETSYSTEMVERSION_CLIENTTYPE_NULL = 1008403; // 客户端登录类型不能为空

	// ---------------------------获取下限额度接口------------------------//
	public static final int DFFX_GET_LOWER_VALUE = 10084;
	public static final int DFFX_GET_LOWER_VALUE_SUCCESS = 1008400;
	public static final int DFFX_GET_LOWER_VALUE_FAIL = 1008401;

	// -------------------------获取咨询业务子类型接口--------------------//
	public static final int DFFX_GET_SKILL_CHILDREN_LIST = 10085; // 获取咨询业务子类型接口
	public static final int DFFX_GET_SKILL_CHILDREN_LIST_SUCCESS = 1008500;// 获取咨询业务子类型成功
	public static final int DFFX_GET_SKILL_CHILDREN_LIST_FAIL = 1008501;// 获取咨询业务子类型失败
	public static final int DFFX_SKILL_ID_IS_NOT_NULL = 1008502;// 业务类型不能为空

	// --------------------------保存临时订单接口-----------------------//
	public static final int DFFX_SAVE_INTERIM_ORDER = 10086; // 保存临时订单接口
	public static final int DFFX_SAVE_INTERIM_ORDER_SUCCESS = 1008600; // 保存临时订单成功
	public static final int DFFX_SAVE_INTERIM_ORDER_FAIL = 1008601; // 保存临时订单失败

	public static final int DFFX_USER_PAYMENT = 10087; // "用户支付接口";
	public static final int DFFX_USER_PAYMENT_OK = 1008700; // "成功";
	public static final int DFFX_USER_PAYMENT_FAIL = 1008701; // "失败";
	public static final int DFFX_USER_PAYMENT_ORDERSN_NOT_EXIST = 1008702; // "该订单不存在或者已经失效";
	public static final int DFFX_USER_PAYMENT_WALLETCASH_NOTENOUGH = 1008703; // 钱包余额不足
	public static final int DFFX_USER_PAYMENT_PARAME_ERROR = 1008704; // 充值的方式不正确,不能使用自己的钱包为自己充值
	public static final int DFFX_USER_PAYMENT_CREATEORDER_FAIL = 1008705; // 生成订单失败,消费金额已退回到您的余额账户

}
