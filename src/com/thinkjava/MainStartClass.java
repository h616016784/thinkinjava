package com.thinkjava;

import com.thinkjava.chart2.StaticTest;
import com.thinkjava.chart3.Letter;
import com.thinkjava.chart3.Tank;
import com.thinkjava.chart5.Cupboard;
import com.thinkjava.chart5.House;
import com.thinkjava.chart5.Table;

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
		
		/**
		 * 第4章  流程控制    (if else,whiel,do while,for,return,break,java不支持goto)
		 */
		/**
		 * 第5章 初始化与清理
		 */
		//5.1 构造器初始化  
		//		一个类包含未初始化的string引用，java会将其初始化成null。
		//5.3 默认构造器
		//		如果没有构造器，java会自动创建，如果已近定义了构造器，编译器则不会帮你建构造器,如果你再调用程序会出错!
		//5.7 构造器初始化   代码如下：
//		public class Counter{
//			int i;
//			Counter(){i=7;}
//		}
		//i首先会被置为0，然后变成7；
		//5.7.1 初始化顺序  变量定义的顺序觉得初始化顺序，即使变量定义散布于方法定义之间，他们仍旧会在任何方法调用前初始化。
//		House h=new House();
//		h.f();
		//5.7.2 静态数据的初始化  无论创建多少个对象，静态数据只占用一份存储区域。
		//一下案例已think java的例子为准
//		static Table table=new Table();
//		static Cupboard cupboard=new Cupboard();
//		System.out.println("creating new cupboard() in main");
//		new Cupboard();
		//		初始化顺序是先静态（如果它尚未初始化），然后是非静态 
		
		//5.8  数组初始化??????????(有时间再看 )
		
		//5.9  枚举类型，它有一个有用的地方是可以在switch语句中使用
		
		/**
		 * 第6章  访问权限控制
		 */
		
		/**
		 * 第7章 复用类
		 */
		//7.1  组合语法   
		//		编译器并不是简单的为每一个引用都创建默认对象，提高效率。
		
		//7.3 代理	是继承与组合的中庸之道
		//		编译器强制你去初始化基类，并且要求你在构造器起始处就要这么做，但是它并不监督你必须将成员对象初始化。
		//		（例子见think in java 132页）
		//7.9 初始化及类的加载
		//		语言的初始化过程必须小心控制，java中所有的事务都是对象，每个类的编译代码都存在于它自己的独立文件中。
		//		该文件只在需要使用代码时才加载，也就是初次使用时才加载，而初次使用时会进行初始化，如果有static，那么static
		//		对象和static代码段会顺序先初始化。当然，static只会被初始化一次
		//7.9.1  继承与初始化
		//		（例子看书本146页）
		
		/**
		 * 第8章   多态
		 */
		//8.2.1 方法调用的绑定
		//		Java中除了static方法和final方法外，其他的方法都是后期绑定。声明final有时也可以避免后期绑定。
		
		//8.2.5 如果方法时静态的，那么它就不具有多态性
		//8.3.2 继承与清理
		
		//8.3.3 构造器内部的多态方法行为
		//		如果在一个构造器的内部调用正在构造的对象的某个动态绑定方法，会发生什么呢？
		//			初始化的实际过程如下：
		//			1）在其他任何事物发生之前，将分配给对象的存储空间初始化成二进制的零。
		//			2）此时调用被覆盖的方法，由于步骤1的缘故，radius的值为0.
		//			3）按照声明的顺序调用成员的初始化方法。
		//			4）调用导出类的构造主体。
		
		/**
		 * 第9章  接口
		 */
		//9.7 接口中的域
		//		放入接口中的域都自动是static和final的，在接口中定义的域不能是空final，但是可以被非常量表达式初始化。
		/**
		 * 第10章  内部类
		 */
		//10.2 链接到外部类 
		//		内部类自动获取外部类所有成员的访问权，是如何做到的？
		//			当外部类创建一个内部类时，此内部类会秘密捕获一个指向那个外部类的应用，然后就可以访问外部类成员了，
		//			但是内部类的成员只能在与其外围类的对象相关联的情况下才能被创建。构建内部类对象时，需要一个指向
		//			其外围类对象的应用，如果编译器访问不到这个引用就会报错。
		
	}
	
}
