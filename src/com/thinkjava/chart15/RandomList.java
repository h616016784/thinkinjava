package com.thinkjava.chart15;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	ArrayList<T> storage=new ArrayList<T>();
	Random rand=new Random(47);
	public void add(T item){
		storage.add(item);
	}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
}
