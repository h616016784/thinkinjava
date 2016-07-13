package com.thinkjava.chart21;

public class LiftOff implements Runnable{
	protected int cuntDown=10;
	private static int taskCount=0;
	private final int id=taskCount++;

	public LiftOff(){
	}
	public LiftOff(int countDown){
		this.cuntDown=countDown;
	}
	@Override
	public void run() {
		while(cuntDown-->0){
			System.out.println(status());
			Thread.yield();
		}
	}
	private String status(){
		return "#"+id+"("+(cuntDown>0?cuntDown:"LiftOff")+")";
	}
}

