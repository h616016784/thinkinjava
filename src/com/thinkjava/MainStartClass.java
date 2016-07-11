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
		System.out.println("think in java ����ʼ��");
		
		/**
		 * ��2�� һ�ж��Ƕ���
		 */
		//2.1 �����ò�������
		 //2.2.2,������������
		//		�����������ͱ���ֱ�Ӵ洢ֵ��������ջ�У�Ч�ʸ���
		//2.3.1 ������  java�в������ؽϴ��������ı���
		//      ���������򲻾��кͻ�������һ�����������ڡ�����new����һ��java����ʱ�������Դ����������֮�⡣
//		{
//				String s=new String("abc");
//		}
		//		����s�����������յ����ʧ�ˣ�sָ���String�����Լ���ռ���ڴ�ռ䡣
		//		����δ���֮�������޷��ٷ������������Ϊ������Ψһ�����ѳ�����������ķ�Χ��
		//2.6.3 static�ؼ���
		//		static��������ʱΪ����䵥һ�洢�ռ䣬�����򷽷���������������Ǹ�����κζ���ʵ��������һ��(�Ǿ�̬Ϊÿ����������ڴ�ռ�)
//		StaticTest s1=new StaticTest();
//		StaticTest s2=new StaticTest();
//		System.out.println(s1.i==s2.i);
		
		/**
		 * ��3�� ������
		 */
		//����ײ㣬java�е�������ͨ��ʹ�ò�������������
		//3.4 ��ֵ �������͵ĸ�ֵ�����Ǵ洢��ʵ�ʵ���ֵ������ָ��һ����������á���ֵʱ��ֱ�ӽ�һ���ط������ݸ��Ƶ���һ���ط�
		//		������ֵ�ǽ������á���һ���ط����Ƶ� ��һ���ط���
		
		//(��������Ϊ��������)
//		Tank t1=new Tank();
//		Tank t2=new Tank();
//		t1.level=9;
//		t2.level=47;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
//		t1=t2;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
//		t1.level=27;
//		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		
		//3.6 �Զ������͵ݼ�   ++a��--a��ִ�����㣬������ֵ�� a++��a--������ֵ����ִ�����㡣
//		int i=1;
//		System.out.println("i: "+i);
//		System.out.println("i: "+ ++i);
//		System.out.println("i: "+ i++);
//		
//		System.out.println("i: "+i);
//		System.out.println("i: "+ --i);
//		System.out.println("i: "+ i--);
		
		//3.7.1���Զ���ĶԵ���,
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1==n2);
//		System.out.println(n1!=n2);
//		System.out.println(n1.equals(n2));
		
		//3.8 �߼�������   ��дһ������ģ����Ӳ�ҵĽ����������
		//3.8.1 ��·  && ||   ǰ��ı��ʽ�����������ı��ʽ���ڼ��������������
		
		/**
		 * ��4��  ���̿���    (if else,whiel,do while,for,return,break,java��֧��goto)
		 */
		/**
		 * ��5�� ��ʼ��������
		 */
		//5.1 ��������ʼ��  
		//		һ�������δ��ʼ����string���ã�java�Ὣ���ʼ����null��
		//5.3 Ĭ�Ϲ�����
		//		���û�й�������java���Զ�����������ѽ������˹��������������򲻻���㽨������,������ٵ��ó�������!
		//5.7 ��������ʼ��   �������£�
//		public class Counter{
//			int i;
//			Counter(){i=7;}
//		}
		//i���Ȼᱻ��Ϊ0��Ȼ����7��
		//5.7.1 ��ʼ��˳��  ���������˳����ó�ʼ��˳�򣬼�ʹ��������ɢ���ڷ�������֮�䣬�����Ծɻ����κη�������ǰ��ʼ����
//		House h=new House();
//		h.f();
		//5.7.2 ��̬���ݵĳ�ʼ��  ���۴������ٸ����󣬾�̬����ֻռ��һ�ݴ洢����
		//һ�°�����think java������Ϊ׼
