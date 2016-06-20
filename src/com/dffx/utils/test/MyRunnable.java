package com.dffx.utils.test;

public class MyRunnable implements Runnable{
	 private int ticket = 10;  
	 private Test test = new Test();
	    public void run(){  
	        for (int i=0;i<10;i++)  
	        {  
	            if(ticket > 0){  
	            	ticket --;
	             int val =test.getNext();
	                System.out.println("val = " + val);  
	            }  
	        }  
	    }  
}
