package com.thinkjava.chart15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind){
		this.kind=kind;
	}
	@SuppressWarnings("unchecked")
	T[] create(int size){
		return (T[]) Array.newInstance(kind, size);
	}
	public static void main(String[] args){
		ArrayMaker<String> stingMaker=new ArrayMaker<String>(String.class);
		String[] stringArray=stingMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}
