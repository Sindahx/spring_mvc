package com.dffx.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	
	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		System.out.println(format.format(new Date()));
	}
}
