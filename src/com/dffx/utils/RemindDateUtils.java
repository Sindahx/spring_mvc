package com.dffx.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RemindDateUtils {
	/** 
	* 获取  当前年、半年、季度、月、日、小时 开始结束时间 
	*/ 
	private static final SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd"); 
	private static final SimpleDateFormat longHourSdf = new SimpleDateFormat("yyyy-MM-dd HH"); 
	private static final SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    
    /** 
     * 获得本周的第一天，周一 
     * 
     * @return 
     */ 
	public static Date getCurrentWeekDayStartTime() { 
	    Calendar c = Calendar.getInstance(); 
	    try { 
	        int weekday = c.get(Calendar.DAY_OF_WEEK) - 2; 
	        c.add(Calendar.DATE, -weekday); 
	        c.setTime(longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00")); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return c.getTime(); 
	} 
	
	/** 
	 * 获得本周的最后一天，周日 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentWeekDayEndTime() { 
	    Calendar c = Calendar.getInstance(); 
	    try { 
	        int weekday = c.get(Calendar.DAY_OF_WEEK); 
	        c.add(Calendar.DATE, 8 - weekday); 
	        c.setTime(longSdf.parse(shortSdf.format(c.getTime()) + " 23:59:59")); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return c.getTime(); 
	} 
	
	/** 
	 * 获得本天的开始时间，即2012-01-01 00:00:00 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentDayStartTime() { 
	    Date now = new Date(); 
	    try { 
	        now = shortSdf.parse(shortSdf.format(now)); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 获得本天的结束时间，即2012-01-01 23:59:59 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentDayEndTime() { 
	    Date now = new Date(); 
	    try { 
	        now = longSdf.parse(shortSdf.format(now) + " 23:59:59"); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 获得本小时的开始时间，即2012-01-01 23:59:59 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentHourStartTime() { 
	    Date now = new Date(); 
	    try { 
	        now = longHourSdf.parse(longHourSdf.format(now)); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 获得本小时的结束时间，即2012-01-01 23:59:59 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentHourEndTime() { 
	    Date now = new Date(); 
	    try { 
	        now = longSdf.parse(longHourSdf.format(now) + ":59:59"); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 获得本月的开始时间，即2012-01-01 00:00:00 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentMonthStartTime() { 
	    Calendar c = Calendar.getInstance(); 
	    Date now = null; 
	    try { 
	        c.set(Calendar.DATE, 1); 
	        now = shortSdf.parse(shortSdf.format(c.getTime())); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 当前月的结束时间，即2012-01-31 23:59:59 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentMonthEndTime() { 
	    Calendar c = Calendar.getInstance(); 
	    Date now = null; 
	    try { 
	        c.set(Calendar.DATE, 1); 
	        c.add(Calendar.MONTH, 1); 
	        c.add(Calendar.DATE, -1); 
	        now = longSdf.parse(shortSdf.format(c.getTime()) + " 23:59:59"); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 当前年的开始时间，即2012-01-01 00:00:00 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentYearStartTime() { 
	    Calendar c = Calendar.getInstance(); 
	    Date now = null; 
	    try { 
	        c.set(Calendar.MONTH, 0); 
	        c.set(Calendar.DATE, 1); 
	        now = shortSdf.parse(shortSdf.format(c.getTime())); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
	/** 
	 * 当前年的结束时间，即2012-12-31 23:59:59 
	 * 
	 * @return 
	 */ 
	public static Date getCurrentYearEndTime() { 
	    Calendar c = Calendar.getInstance(); 
	    Date now = null; 
	    try { 
	        c.set(Calendar.MONTH, 11); 
	        c.set(Calendar.DATE, 31); 
	        now = longSdf.parse(shortSdf.format(c.getTime()) + " 23:59:59"); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	    return now; 
	} 
	
}

