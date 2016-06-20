package com.dffx.utils.file;

import java.math.BigDecimal;

public class MathUtil {

	/**
	 * 计算百分比
	 * @param index
	 * @param length
	 * @return
	 * @throws Exception
	 */
	public static String getPercent(long index, long length) {

		double a = index;
		double b = length;

		double percent = (a / b) * 100;
		BigDecimal b1 = new BigDecimal(percent);
		double f1 = b1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

		return f1 + "%";
	}
}
