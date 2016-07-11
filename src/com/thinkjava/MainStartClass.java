package com.thinkjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

import com.thinkjava.chart10.Contents;
import com.thinkjava.chart10.Destination;
import com.thinkjava.chart10.Paral4;
import com.thinkjava.chart15.Fnorkle;
import com.thinkjava.chart15.Frob;
import com.thinkjava.chart15.Particle;
import com.thinkjava.chart15.Quark;
import com.thinkjava.chart15.RandomList;
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
		//12.9 异常的限制
		//		当覆盖方法的时候，只能抛出在基类方法的异常说明里列出的异常。（480页的例子经典，要看 ）
		//12.10 构造器   
		//		构造器会把对象设置成安全的初始状态，但还会有别的动作，比如打开一个文件，这样的动作只有在对象使用完毕
		//		并且用户调用了特殊的清理方法之后才能得以清理。如果在构造器内异常，这些清理动作就不能正常工作了。这
		//		意味着编写构造器时要格外的小心。（例子有助于性能的优化）
		
		
		/**
		 * 第13章 字符串
		 */
		//		字符串操作是计算机程序设计中最常见的行为
		//13.1 不可变String
		//		String对象时不可变的，在JDK中似乎每一个都能修改String的值，实际上都是创建了一个全新的String对象，以包含
		//		修改后的字符串内容。而最初的String对象则丝毫未动。
		//		没当把String对象作为方法的参数时，都会复制一份引用，而该引用所指的对象其实一直待在单一的物理位置上，从未动过
//		String s="howday";
//		System.out.println(s);
//		String ss=s.toUpperCase();//应该是局部方法的内容，这个做了一点改动
//		System.out.println(ss);
//		System.out.println(s);
		//13.2 重载“+”与StringBuilder
		//		不可变性带来了一定的效率问题。（用于String的“+”与“+=”是java中仅有的两个重载过的操作符，而java并不允许程序员重载任何操作符）
//		String mango="mango";
//		String s="abc"+mango+"def"+47;
//		System.out.println(s);
		//以上例子编译器创建了一个StringBuilder对象，用以构造最终的String，并未每个字符串调用一次StringBuilder的append方法。
		//最后调用toString方法生成成果，并存为s。（因为StringBuilder更高效）
		//		StringBuilder是jdk1.5以后有的，是线程不安全的但效率高，StringBuffer是线程安全但效率低。
		//13.3 无意识的递归  (看287页例子体会含义)
		//13.5 格式化输出   13.6正则表达式  13.7扫描输入（有时间再细看）
		//
		
		/**
		 * 第14章 类型信息
		 */
		//运行时类型信息使得你可以在程序运行时发现和使用类型信息。
		//java是如何让我们在运行时识别对象和类的信息的？ 主要是两种方式：
		//	1)传统的RTTI，它假定我们在编译时已经知道了所有的类型；
		//	2)反射机制，它允许我们在运行时发现和使用类的信息。
		//14.1 为什么需要RTTI
		//		当从数组中取出元素时，这种容器实际上是将所有的事物当做Object持有，自动转换回Shape。这是RTTI的基本形式，因为
		//		在java中，所有的类型转换都是在运行时进行正确检查的。这也是RTTI名字的含义：在运行时识别一个对象的类型。
		//		这个例子中，RTTI转换的并不彻底，object转换成Shape，这是因为我们只知道List<Shape>保存的是Shape。在编译时
		//		由容器和java的泛型系统来强制确保这一点；而在运行时，有类型转换操作来确保这一点。
		//14.2 Class对象
		//		Class对象包含了与类有关的信息。Class对象就是用来创建类的所有“常规”对象的,每个类都有一个Class对象，换言之
		//		每当	编写并编译一个类，就会创建一个Class对象（被保存在同名的.class文件中），
		//		类加载的过程（如果忘记可查看书上内容）。
		//14.2.1 类字面常量  
		//		当使用.class来创建对Class对象的引用时，不会自动的初始化该Class对象。（仔细研究319页例子）
		//		如果一个static final值是“编译期常量”，那么这个值不需要对类进行初始化就可以读取，相反则不行。
		//14.2.2 泛化的Class引用
//		Class intClass=int.class;
//		Class<Integer> genericIntClass=int.class;
//		genericIntClass=Integer.class;//same thing
//		intClass=double.class;
//		//genericIntClass=double.class;//illegal
		
		//14.3 类型转换前先做检查（第14章剩下的内容要仔细看看!!!!!!!!）
		
		/**
		 * 第15章 泛型
		 */
		//15.2 简单泛型
		//15.2.1 一个元祖类库    仅一次方法调用就能返回多个对象。
		//		元祖是指将一组对象直接打包存储于其中的一个单一对象。
		//15.2.3 RandomList
//		RandomList<String> rs=new RandomList<String>();
//		for(String s:("The quick brown fox jumped over "+"the lazy brown dog").split(" ")){
//			rs.add(s);
//		}
//		for(int i=0;i<11;i++)
//			System.out.println(rs.select()+" ");
		//15.3 泛型接口
		//15.4 泛型方法  基本指导原则：只要你能做到，尽量使用泛型方法。另外，对于一个static的方法而言
		//		无法访问泛型类的类型参数，所以如果static方法需要使用泛型能力，就不许使用泛型方法。
		//		(以后的内容有时间再仔细的看看)
		//15.7 擦除的神秘之处
//		Class c1 = new ArrayList<Integer>().getClass();
//		Class c2 = new ArrayList<String>().getClass();
//		System.out.println(c1==c2);
		
//		List<Frob> list=new ArrayList<Frob>();
//		Map<Frob, Fnorkle> map=new HashMap<Frob, Fnorkle>();
//		Quark<Fnorkle> quark=new Quark<Fnorkle>();
//		Particle<Long, Double> p=new Particle<Long, Double>();
//		
//		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
//		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
//		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
//		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		
		//		在泛型代码内部，无法获得任何有关泛型参数类型的信息。
		//		java泛型是使用擦除来实现的，这意味着当你使用泛型时，任何具体的类型信息都将被擦除，唯一知道的就是在使用一个对象。
		//		因此List<String>和 list<Integer>在运行时事实上是相同的类型，这两种形式都被擦除成他们的“原生”类型,即List。
	}
	
}
