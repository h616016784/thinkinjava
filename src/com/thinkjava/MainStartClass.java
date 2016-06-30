package com.thinkjava;

import com.thinkjava.chart2.StaticTest;
import com.thinkjava.chart3.Letter;
import com.thinkjava.chart3.Tank;

public class MainStartClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("think in java 程序开始！");
		
		/**
		 * 第2章 一切都是对象
		 */
		//2.1 用引用操作对象
		 //2.2.2,基本数据类型
		//		基本数据类型变量直接存储值，并置于栈中，效率更高
		//2.3.1 作用域  java中不会隐藏较大的作用域的变量
		//      对象作用域不具有和基本类型一样的生命周期。当用new创建一个java对象时，他可以存活于作用域之外。
//		{
//				String s=new String("abc");
//		}
		//		引用s在作用域消终点就消失了，s指向的String对象仍继续占据内存空间。
		//		在这段代码之后我们无法再访问这个对象，因为对它的唯一引用已超出了作用域的范围。
		//2.6.3 static关键字
		//		static定义事物时为其分配单一存储空间，这个域或方法不会与包含它的那个类的任何对象实例关联在一起。(非静态为每个对象分配内存空间)
//		StaticTest s1=new StaticTest();
//		StaticTest s2=new StaticTest();
//		System.out.println(s1.i==s2.i);
		
		/**
		 * 第3章 操作符
		 */
		//在最底层，java中的数据是通过使用操作符来操作的
		//3.4 赋值 基本类型的赋值，就是存储了实际的数值，并非指向一个对象的引用。赋值时是直接将一个地方的内容复制到另一个地方
		//		而对象赋值是将“引用”从一个地方复制到 另一个地方。
		
		//(以下现象为别名机制)
//		Tank t1=new Tank();
//		Tank t2=new Tank();
//		t1.level=9;
//		t2.level=47;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
//		t1=t2;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
//		t1.level=27;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		
		//3.6 自动递增和递减   ++a、--a先执行运算，再生成值； a++、a--先生成值，再执行运算。
//		int i=1;
//		System.out.println("i: "+i);
//		System.out.println("i: "+ ++i);
//		System.out.println("i: "+ i++);
//		
//		System.out.println("i: "+i);
//		System.out.println("i: "+ --i);
//		System.out.println("i: "+ i--);
		
		//3.7.1测试对象的对等性,
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1==n2);
//		System.out.println(n1!=n2);
//		System.out.println(n1.equals(n2));
		
		//3.8 逻辑操作符   编写一个程序模拟抛硬币的结果？？？？
		//3.8.1 短路  && ||   前面的表达式不满足则后面的表达式不在继续，以提高性能
		
	}
	
}
