package com.dffx.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SysConfig {
	private static final String configPath = "/config.properties";
	public static final String key = "sms.token_time";
	private static Map<String, Object> sysConfigMap;
	private static List<String> keyList;

	@SuppressWarnings("unchecked")
	public static Object getConfig(String name) {
		sysConfigMap = new HashMap<String, Object>();
		keyList = new ArrayList<String>();
		Properties prop = new Properties();
		SysConfig config = new SysConfig();
		File pFile = new File(config.getClass().getResource("/").getPath() + configPath);

		FileInputStream pInStream = null;
		try {
			pInStream = new FileInputStream(pFile);
			prop.load(new InputStreamReader(pInStream, "UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set keyValue = prop.keySet();

		for (Iterator it = keyValue.iterator(); it.hasNext();) {
			String key = (String) it.next();

			sysConfigMap.put(key.toUpperCase(), prop.get(key));
		}

		return sysConfigMap.get(name.toUpperCase());
	}

	public static void setConfig(String key, String value) {

		Properties prop = new Properties();
		SysConfig config = new SysConfig();

		try {
			InputStream in = new BufferedInputStream(new FileInputStream(config.getClass().getResource("/").getPath() + configPath));

			prop.load(in); // /加载属性列表

			in.close();

			FileOutputStream poutStream = new FileOutputStream(config.getClass().getResource("/").getPath() + configPath);// true表示追加打开

			prop.setProperty(key, value);
			prop.store(poutStream, "update Date:" + DateUtil.getFormatDate(new Date(), DateUtil.simple));
			poutStream.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static int isContainKey(String key) {
		int j = -1;

		for (int i = 0; i < keyList.size(); i++) {
			String keytemp = keyList.get(i);
			if (keytemp.equalsIgnoreCase(key)) {
				return i;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		SysConfig.setConfig(key, "789798");
	}
}
