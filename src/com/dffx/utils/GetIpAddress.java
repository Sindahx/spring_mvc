package com.dffx.utils;

import javax.servlet.http.HttpServletRequest;

public class GetIpAddress {
	
	/**
	 * 根据请求request来源获取IP地址
	 * @param request
	 * @return
	 */
	public static String getIp(HttpServletRequest request){
		
		String ip = null;
		try{
			if(request == null){
				return null;
			}
		    ip = request.getHeader("x-forwarded-for");
		    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
		        ip = request.getHeader("Proxy-Client-IP");
		    }
		    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
		        ip = request.getHeader("WL-Proxy-Client-IP");
		    }
		    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
		        ip = request.getRemoteAddr();
		    }
		}catch (Exception e) {
			e.printStackTrace();
		}
	    return ip;
	}

}
