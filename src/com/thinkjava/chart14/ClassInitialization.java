package com.thinkjava.chart14;

import java.util.Random;

public class ClassInitialization {
	public static Random random=new Random(47);
	public static void main(String[] args) {
		Class initable=Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticFinal);
		try {
			Class Initable3=Class.forName("Initable3");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
