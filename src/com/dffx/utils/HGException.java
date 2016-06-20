package com.dffx.utils;

import org.apache.log4j.Logger;

/***
 * 数据库连接自定义异常
 * @author tongyicheng
 *
 */
@SuppressWarnings("serial")
public class HGException extends Exception{

	private static Logger log = Logger.getLogger(DFFXDBException.class);
	
	public HGException() {  
		
		super();
		  
		}  
		  
		public HGException(String msg) {  
		  
			super(msg);  
			
		}  
		  
		public HGException(String msg, Throwable cause) {  
		  
		super(msg, cause);  
		  
		}  
		  
		public HGException(Throwable cause) {  
		  
		super(cause);  
		  
		}  
}
