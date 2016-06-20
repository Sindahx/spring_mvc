package com.dffx.utils.tls;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Random;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;

public class CatServer implements Runnable, HandshakeCompletedListener {

	public static final int SERVER_PORT = 11123;

	private final Socket _s;
	private String peerCerName;

	public CatServer(Socket s) {
		_s = s;
	}

	public static void main(String[] args) throws Exception {
		String serverKeyStoreFile = "E:/keytool/catserver.keystore";
		String serverKeyStorePwd = "catserverks";
		String catServerKeyPwd = "catserver";
		String serverTrustKeyStoreFile = "E:/keytool/catservertrust.keystore";
		String serverTrustKeyStorePwd = "catservertrustks";

		KeyStore serverKeyStore = KeyStore.getInstance("JKS");
		serverKeyStore.load(new FileInputStream(serverKeyStoreFile), serverKeyStorePwd.toCharArray());

		KeyStore serverTrustKeyStore = KeyStore.getInstance("JKS");
		serverTrustKeyStore.load(new FileInputStream(serverTrustKeyStoreFile), serverTrustKeyStorePwd.toCharArray());

		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(serverKeyStore, catServerKeyPwd.toCharArray());

		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(serverTrustKeyStore);

		SSLContext sslContext = SSLContext.getInstance("TLSv1");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

		SSLServerSocketFactory sslServerSocketFactory = sslContext.getServerSocketFactory();
		SSLServerSocket sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(SERVER_PORT);
		sslServerSocket.setNeedClientAuth(true);

		while (true) {
			SSLSocket s = (SSLSocket) sslServerSocket.accept();
			CatServer cs = new CatServer(s);
			s.addHandshakeCompletedListener(cs);
			new Thread(cs).start();
		}
	}

	@Override
	public void handshakeCompleted(HandshakeCompletedEvent event) {
		try {
			X509Certificate cert = (X509Certificate) event.getPeerCertificates()[0];
			peerCerName = cert.getSubjectX500Principal().getName();
		} catch (SSLPeerUnverifiedException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 创建空文件
	 * 
	 * @param fileName
	 */
	private File createFile(String fileName) {

		String path = "E:/work/test/";

		File file = new File(path + fileName);
		if (file.exists()) {
			return file;
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;

	}

	private void writeToFile(File file, String content) {
		try {

			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 接收文件方法
	 * 
	 * @param socket
	 * @throws IOException
	 */
	public void run() {
		byte[] inputByte = null;
		int length = 0;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		String filePath = "E:/work/test/" + new Random().nextInt(10000) + ".jpg";

		try {
			try {
				// PrintWriter writer = new PrintWriter(_s.getOutputStream(),
				// true);
				// writer.println("Welcome~, enter exit to leave.");
				dis = new DataInputStream(_s.getInputStream());
				File f = new File("E:/work/test/");
				if (!f.exists()) {
					f.mkdir();
				}
				/*
				 * 文件存储位置
				 */
				fos = new FileOutputStream(new File(filePath));
				inputByte = new byte[1024];
				System.out.println("开始接收数据...");
				while ((length = dis.read(inputByte, 0, inputByte.length)) > 0) {
					fos.write(inputByte, 0, length);
					fos.flush();
				}
				System.out.println("完成接收：" + filePath);
				// writer.println("Bye~, " + peerCerName);
				// writer.close();
			} finally {
				if (fos != null)
					fos.close();
				if (dis != null)
					dis.close();
				if (_s != null)
					_s.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void run() {
	// try {
	// BufferedReader reader = new BufferedReader(new InputStreamReader(_s
	// .getInputStream()));
	// PrintWriter writer = new PrintWriter(_s.getOutputStream(), true);
	// writer.println("Welcome~, enter exit to leave.");
	//			
	//			
	// String s;
	// int i = 0;
	// File file = null;
	// while ((s = reader.readLine()) != null
	// && !s.trim().equalsIgnoreCase("exit")) {
	// // writer.println("Echo: " + s);
	// // System.err.println(s);
	// if (i==0) {
	// file = createFile(s);
	// }
	// if (i!=0) {
	// writeToFile(file, s);
	// }
	// i++;
	// }
	// i =0;
	// writer.println("Bye~, " + peerCerName);
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// try {
	// _s.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }

}