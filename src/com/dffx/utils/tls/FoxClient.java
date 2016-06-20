package com.dffx.utils.tls;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class FoxClient {

	public static void main(String[] args) throws Exception {
		String clientKeyStoreFile = "E:/keytool/foxclient.keystore";
		String clientKeyStorePwd = "foxclientks";
		String foxclientKeyPwd = "foxclient";
		String clientTrustKeyStoreFile = "E:/keytool/foxclienttrust.keystore";
		String clientTrustKeyStorePwd = "foxclienttrustks";

		KeyStore clientKeyStore = KeyStore.getInstance("JKS");
		clientKeyStore.load(new FileInputStream(clientKeyStoreFile), clientKeyStorePwd.toCharArray());

		KeyStore clientTrustKeyStore = KeyStore.getInstance("JKS");
		clientTrustKeyStore.load(new FileInputStream(clientTrustKeyStoreFile), clientTrustKeyStorePwd.toCharArray());

		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(clientKeyStore, foxclientKeyPwd.toCharArray());

		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(clientTrustKeyStore);

		SSLContext sslContext = SSLContext.getInstance("TLSv1");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

		SSLSocketFactory socketFactory = sslContext.getSocketFactory();
		Socket socket = socketFactory.createSocket("localhost", CatServer.SERVER_PORT);

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		// String fileName = getFileName();
		// if (fileName != null) {
		//			
		// send(fileName, out);
		// getContent(out);
		// send("exit", out);
		// }
		File file = new File(path);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		FileInputStream fis = new FileInputStream(file);
		byte[] sendBytes = new byte[1024];

		int length = 0;
		double sumL = 0;

		while ((length = fis.read(sendBytes, 0, sendBytes.length)) > 0) {
			sumL += length;
			System.out.println("已传输：" + ((sumL / 1) * 100) + "%");
			dos.write(sendBytes, 0, length);
			dos.flush();
		}

		// receive(in);
		socket.close();
	}

	private static String path = "D:/t/test.jpg";

	private static String getFileName() {

		File file = new File(path);
		if (file.exists()) {
			return file.getName();
		}

		return null;
	}

	private static String getContent(PrintWriter out) {

		File file = new File(path);
		String result = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				result = result + "\n" + s;
				send(result, out);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void send(String s, PrintWriter out) throws IOException {
		// System.out.println("Sending: " + s);
		out.println(s);
	}

	public static void receive(BufferedReader in) throws IOException {
		String s;
		while ((s = in.readLine()) != null) {
			System.out.println("Reveived: " + s);
		}
	}

	// public static void main(String[] args) throws Exception {
	// String clientKeyStoreFile = "E:/keytool/foxclient.keystore";
	// String clientKeyStorePwd = "foxclientks";
	// String foxclientKeyPwd = "foxclient";
	// String clientTrustKeyStoreFile = "E:/keytool/foxclienttrust.keystore";
	// String clientTrustKeyStorePwd = "foxclienttrustks";
	//  
	// KeyStore clientKeyStore = KeyStore.getInstance("JKS");
	// clientKeyStore.load(new FileInputStream(clientKeyStoreFile),
	// clientKeyStorePwd.toCharArray());
	//  
	// KeyStore clientTrustKeyStore = KeyStore.getInstance("JKS");
	// clientTrustKeyStore.load(new FileInputStream(clientTrustKeyStoreFile),
	// clientTrustKeyStorePwd.toCharArray());
	//  
	// KeyManagerFactory kmf =
	// KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
	// kmf.init(clientKeyStore, foxclientKeyPwd.toCharArray());
	//  
	// TrustManagerFactory tmf =
	// TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
	// tmf.init(clientTrustKeyStore);
	//  
	// SSLContext ssl = SSLContext.getInstance("TLSv1");
	//		 
	// KeyManager[] keyManagers = new KeyManager[1];
	// keyManagers = kmf.getKeyManagers();
	//
	// TrustManager[] trustManagers = tmf.getTrustManagers();
	// ssl.init(keyManagers, trustManagers, new SecureRandom());
	//
	// HttpsConfigurator configurator = new HttpsConfigurator(ssl);
	// Integer port = Integer.parseInt("8080");
	// HttpsServer httpsServer = HttpsServer.create(new
	// InetSocketAddress("192.168.1.50", port), 0);
	// httpsServer.setHttpsConfigurator(configurator);
	//
	// Implementor implementor = new Implementor(); // class with @WebService
	// etc.
	// HttpContext context = (HttpContext)
	// httpsServer.createContext("/EventWebService");
	// Endpoint endpoint = Endpoint.create( implementor );
	// endpoint.publish(context);
	// }

}