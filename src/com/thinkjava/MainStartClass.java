package com.thinkjava;

import com.thinkjava.chart2.StaticTest;
import com.thinkjava.chart3.Tank;

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
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.level=9;
		t2.level=47;
		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		t1=t2;
		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		t1.level=27;
		System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		
	}
}