//		static Table table=new Table();
//		static Cupboard cupboard=new Cupboard();
//		System.out.println("creating new cupboard() in main");
//		new Cupboard();
		//		��ʼ��˳�����Ⱦ�̬���������δ��ʼ������Ȼ���ǷǾ�̬ 
		
		//5.8  �����ʼ��??????????(��ʱ���ٿ� )
		
		//5.9  ö�����ͣ�����һ�����õĵط��ǿ�����switch�����ʹ��
		
		/**
		 * ��6��  ����Ȩ�޿���
		 */
		
		/**
		 * ��7�� ������
		 */
		//7.1  ����﷨   
		//		�����������Ǽ򵥵�Ϊÿһ�����ö�����Ĭ�϶������Ч�ʡ�
		
		//7.3 ����	�Ǽ̳�����ϵ���ӹ֮��
		//		������ǿ����ȥ��ʼ�����࣬����Ҫ�����ڹ�������ʼ����Ҫ��ô���������������ල����뽫��Ա�����ʼ����
		//		�����Ӽ�think in java 132ҳ��
		//7.9 ��ʼ������ļ���
		//		���Եĳ�ʼ�����̱���С�Ŀ��ƣ�java�����е������Ƕ���ÿ����ı�����붼���������Լ��Ķ����ļ��С�
		//		���ļ�ֻ����Ҫʹ�ô���ʱ�ż��أ�Ҳ���ǳ���ʹ��ʱ�ż��أ�������ʹ��ʱ����г�ʼ���������static����ôstatic
		//		�����static����λ�˳���ȳ�ʼ������Ȼ��staticֻ�ᱻ��ʼ��һ��
		//7.9.1  �̳����ʼ��
		//		�����ӿ��鱾146ҳ��
		
		/**
		 * ��8��   ��̬
		 */
		//8.2.1 �������õİ�
		//		Java�г���static������final�����⣬�����ķ������Ǻ��ڰ󶨡�����final��ʱҲ���Ա�����ڰ󶨡�
		
		//8.2.5 �������ʱ��̬�ģ���ô���Ͳ����ж�̬��
		//8.3.2 �̳�������
		
		//8.3.3 �������ڲ��Ķ�̬������Ϊ
		//		�����һ�����������ڲ��������ڹ���Ķ����ĳ����̬�󶨷������ᷢ��ʲô�أ�
		//			��ʼ����ʵ�ʹ������£�
		//			1���������κ����﷢��֮ǰ�������������Ĵ洢�ռ��ʼ���ɶ����Ƶ��㡣
		//			2����ʱ���ñ����ǵķ��������ڲ���1��Ե�ʣ�radius��ֵΪ0.
		//			3������������˳����ó�Ա�ĳ�ʼ��������
		//			4�����õ�����Ĺ������塣
		
		/**
		 * ��9��  �ӿ�
		 */
		//9.7 �ӿ��е���
		//		����ӿ��е����Զ���static��final�ģ��ڽӿ��ж���������ǿ�final�����ǿ��Ա��ǳ������ʽ��ʼ����
		/**
		 * ��10��  �ڲ���
		 */
		//10.2 ���ӵ��ⲿ�� 
		//		�ڲ����Զ���ȡ�ⲿ�����г�Ա�ķ���Ȩ������������ģ�
		//			���ⲿ�ഴ��һ���ڲ���ʱ�����ڲ�������ܲ���һ��ָ���Ǹ��ⲿ���Ӧ�ã�Ȼ��Ϳ��Է����ⲿ���Ա�ˣ�
		//			�����ڲ���ĳ�Աֻ����������Χ��Ķ��������������²��ܱ������������ڲ������ʱ����Ҫһ��ָ��
		//			����Χ������Ӧ�ã�������������ʲ���������þͻᱨ��
		//10.3 ʹ��.this��.new  ����������ⲿ���������ã������ⲿ�����ֺ����.this,���������������Զ��ؾ�����ȷ��
		//			���ͣ����ڱ����ھͼ�⣬û������ʱ�Ŀ�����
		//			������봴���ڲ������ʱ �á��ⲿ�����.new �ڲ��ࡰ,������㴴�����Ǿ�̬�ڲ�����Ͳ����ⲿ��Ķ���
		//10.4 �ڲ���������ת��
