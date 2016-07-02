package com.thinkjava.chart7;

public class Beetle extends Insect{

	private int k=printInit("Beetle.k initilized");
	public Beetle() {
		System.out.println("k="+k);
		System.out.println("j="+j);
	}
	private static int x2=printInit("static Beetle.x2 initialized");
	public static void main(String[] args){
		System.out.println("Beetle constuctor");
		Beetle b=new Beetle();
	}
}
