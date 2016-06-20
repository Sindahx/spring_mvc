package com.dffx.utils.sms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.httpclient.NameValuePair;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dffx.servlet.SpringPropertyUtil;
import com.dffx.utils.DateUtil;
import com.dffx.utils.httpClient.HttpProtocolHandler;
import com.dffx.utils.httpClient.HttpRequest;
import com.dffx.utils.httpClient.HttpResponse;
import com.dffx.utils.httpClient.HttpResultType;

public class SendSmsUtil {

	/**
     * 支付宝提供给商户的服务接入网关URL(新)
     */
    public static final String DX_SEND_ACCESS_TOKEN= "https://oauth.api.189.cn/emp/oauth2/v3/access_token?";
    public static final String DX_SEND_TEMPLATE_MESSAGE = "http://api.189.cn/v2/emp/templateSms/sendSms?";
    
	/**
     * 建立请求，以模拟远程HTTP的POST请求方式构造并获取支付宝的处理结果
     * 如果接口中没有上传文件参数，那么strParaFileName与strFilePath设置为空值
     * 如：buildRequest("", "",sParaTemp)
     * @param strParaFileName 文件类型的参数名
     * @param strFilePath 文件路径
     * @param sParaTemp 请求参数数组
     * @return 支付宝处理结果
     * @throws Exception
     */
    public static String buildRequest(String strParaFileName, String strFilePath,Map<String, String> sParaTemp,String url) throws Exception {

        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();

        HttpRequest request = new HttpRequest(HttpResultType.BYTES);
        //设置编码集
        request.setCharset("utf-8");

        request.setParameters(generatNameValuePair(sParaTemp));
        request.setUrl(url+"_input_charset=utf-8");

        HttpResponse response = httpProtocolHandler.execute(request,strParaFileName,strFilePath);
        if (response == null) {
            return null;
        }
        
        String strResult = response.getStringResult();

        return strResult;
    }
    
    /**
     * MAP类型数组转换成NameValuePair类型
     * @param properties  MAP类型数组
     * @return NameValuePair类型数组
     */
    private static NameValuePair[] generatNameValuePair(Map<String, String> properties) {
        NameValuePair[] nameValuePair = new NameValuePair[properties.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            nameValuePair[i++] = new NameValuePair(entry.getKey(), entry.getValue());
        }

        return nameValuePair;
    }
    
    /***
     * 将模板参数转为json 格式字符串
     * @return
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonGenerationException 
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonGenerationException 
     */
    public static String getJsonByParams(String userName,String randomCode) throws JsonGenerationException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Map<Object, Object> map = new HashMap<Object, Object>();
		//这里存放模板参数，如果模板没有参数直接用template_param={}
		map.put("username", userName);
		map.put("randcode", randomCode);
		
    	return mapper.writeValueAsString(map);
    }
    	
    /***
     * 获取令牌参数
     * @return
     */
	public static Map<String,String> getTokenParams(){
    	//把请求参数打包成数组
		Map<String, String> sParaTemp = new HashMap<String, String>();
        sParaTemp.put("grant_type",String.valueOf(SpringPropertyUtil.getContextProperty("sms.grant_type")));
        sParaTemp.put("app_id", String.valueOf(SpringPropertyUtil.getContextProperty("sms.app_id")));
        sParaTemp.put("app_secret", String.valueOf(SpringPropertyUtil.getContextProperty("sms.app_secret")));
		
		return sParaTemp;
    }
    
    /***
     * 获取发送模板信息的参数
     * @return
     */
	@SuppressWarnings("deprecation")
	public static Map<String,String> getTemplateParams(String token,String accePhone,String userName,String randomCode,String templateId){
    	
    	//把请求参数打包成数组
		Map<String, String> sParaTemp = new HashMap<String, String>();
        sParaTemp.put("app_id",String.valueOf(SpringPropertyUtil.getContextProperty("sms.app_id")));
        sParaTemp.put("access_token", token);
        sParaTemp.put("acceptor_tel", accePhone);
        sParaTemp.put("template_id", templateId); //String.valueOf(SpringPropertyUtil.getContextProperty("sms.template_id"))
        try {
			sParaTemp.put("template_param", getJsonByParams(userName,randomCode));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        sParaTemp.put("timestamp", DateUtil.getFormatDate(new Date(),DateUtil.simple));
        
		return sParaTemp;
    }
    
    /***
     * json 转 map
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> parseJSON2Map(String jsonStr){  
        Map<String, Object> map = new HashMap<String, Object>();  
        //最外层解析  
        JSONObject json = JSON.parseObject(jsonStr);  
        for(Object k : json.keySet()){  
            Object v = json.get(k);   
            //如果内层还是数组的话，继续解析  
            if(v instanceof JSONArray){  
                List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();  
                Iterator<Object> it = ((JSONArray)v).iterator();  
                while(it.hasNext()){  
                    JSONObject json2 = (JSONObject) it.next();  
                    list.add(parseJSON2Map(json2.toString()));  
                }  
                map.put(k.toString(), list);  
            } else {  
                map.put(k.toString(), v);  
            }  
        }  
        return map;  
    }  
    
    public static String randomFor6() {
		Random random = new Random();
		String result = "";
		for (int i = 0; i < 6; i++) {
			result += random.nextInt(10);
		}
//		System.out.print(result);
		return result;
	}
    
    public static void main(String[] args) {
    	try {
    		
    		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
			
    		String userName = "童怿成";
    		String phone = "15112274770";
			String result = SendSmsUtil.buildRequest("", "", getTokenParams(),DX_SEND_ACCESS_TOKEN);
			
			//sms.template_id	sms.pwd.template_id
			String templateId = String.valueOf(SpringPropertyUtil.getContextProperty("sms.pwd.template_id"));
			System.out.println("模板id="+templateId);
			
			Map<String, Object> map = parseJSON2Map(result);
			System.out.println("result="+result);
			String token = String.valueOf(map.get("access_token"));
			System.out.print("access_token:"+token);
			String result2 = SendSmsUtil.buildRequest("", "", getTemplateParams(token,phone,userName,randomFor6(),templateId),DX_SEND_TEMPLATE_MESSAGE);
			System.out.println(result2);
			
    		String aa = DateUtil.getFormatDate(new Date(),DateUtil.simple);
    		System.out.println(aa);
    		
    		
    		int in = DateUtil.calLastedTime(DateUtil.StrToDate("2015-07-24 10:40:26", DateUtil.simple));
    		System.out.println(in);
    		
    		Date date = DateUtil.StrToDate(aa, DateUtil.dtShort);
    		System.out.println(date);
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