//		Paral4 p=new Paral4();
//		Contents contents = p.contents();
//		Destination destination = p.destination("haha");
//		int value = contents.value();
//		String readLable = destination.readLable();
//		System.out.println("contents:"+value+"    destination:"+readLable);
		//������p.new PContents();����ΪPcontents����privateȨ��
		
		//10.6 �����ڲ��ࣨ��ʱ���ٿ���
		//10.7 Ƕ����
		//		Ҫ����Ƕ����Ķ��󣬲�����Ҫ���ⲿ��Ķ���
		//		���ܴ�Ƕ����Ķ�����ʷǾ�̬����Χ����
		//		Ƕ��������ͨ�ڲ��໹��һ�����𣬲�ͬ�ڲ�����ֶ��뷽����ֻ�ܷ�������ⲿ����ϣ�������ͨ���ڲ��಻����
		//		static���ݺ�static�ֶΣ�Ҳ���ܰ���Ƕ���࣬����Ƕ������԰���������Щ������	
		//10.8 Ϊʲô��Ҫ�ڲ��ࣿ����Ҫ��ԭ���ǣ�ÿ���ڲ��඼�ܶ����ؼ̳���һ�����ӿڵģ�ʵ�֣����������ⲿ���Ƿ��Ѿ�
		//			�̳���ʵ�֣������ڲ��඼û��Ӱ�졣
		
		/**
		 * ��11�� ���ж���
		 */
		//�����Ǳ���һ����������Ч�ķ�ʽ���������һ������������ݣ��Ƽ�ʹ�����ַ��������������й̶��ߴ�
		//java�ṩ�˻���������List��Set��Queue��Map������
		//11.2 ��������
		//		java���������;�Ǳ�����󣬲����仮��Ϊ������ͬ�ĸ���
		//		1��Collection��һ������Ԫ�ص�����,List������˳��洢��Set�����ظ���Queue�����Ŷӹ�����ȷ�����������˳��
		//		2��Map��һ��ɶԵġ���ֵ�ԡ�
		//11.8 Stack ͨ��ָ�Ƚ����������
		//		LinkedList�����ܹ�ֱ��ʵ��ջ�����й��ܺͷ�������˿�ֱ�ӽ�LinkedList��Ϊջʹ�á�
		//11.11 Queue,�������Ƚ��ȳ���������LinkedList�ṩ��֧�ֵķ�����������ʵ����Queue�ӿڡ�
		
//		Queue<Character> queue=new LinkedList<Character>();
//		for (char c:"brontosaurus".toCharArray()) {
//			queue.offer(c);
//		}
//		while(queue.peek()!=null){
//			System.out.println(queue.remove()+"");
//		}
		/**
		 * ��12�� ͨ���쳣�������
		 */
		//12.6 �������е��쳣���Ժ���ʱ����ϸ�Ŀ���
		//12.7 java��׼�쳣
		//		RuntimeException��һ�����������������쳣���ͣ�����������Ҫ�쳣˵�����������System.err
		//		���RuntimeExceptionû�в����ֱ��main������������ô�����˳�ǰ�������쳣��pirntStackTrace��������
//		throw new RuntimeException("from main");
		//		�ڴ�����ֻ�ܺ���RuntimeException���͵ĵ��쳣���������͵��쳣�Ĵ������ɱ�����ǿ��ʵʩ�ġ�
		//12.8 ʹ��finally��������
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
		//12.8.1 ��return��ʹ��finally����finally�ڲ��Ӻδ������޹ؽ�Ҫ��
		//12.8.3 �쳣��ʧ �����ӿ�269ҳ���ӣ�
		//12.9 �쳣������
		//		�����Ƿ�����ʱ��ֻ���׳��ڻ��෽�����쳣˵�����г����쳣����480ҳ�����Ӿ��䣬Ҫ�� ��
		//12.10 ������   
		//		��������Ѷ������óɰ�ȫ�ĳ�ʼ״̬���������б�Ķ����������һ���ļ��������Ķ���ֻ���ڶ���ʹ�����
		//		�����û������������������֮����ܵ�����������ڹ��������쳣����Щ�������Ͳ������������ˡ���
		//		��ζ�ű�д������ʱҪ�����С�ġ����������������ܵ��Ż���
		
		
		/**
		 * ��13�� �ַ���
		 */
		//		�ַ��������Ǽ��������������������Ϊ
		//13.1 ���ɱ�String
		//		String����ʱ���ɱ�ģ���JDK���ƺ�ÿһ�������޸�String��ֵ��ʵ���϶��Ǵ�����һ��ȫ�µ�String�����԰���
		//		�޸ĺ���ַ������ݡ��������String������˿��δ����
		//		û����String������Ϊ�����Ĳ���ʱ�����Ḵ��һ�����ã�����������ָ�Ķ�����ʵһֱ���ڵ�һ������λ���ϣ���δ����
//		String s="howday";
//		System.out.println(s);
//		String ss=s.toUpperCase();//Ӧ���Ǿֲ����������ݣ��������һ��Ķ�
//		System.out.println(ss);
//		System.out.println(s);
		//13.2 ���ء�+����StringBuilder
		//		���ɱ��Դ�����һ����Ч�����⡣������String�ġ�+���롰+=����java�н��е��������ع��Ĳ���������java�����������Ա�����κβ�������
