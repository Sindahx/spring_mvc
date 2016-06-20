package com.dffx.utils;

import java.sql.SQLException;

import org.apache.log4j.Logger;

/***
 * 数据库连接自定义异常
 * @author tongyicheng
 *
 */
@SuppressWarnings("serial")
public class DFFXDBException extends SQLException{

	private static Logger log = Logger.getLogger(DFFXDBException.class);
	
	public DFFXDBException() {  
		  
		super();  
		  
		}  
		  
		public DFFXDBException(String msg) {  
		  
//		super(msg);  
			log.info(msg+"：准备切换数据连接");
			System.out.println(msg+"：准备切换数据连接");
		}  
		  
		public DFFXDBException(String msg, Throwable cause) {  
		  
		super(msg, cause);  
		  
		}  
		  
		public DFFXDBException(Throwable cause) {  
		  
		super(cause);  
		  
		}  
}
