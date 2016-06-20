package com.dffx.utils.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.codehaus.xfire.util.Base64;

import com.dffx.utils.DateUtil;

/**
 * 操作文件的类
 * 
 * @author TongYiCheng 2015-07-32
 */
public class FilesUtils {


	/**
	 * @Method: makeFileName
	 * @Description: 生成上传文件的文件名，文件名以：uuid+"_"+文件的原始名称
	 * @Anthor:孤傲苍狼
	 * @param filename
	 *            文件的原始名称
	 * @return uuid+"_"+文件的原始名称
	 */
	public static String makeFileName(String filename) { // 2.jpg
		// 为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
		long time = DateUtil.getDateTime();	
		filename =  time + "." + filename;
		return UUID.randomUUID().toString() + "_" + filename;
	}

	/**
	 * 为防止一个目录下面出现太多文件，要使用hash算法打散存储
	 * 
	 * @Method: makePath
	 * @Description:
	 * @Anthor:
	 * 
	 * @param filename
	 *            文件名，要根据文件名生成存储目录
	 * @param savePath
	 *            文件存储路径
	 * @return 新的存储目录
	 */
	public static String makePath(String filename, String savePath, String datedir) {
		// 得到文件名的hashCode的值，得到的就是filename这个字符串对象在内存中的地址

		// String datedir = DateUtil.getFormatDate(DateUtil.dtShort);

		// int hashcode = filename.hashCode();
		// int dir1 = hashcode & 0xf; // 0--15
		// int dir2 = (hashcode & 0xf0) >> 4; // 0-15
		// 构造新的保存目录
		// String dir = savePath + "\\" + dir1 + "\\" + dir2; // upload\2\3
		String dir = savePath + "/" + datedir; // upload\2\3
		// upload\3\5
		// File既可以代表文件也可以代表目录
		File file = new File(dir);
		// 如果目录不存在
		if (!file.exists()) {
			// 创建目录
			file.mkdirs();
		}
		return dir;
	}
}
