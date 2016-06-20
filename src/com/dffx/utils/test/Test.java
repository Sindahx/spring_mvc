package com.dffx.utils.test;

import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;

@ThreadSafe
public class Test {
	
	@GuardedBy("this") private int val;
	public synchronized int getNext(){
		return val++;
	}
	
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		
		new Thread(my).start();  
        new Thread(my).start();  
        new Thread(my).start();  
        new Thread(my).start();  
        new Thread(my).start();  
        new Thread(my).start();  
	}
	
}
