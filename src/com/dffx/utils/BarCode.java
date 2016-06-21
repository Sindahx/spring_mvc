package com.dffx.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class BarCode {

	public static void main(String[] args) {
		try {

			String content = "2222222222222222222222222222222222";
			String path = "D:/t";

			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
			File file1 = new File(path, "test.jpg");
			MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
			BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ImageIO.write(image, "jpg", out);
			byte[] b = out.toByteArray();

			System.err.println(b.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void barCode() {

	}

}
