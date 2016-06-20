package com.dffx.utils.image;

import java.io.IOException;

public class ValidateCodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String path = "d:/t/test.jpg";
		
		ValidateCode vCode = new ValidateCode(120, 40, 5, 100);
		try {
			System.out.println(vCode.getCode() + " >" + path);
			vCode.write(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}