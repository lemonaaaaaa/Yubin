package com.dev;

public class SingltonExample {
	public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance(); //new Singleton();
    Singleton s2 = Singleton.getInstance();
    
    
    
    System.out.println(s1);
    System.out.println(s2);   
    
	}
}
