package com.dffx.utils.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;


public class JsonFile{
	
	
	private static Logger log = Logger.getLogger(JsonFile.class);
	
	public static final String randomFile ="randomFile";
	
	//读文件，返回字符串
	public static String ReadFile(String path){
	    File file = new File(path);
	    BufferedReader reader = null;
	    String laststr = "";
	    try {
	     //System.out.println("以行为单位读取文件内容，一次读一整行：");
	     reader = new BufferedReader(new FileReader(file));
	     String tempString = null;
	     int line = 1;
	     //一次读入一行，直到读入null为文件结束
	     while ((tempString = reader.readLine()) != null) {
	      //显示行号
	      System.out.println("line:"+ line+ ": "+tempString);
	      laststr = laststr + tempString;
	      line++ ;
	     }
	     reader.close();
	    } catch (IOException e) {
	     e.printStackTrace();
	    } finally {
	     if (reader != null) {
	      try {
	    	  reader.close();
	      } catch (IOException e1) {
	    	  log.info("读json文件："+e1.getMessage());
	      }
	     }
	    }
	    return laststr;
	}
	   
	//把json格式的字符串写到文件
	public static void writeFile(String filePath, String sets) throws IOException {
	    FileWriter fw = new FileWriter(filePath);
	    PrintWriter out = new PrintWriter(fw);
	    out.write(sets);
	    out.println();
	    fw.close();
	    out.close();
	   }
}
