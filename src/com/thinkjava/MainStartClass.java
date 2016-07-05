package com.thinkjava;

import java.util.LinkedList;
import java.util.Queue;

import com.thinkjava.chart10.Contents;
import com.thinkjava.chart10.Destination;
import com.thinkjava.chart10.Paral4;
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
		//10.3 使用.this与.new  如果想生成外部类对象的引用，可在外部类名字后面加.this,这样产生的引用自动地具有正确的
		//			类型，并在编译期就检测，没有运行时的开销。
		//			而如果想创建内部类对象时 用”外部类对象.new 内部类“,但如果你创建的是静态内部类你就不用外部类的对象。
		//10.4 内部类与向上转型
//		Paral4 p=new Paral4();
//		Contents contents = p.contents();
//		Destination destination = p.destination("haha");
//		int value = contents.value();
//		String readLable = destination.readLable();
//		System.out.println("contents:"+value+"    destination:"+readLable);
		//不可用p.new PContents();，因为Pcontents类是private权限
		
		//10.6 匿名内部类（有时间再看）
		//10.7 嵌套类
		//		要创建嵌套类的对象，并不需要其外部类的对象。
		//		不能从嵌套类的对象访问非静态的外围对象。
		//		嵌套类与普通内部类还有一个区别，不同内部类的字段与方法，只能放在类的外部层次上，所有普通的内部类不能有
		//		static数据和static字段，也不能包含嵌套类，但是嵌套类可以包含所有这些东西。	
		//10.8 为什么需要内部类？最主要的原因是：每个内部类都能独立地继承自一个（接口的）实现，所以无论外部类是否已经
		//			继承了实现，对于内部类都没有影响。
		
		/**
		 * 第11章 持有对象
		 */
		//数组是保存一组对象的最有效的方式，如果保存一组基本类型数据，推荐使用这种方法。但是数组有固定尺寸
		//java提供了基本类型是List、Set、Queue和Map的容器
		//11.2 基本概念
		//		java容器类的用途是保存对象，并将其划分为两个不同的概念
		//		1）Collection。一个独立元素的序列,List必须是顺序存储，Set不能重复，Queue按照排队规则来确定对象产生的顺序。
		//		2）Map。一组成对的“键值对”
		//11.8 Stack 通常指先进后出的容器
		//		LinkedList具有能够直接实现栈的所有功能和方法。因此可直接将LinkedList作为栈使用。
		//11.11 Queue,队列是先进先出的容器。LinkedList提供了支持的方法，并且它实现了Queue接口。
		
//		Queue<Character> queue=new LinkedList<Character>();
//		for (char c:"brontosaurus".toCharArray()) {
//			queue.offer(c);
//		}
//		while(queue.peek()!=null){
//			System.out.println(queue.remove()+"");
//		}
		/**
		 * 第12章 通过异常处理错误
		 */
		//12.6 捕获所有的异常（以后有时间仔细的看）
		//12.7 java标准异常
		//		RuntimeException是一个特例，对于这种异常类型，编译器不需要异常说明，其输出给System.err
		//		如果RuntimeException没有捕获而直达main（）函数，那么程序退出前将调用异常的pirntStackTrace（）方法
//		throw new RuntimeException("from main");
		//		在代码中只能忽略RuntimeException类型的的异常，其他类型的异常的处理都是由编译器强制实施的。
		//12.8 使用finally进行清理
//		System.out.println("entery first block");
//		try{
//			System.out.println("entery second block");
//			try{
//				throw new Exception();
//			}finally{
//				System.out.println("finally in 2st try block!");
//			}
//		}catch(Exception e){
//			System.out.println("catch in 1st try block");
//		}finally{
//			System.out.println("finally in 1st try block!");
//		}
		//12.8.1 在return中使用finally，在finally内部从何处返回无关紧要。
		//12.8.3 异常丢失 （例子看269页例子）
	}
	
}
