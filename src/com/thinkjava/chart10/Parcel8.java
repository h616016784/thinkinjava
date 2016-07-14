package com.thinkjava.chart10;

public class Parcel8 {
	public Contents contents(){
		return new Contents(){
			private int i=11;
			public int value(){return i;}
		};
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel8 p8=new Parcel8();
		Contents contents = p8.contents();
		System.out.println(contents.value());
	}

}
