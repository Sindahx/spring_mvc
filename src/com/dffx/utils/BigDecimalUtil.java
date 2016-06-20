package com.dffx.utils;

import java.math.BigDecimal;

public class BigDecimalUtil {
	
	public static BigDecimal ZERO = new BigDecimal("0.00");;
	public static BigDecimal TWO = new BigDecimal("2.00");;

	public static BigDecimal valueOf(Object v1) {
		if(v1 == null) {
			return ZERO;
		}
		if(v1 instanceof String){
			if("".equals(v1)) {
				return ZERO;
			}
			return new BigDecimal(String.valueOf(v1));
		}
		if(v1 instanceof BigDecimal) {
			return (BigDecimal)v1;
		}
		return ZERO;
	}
	public static BigDecimal mul(BigDecimal bd, Long v1) {
		BigDecimal bd1 = new BigDecimal(v1);
		return bd.multiply(bd1);
	}
	
	public static BigDecimal mul(BigDecimal bd, Integer v1) {
		BigDecimal bd1 = new BigDecimal(v1);
		return bd.multiply(bd1);
	}
	
	public static BigDecimal mul(BigDecimal bd, Double v1) {
		BigDecimal bd1 = new BigDecimal(v1);
		return bd.multiply(bd1);
	}
	
	public static BigDecimal add(BigDecimal bd1, BigDecimal bd2) {
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.add(bd2);
	}
	
	public static BigDecimal sub(BigDecimal bd1, BigDecimal bd2) {
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.subtract(bd2);
	}
	
	public static BigDecimal mul(BigDecimal bd1, BigDecimal bd2) {
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.multiply(bd2);
	}
	
	public static BigDecimal div(BigDecimal bd1, BigDecimal bd2) {
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.divide(bd2, 4, BigDecimal.ROUND_UP);
	}
	
	public static int compareTo(BigDecimal bd1, BigDecimal bd2) {
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.compareTo(bd2);
	}
	
	public static BigDecimal abs(BigDecimal bd1, BigDecimal bd2){
		if(bd1 == null) {
			bd1 = ZERO;
		}
		
		if(bd2 == null) {
			bd2 = ZERO;
		}
		return bd1.subtract(bd2).abs();
	}
}
