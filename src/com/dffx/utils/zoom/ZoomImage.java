package com.dffx.utils.zoom;

import java.io.File;
import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.Thumbnails.Builder;

public class ZoomImage {

	public static void zoom(String inputFoler, String outputFolder, String fileName) throws Exception {

		File file1 = new File(outputFolder);
		if (!file1.exists()) {
			file1.mkdirs();
		}

		Builder<File> file = Thumbnails.of(inputFoler + "/" + fileName);
		file.size(85, 85);

		file.toFile(outputFolder + "/" + fileName);

	}

	public static void zoomTest(String inputFoler, String outputFolder, String fileName) {

		File file1 = new File(outputFolder);
		if (!file1.exists()) {
			file1.mkdirs();
		}

		Builder<File> file = Thumbnails.of(inputFoler + "/" + fileName);
		file.size(1280, 960);
		try {
			file.toFile(outputFolder + "/" + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			zoom("E:/", "E:/zoom", "down.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
