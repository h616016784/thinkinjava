package com.thinkjava.chart5;

public class Table {
	static Bowl bowl1=new Bowl(1);
	public Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	public void f2(int market){
		System.out.println("f2("+market+")");
	}
	static Bowl bowl2=new Bowl(2);
}
