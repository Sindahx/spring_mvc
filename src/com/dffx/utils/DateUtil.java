package com.dffx.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	/** 年月日时分秒(无下划线) yyyyMMddHHmmss */
	public static final String dtLong = "yyyyMMddHHmmss";

	/** 完整时间 yyyy-MM-dd HH:mm:ss */
	public static final String simple = "yyyy-MM-dd HH:mm:ss";

	/** 年月日(无下划线) yyyyMMdd */
	public static final String dtShort = "yyyyMMdd";
	
	/** 年月 */
	public static final String dirShort = "yyyyMM";

	/** 根据时间生成编号 */
	public static final String createSon = "yyyyMMddHHmmsssss";

	private DateUtil() {
	}

	/***
	 * 计算两个时间相差的额秒数
	 * 
	 * @param startDate
	 * @return
	 */
	public static int calLastedTime(Date startDate) {
		long a = new Date().getTime();
		long b = startDate.getTime();
		int c = (int) ((a - b) / 1000);
		return c;
	}

	/**
	 * 获取系统当期年月日(精确到天)，格式：yyyyMMdd
	 * 
	 * @return
	 */
	public static String getFormatDate(Date date, String format) {
		if (date == null) {
			return null;
		}

		DateFormat df = new SimpleDateFormat(format);

		// df.setTimeZone(TimeZone.getTimeZone("Asia/shanghai"));

		// df.setTimeZone(TimeZone.getTimeZone("GMT+8"));//东八区，北京时间

		return df.format(date);
	}

	/**
	 * 获取系统当期年月日(精确到天)，格式：yyyyMMdd
	 * 
	 * @return
	 */
	public static String getFormatDate(String format) {

		Date date = new Date();
		if (date == null) {
			return null;
		}

		DateFormat df = new SimpleDateFormat(format);

		// df.setTimeZone(TimeZone.getTimeZone("Asia/shanghai"));

		// df.setTimeZone(TimeZone.getTimeZone("GMT+8"));//东八区，北京时间

		return df.format(date);
	}

	/**
	 * 获取时间戳
	 * 
	 * @return
	 */
	public static long getDateTime() {

		Date date = new Date();

		return date.getTime();
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str, String str2) {

		SimpleDateFormat format = new SimpleDateFormat(str2);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 
	 * @param date
	 *            获得日期中的天数
	 * @return
	 */
	public static int getDay_Of_Month(Date date) {
		GregorianCalendar gC = new GregorianCalendar();
		gC.setTime(date);
		return gC.get(GregorianCalendar.DAY_OF_MONTH);
	}

	/**
	 * get what hour is now
	 * 
	 * @return 好的当前的小时值
	 */
	public static int getCurrHour() {
		GregorianCalendar gC = new GregorianCalendar();
		return gC.get(GregorianCalendar.HOUR_OF_DAY);
	}

	/**
	 * Դ日期比较后的 几天差距
	 * 
	 * @param start
	 *            yyyy-MM-dd
	 * @param end
	 *            yyyy-MM-dd
	 * @return
	 */
	public static int getIntervalDays(Date start, Date end) {
		start = DateUtil.parse(DateUtil.format(start, "yyyy-MM-dd"), "yyyy-MM-dd");
		end = DateUtil.parse(DateUtil.format(end, "yyyy-MM-dd"), "yyyy-MM-dd");
		long mills_per_day = 24 * 3600 * 1000;
		long startMills = start.getTime();
		long endMills = end.getTime();
		int offset = 0;

		offset = (int) ((endMills - startMills) / mills_per_day);

		return offset;
	}

	/**
	 * 日期比较后的 几月差距 *
	 * 
	 * @param start
	 *            yyyy-MM-dd
	 * @param end
	 *            yyyy-MM-dd
	 * @return
	 */
	public static int getIntervalMonths(Date start, Date end) {
		GregorianCalendar startGC = new GregorianCalendar();
		GregorianCalendar endGC = new GregorianCalendar();
		startGC.setTime(start);
		endGC.setTime(end);

		int endY = endGC.get(GregorianCalendar.YEAR);
		int endM = endGC.get(GregorianCalendar.MONTH);
		int endD = endGC.get(GregorianCalendar.DAY_OF_MONTH);

		int startY = startGC.get(GregorianCalendar.YEAR);
		int startM = startGC.get(GregorianCalendar.MONTH);
		int startD = startGC.get(GregorianCalendar.DAY_OF_MONTH);

		int offset = -1;

		if (endD == startD) {
			offset = endM - startM + (endY - startY) * 12;
		}

		return offset;
	}

	/**
	 * 
	 * @return Date
	 */
	public static Date getNow() {
		return new Date();
	}

	/**
	 * 
	 * 前天时间
	 * 
	 * @return
	 */
	public static Date getYesterday() {
		return addDays(-1);
	}

	/**
	 * 当前时间的 days天前 正数 或者days天后 负数
	 * 
	 * @param days
	 *            int
	 * @return Date
	 */
	public static Date addDays(int days) {
		return addDays(new Date(), days);
	}

	/**
	 * 指定那一天的 days天前或者days天后��ԭ
	 * 
	 * @param srcDate
	 *            Date
	 * @param days
	 *            int
	 * @return Date
	 */
	public static Date addDays(Date srcDate, int days) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.DAY_OF_MONTH, days);
		return gCanlendar.getTime();
	}

	/**
	 * 指定那一天的 增加多少分钟ԭ
	 * 
	 * @param srcDate
	 *            Date
	 * @param days
	 *            int
	 * @return Date
	 */
	public static Date addSeconds(Date srcDate, int second) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.HOUR_OF_DAY, second);
		return gCanlendar.getTime();
	}

	/**
	 * 指定日期的 months月前或者months月后
	 * 
	 * @param srcDate
	 * @param months
	 * @return
	 */
	public static Date addMonths(Date srcDate, int months) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.MONTH, months);
		return gCanlendar.getTime();
	}

	/**
	 * ��ԭ指定日期 的year年前或者year年后
	 * 
	 * @param srcDate
	 *            Date
	 * @param year
	 *            int
	 * @return Date
	 */
	public static Date addYears(Date srcDate, int year) {
		GregorianCalendar gCanlendar = new GregorianCalendar();
		gCanlendar.setTime(srcDate);
		gCanlendar.add(GregorianCalendar.YEAR, year);
		return gCanlendar.getTime();
	}

	/**
	 * 与当前日期的比较 大于当前日期为-1，小于当前日期为1，等于当前日期为0���ȷ����
	 * 
	 * @param dest
	 *            Date
	 * @return int 0��ʾ��ȣ���1��ʾ��ǰʱ��ǰ��dest,1��ʾ��ǰʱ������dest
	 */
	public static int compareTo(Date dest) {
		return compareTo(new Date(), dest);
	}

	/**
	 * ��src��dest�Ƚ二个日期的比较 前者大于后者为1，小于后者为-1，等于后者为0
	 * 
	 * @param src
	 *            Date
	 * @param dest
	 *            Date
	 * @return int 0��ʾ��ȣ���1��ʾsrcʱ��ǰ��dest,1��ʾsrcʱ������dest
	 */
	public static int compareTo(Date src, Date dest) {
		Date src1 = parse(format(src, "yyyy-MM-dd"), "yyyy-MM-dd");
		Date src2 = parse(format(dest, "yyyy-MM-dd"), "yyyy-MM-dd");
		int i = src1.compareTo(src2);
		return i;
	}

	/**
	 * ��日期格式转化输出 pattern为：'yyyy-MM-dd HH:mm:ss' 'yyyy-MM-dd'等格式
	 * 
	 * @param d
	 *            Date
	 * @param pattern
	 *            String
	 * @return String
	 */
	public static String format(Date d, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(d);
	}

	/**
	 * ����zihuan 字符串转换为一定的日期格式输出���pattern��ʽ���и�ʽ����ʧ��ʱ����null
	 * 
	 * @param date
	 *            String
	 * @param srcPattern
	 *            String ԭ���ڸ�ʽ
	 * @param destPattern
	 *            String
	 * @return String
	 */
	public static String format(String date, String srcPattern, String destPattern) {
		Date d = parse(date, srcPattern);
		if (d == null) {
			return null;
		}

		return format(d, destPattern);
	}

	/**
	 * ��ʱ���ַ�ָ���yi字符串转化一定的格式然后以日期形式输出
	 * 
	 * @param date
	 *            String
	 * @param srcPattern
	 *            String
	 * @return Date
	 */
	public static Date parse(String date, String pattern) {
		try {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			return format.parse(date);
		} catch (java.text.ParseException e) {
			return null;
		}
	}

	/**
	 * �޸�ָ��ʱ���ʱ����xga修改日期输出，只能修改小时、分、秒
	 * 
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date modifyDate(Date date, int hour, int minute, int second) {
		GregorianCalendar gC = new GregorianCalendar();
		gC.set(GregorianCalendar.HOUR_OF_DAY, hour);
		gC.set(GregorianCalendar.MINUTE, minute);
		gC.set(GregorianCalendar.SECOND, second);
		return gC.getTime();
	}

	/**
	 * 字符串输出日期格式
	 * 
	 * @param date
	 * @return
	 */
	public static Date parse(String date) {
		return parse(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static long longtime(Date leaveTime, Date enterTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String lleaveTime = d.format(leaveTime);// 按以上格式 将当前时间转换成字符串
		String lenterTime = d.format(enterTime);
		long k = 0;
		try {
			k = (d.parse(lleaveTime).getTime() - d.parse(lenterTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long minute = k / 60;// 分钟

		return minute;
	}

	/**
	 * 还剩余时间计算方法
	 * 
	 * @param currentTime
	 *            //创建时间
	 * @param distanceTime
	 *            //间隔时间（单位为天）
	 * @return 获得还剩余时间
	 */
	public static String time(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		String str = "";
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = distanceTime * 24 * 3600 - k;
		long day = k / 3600 / 24;// 天
		long hour = (k - day * 24 * 3600) / 3600;// 小时
		long minute = (k - day * 24 * 3600 - hour * 3600) / 60;// 分钟
		long second = k - day * 24 * 3600 - minute * 60 - hour * 3600;// 秒
		str = day + "天" + hour + "小时" + minute + "分钟" + second + "秒";
		if (k < 0) {
			str = "已过期";
		}
		return str;
	}

	public static String doSendProductTime(Date orderTime, String distance, String beginTime, String endTime) {// distanceTime为间隔时间（单位为天）

		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
		String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String sOrderTime = d.format(orderTime);
		String date = d1.format(orderTime);
		long lnow = 0;// 现在时间数
		long lorder = 0;// 下单时间数
		long lstart = 0;// 上班时间数
		long lend = 0;// 下班时间数
		long n = 0, j = 0;
		String str = "";
		try {
			long distanceTime = Long.parseLong(distance);

			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();
			lorder = parse(sOrderTime, "yyyy-MM-dd HH:mm:ss").getTime();
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lorder <= lnow) {
				if (lorder < lstart) {// 上班前下单
					if (lnow > lend) {// 当前时间在下班后
						if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
							j = (lnow - lstart) / 86400000;
							if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
								n = (lend - lstart) * j + lnow - (lstart + j * 86400000);
							} else {
								n = (lend - lstart) * (j + 1);
							}
						} else {// 经过一周内
							n = lend - lstart;
						}
					} else {// 当前时间在上班时间
						n = lnow - lstart;
					}
				} else if (lnow >= lstart && lend >= lorder) {// 上班时间下单
					if (lnow > lend) {// 当前时间在下班后
						if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
							j = (lnow - lstart) / 86400000;
							if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
								n = (lend - lstart) * (j - 1) + lnow - (lstart + j * 86400000) + lend - lorder;
							} else {
								n = (lend - lstart) * j + lend - lorder;
							}
						} else {// 经过一周内
							n = lend - lorder;
						}
					} else {// 当前时间在上班时间
						n = lnow - lorder;
					}
				} else {// 下班时间下单
					if (lnow > (lstart + 86400000)) {// 经过了1周以上的时间后
						j = (lnow - lstart) / 86400000;
						if (lnow <= (lend + j * 86400000) && lnow >= (lstart + j * 86400000)) {
							n = (lend - lstart) * (j - 1) + lnow - (lstart + j * 86400000);
						} else {
							n = (lend - lstart) * j;
						}
					} else {// 经过一周内
						n = 0;
					}
				}
			} else {
				n = distanceTime * 3600 * 1000;
			}
			if (n > distanceTime * 3600 * 1000) {
				n = distanceTime * 3600 * 1000;
			}
			str = showTime(distanceTime * 3600 * 1000 - n);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String doSendTime(String beginTime, String endTime) {// beginTime如果21:00:00,endTime为8:30:00
		try {
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
			SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
			String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
			String date = d1.format(new Date());
			long lnow = 0;// 现在时间数
			long lwan = 0;// 晚上时间数
			// long lzao=0;//早上时间数
			long lstart = 0;// 上班时间数
			long lend = 0;// 下班时间数
			String str = "";
			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();// 现在时间
			lwan = parse((date + " 23:59:59"), "yyyy-MM-dd HH:mm:ss").getTime();
			// lzao = parse((date+" 8:30:00"),"yyyy-MM-dd HH:mm:ss").getTime();
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lnow < lwan) {
				if (lnow >= lstart)
					str = "已经很晚了，本系统将在明天早上上班时间与您联系！";
				if (lnow <= lend)
					str = "太早了，本系统将在上班时间与您联系！";
			}
			return str;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean doTime(String beginTime, String endTime) {// beginTime如果21:00:00,endTime为8:30:00
		try {
			boolean b = false;
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
			SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");// 格式化时间
			String sNowTime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
			String date = d1.format(new Date());
			long lnow = 0;// 现在时间数
			long lstart = 0;// 开始时间数
			long lend = 0;// 结束时间数
			lnow = parse(sNowTime, "yyyy-MM-dd HH:mm:ss").getTime();// 现在时间
			lstart = parse((date + " " + beginTime), "yyyy-MM-dd HH:mm:ss").getTime();
			lend = parse((date + " " + endTime), "yyyy-MM-dd HH:mm:ss").getTime();
			if (lnow > lstart && lnow < lend) {
				b = true;
			}
			return b;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 判断时间是否超过规定时间
	 * 
	 * @param currentTime
	 *            //创建时间
	 * @param distanceTime
	 *            //间隔时间（单位为天）
	 * @return 没有超过规定时间为true,否则为false
	 */
	public static boolean judgeTime(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为天）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		boolean b = false;
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = distanceTime * 24 * 3600 - k;
		if (k >= 0)
			b = true;
		else
			b = false;
		return b;
	}

	// 对于超过多少小时后执行什么
	public static boolean judgeTime1(Date createTime, long distanceTime) {// distanceTime为间隔时间（单位为小时）
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化时间
		String nowtime = d.format(new Date());// 按以上格式 将当前时间转换成字符串
		String tempTime = d.format(createTime);
		boolean b = false;
		long k = 0;
		try {
			k = (d.parse(nowtime).getTime() - d.parse(tempTime).getTime()) / 1000;// 获得秒
			System.out.println(k);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		k = k / 3600 - distanceTime;
		if (k > 0) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public static String reTimeState(String begin, String end) throws java.text.ParseException {
		// SimpleDateFormat formatter=new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = parse(begin, "yyyy-MM-dd HH:mm:ss");// formatter.parse(begin);
		Date date2 = parse(end, "yyyy-MM-dd HH:mm:ss");// formatter.parse(end);
		java.util.Date nows = new Date();
		long bi = nows.getTime() - date1.getTime();
		long ei = date2.getTime() - nows.getTime();
		long bl = bi / 1000; // 获得现在时间与开始时间的比较
		long el = ei / 1000;// //获得结束时间与现在时间的比较
		if (bl < 0) {
			return "0"; // 未到点
		} else if (bl >= 0 && el >= 0) {
			return "1"; // 正常
		} else if (el < 0) {
			return "2"; // 过期
		} else {
			return "3";// 异常
		}

	}

	public static String showTime(long j) throws java.text.ParseException {
		long k = 0;
		String str = "";
		k = j / 1000;
		long day = k / 3600 / 24;// 天
		long hour = (k - day * 24 * 3600) / 3600;// 小时
		long minute = (k - day * 24 * 3600 - hour * 3600) / 60;// 分钟
		long second = k - day * 24 * 3600 - minute * 60 - hour * 3600;// 秒
		if (day > 0)
			str = day + "天" + hour + "小时" + minute + "分钟" + second + "秒";
		else
			str = hour + "小时" + minute + "分钟" + second + "秒";
		if (j == 0) {
			str = "已过期";
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(DateUtil.getFormatDate(new Date(), DateUtil.simple));

	}
}
