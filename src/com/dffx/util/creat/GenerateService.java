package com.dffx.util.creat;

//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;

/**
 * 生成service 服务
 * 
 * @author huangxing
 * 
 */
public class GenerateService {

	private String packageNameDto = "com.csair.test.dto";
//	private String url = "jdbc:mysql://192.168.1.123:3306/dffx_db_ifazai";
//	private String username = "root";
//	private String password = "12345";
//	private String driverClass = "com.mysql.jdbc.Driver";
//	private DatabaseMetaData dbMetaData = null;
	private String packageName = "com.csair.test.dto;";
	private String path = "E:\\office\\com\\service\\";
	private String pageModel = "com.dffx.pager.PageModel;"; // 分页用的包

//	public GenerateService() {
//		try {
//			Class.forName(driverClass);
//			Connection conn = DriverManager.getConnection(url, username, password);
//			dbMetaData = conn.getMetaData();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	/**
//	 * @Description: 获取所有的表
//	 * @author: ppt
//	 * @date: 2015-3-16 上午10:12:57
//	 * @return: void
//	 */
//	public List<String> getAllTableList() {
//		List<String> tableList = new ArrayList<String>();
//		try {
//			String[] types = { "TABLE" };
//			ResultSet rs = dbMetaData.getTables(null, null, "%", types);
//			while (rs.next()) {
//				String tableName = rs.getString("TABLE_NAME"); // 表名
//				tableList.add(tableName);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return tableList;
//	}

	// /**
	// * 处理字符串，去掉下划线“_”，并且把下划线的下一个字符变大写，flag为true，表示首字母要大写
	// * @param name
	// * @param flag
	// * @return
	// */
	// private String getFormatString(String name, boolean flag) {
	// name = name.toLowerCase();
	// String[] nameTemp = name.split("_");
	// StringBuffer buffer = new StringBuffer();
	// for(String str : nameTemp) {
	// String head = str.substring(0, 1).toUpperCase();
	// String tail = str.substring(1);
	// buffer.append(head+tail);
	// }
	// StringBuffer result = null;
	// if(!flag) {
	// result = new StringBuffer();
	// String head = buffer.substring(0, 1).toLowerCase();
	// String tail = buffer.substring(1);
	// result.append(head+tail);
	// return result.toString();
	// }
	// return buffer.toString();
	// }
	// /**
	// * 把String内容写到文件
	// * @param fileName
	// * @param content
	// */
	// private void outputToFile(String fileName, String content) {
	// OutputStream os = null;
	// try {
	// os = new FileOutputStream(path+fileName);
	// } catch (FileNotFoundException e1) {
	// e1.printStackTrace();
	// }
	// byte[] b = content.getBytes();
	// try {
	// os.write(b);
	// os.flush();
	// } catch (IOException e) {
	// e.printStackTrace();
	// } finally {
	// try {
	// os.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }

	public void getService(List<String> tableList) {
//		List<String> tableList = getAllTableList();
		for (String tableName : tableList) {
			// String table = getFormatString(tableName, true);
			String table = Generate.getTablieName(tableName, true);
			String className = table + "Service";
			StringBuffer sb = new StringBuffer();
			sb.append("package " + packageName + "\n\n");
			sb.append("import " + packageNameDto + "." + table + ";\n");
			sb.append("import java.util.List;\n");
			sb.append("import javax.ws.rs.POST;\n");
			sb.append("import javax.ws.rs.GET;\n");
			sb.append("import javax.ws.rs.PathParam;\n");
			sb.append("import javax.ws.rs.Path;\n");
			sb.append("import javax.ws.rs.Produces;\n");
			sb.append("import javax.ws.rs.core.MediaType;\n");
			sb.append("import " + pageModel + "\n");

			//sb.append("\n@Path(\"/" + className.substring(0, 1).toLowerCase() + className.substring(1) + "\")\n");
			sb.append("public interface " + className + " {\n\n");

			sb.append("\t//增加实体\n");
			sb.append("\tpublic long addEntity(" + table + " dto) throws Exception;\n\n");

			sb.append("\t//删除实体\n");
			sb.append("\tpublic boolean deleteEntity(@PathParam(\"id\") long id) throws Exception;\n\n");

			sb.append("\t//修改实体\n");
			sb.append("\tpublic long updateEntity(" + table + " dto) throws Exception;\n\n");

			sb.append("\t//查询实体\n");
			sb.append("\tpublic " + table + " findEntity(" + table + " dto) throws Exception;\n\n");

			sb.append("\t//查询实体List\n");
			sb.append("\tpublic List<" + table + "> findEntityList(PageModel<" + table + "> dto);\n\n");

			sb.append("}\n");
			Generate.outputToFile(className + ".java", sb.toString(), path);
		}
	}

//	public static void main(String[] agrs) {
//		GenerateService aa = new GenerateService();
//		aa.getService();
//	}

}