//		String mango="mango";
//		String s="abc"+mango+"def"+47;
//		System.out.println(s);
		//�������ӱ�����������һ��StringBuilder�������Թ������յ�String����δÿ���ַ�������һ��StringBuilder��append������
		//������toString�������ɳɹ�������Ϊs������ΪStringBuilder����Ч��
		//		StringBuilder��jdk1.5�Ժ��еģ����̲߳���ȫ�ĵ�Ч�ʸߣ�StringBuffer���̰߳�ȫ��Ч�ʵ͡�
		//13.3 ����ʶ�ĵݹ�  (��287ҳ������Ậ��)
		//13.5 ��ʽ�����   13.6������ʽ  13.7ɨ�����루��ʱ����ϸ����
		//
		
		/**
		 * ��14�� ������Ϣ
		 */
		//����ʱ������Ϣʹ��������ڳ�������ʱ���ֺ�ʹ��������Ϣ��
		//java�����������������ʱʶ�����������Ϣ�ģ� ��Ҫ�����ַ�ʽ��
		//	1)��ͳ��RTTI�����ٶ������ڱ���ʱ�Ѿ�֪�������е����ͣ�
		//	2)������ƣ�����������������ʱ���ֺ�ʹ�������Ϣ��
		//14.1 Ϊʲô��ҪRTTI
		//		����������ȡ��Ԫ��ʱ����������ʵ�����ǽ����е����ﵱ��Object���У��Զ�ת����Shape������RTTI�Ļ�����ʽ����Ϊ
		//		��java�У����е�����ת������������ʱ������ȷ���ġ���Ҳ��RTTI���ֵĺ��壺������ʱʶ��һ����������͡�
		//		��������У�RTTIת���Ĳ������ף�objectת����Shape��������Ϊ����ֻ֪��List<Shape>�������Shape���ڱ���ʱ
		//		��������java�ķ���ϵͳ��ǿ��ȷ����һ�㣻��������ʱ��������ת��������ȷ����һ�㡣
		//14.2 Class����
		//		Class��������������йص���Ϣ��Class���������������������С����桱�����,ÿ���඼��һ��Class���󣬻���֮
		//		ÿ��	��д������һ���࣬�ͻᴴ��һ��Class���󣨱�������ͬ����.class�ļ��У���
		//		����صĹ��̣�������ǿɲ鿴�������ݣ���
		//14.2.1 �����泣��  
		//		��ʹ��.class��������Class���������ʱ�������Զ��ĳ�ʼ����Class���󡣣���ϸ�о�319ҳ���ӣ�
		//		���һ��static finalֵ�ǡ������ڳ���������ô���ֵ����Ҫ������г�ʼ���Ϳ��Զ�ȡ���෴���С�
		//14.2.2 ������Class����
//		Class intClass=int.class;
//		Class<Integer> genericIntClass=int.class;
//		genericIntClass=Integer.class;//same thing
//		intClass=double.class;
//		//genericIntClass=double.class;//illegal
		
		//14.3 ����ת��ǰ������飨��14��ʣ�µ�����Ҫ��ϸ����!!!!!!!!��
		
		/**
		 * ��15�� ����
		 */
		//15.2 �򵥷���
		//15.2.1 һ��Ԫ�����    ��һ�η������þ��ܷ��ض������
		//		Ԫ����ָ��һ�����ֱ�Ӵ���洢�����е�һ����һ����
		//15.2.3 RandomList
//		RandomList<String> rs=new RandomList<String>();
//		for(String s:("The quick brown fox jumped over "+"the lazy brown dog").split(" ")){
//			rs.add(s);
//		}
//		for(int i=0;i<11;i++)
//			System.out.println(rs.select()+" ");
		//15.3 ���ͽӿ�
		//15.4 ���ͷ���  ����ָ��ԭ��ֻҪ��������������ʹ�÷��ͷ��������⣬����һ��static�ķ�������
		//		�޷����ʷ���������Ͳ������������static������Ҫʹ�÷����������Ͳ���ʹ�÷��ͷ�����
		//		(�Ժ��������ʱ������ϸ�Ŀ���)
		//15.7 ����������֮��
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
		
		//		�ڷ��ʹ����ڲ����޷�����κ��йط��Ͳ������͵���Ϣ��
		//		java������ʹ�ò�����ʵ�ֵģ�����ζ�ŵ���ʹ�÷���ʱ���κξ����������Ϣ������������Ψһ֪���ľ�����ʹ��һ������
		//		���List<String>�� list<Integer>������ʱ��ʵ������ͬ�����ͣ���������ʽ�������������ǵġ�ԭ��������,��List��
	}
	
}
