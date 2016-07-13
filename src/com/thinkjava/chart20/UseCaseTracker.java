package com.thinkjava.chart20;

import java.lang.reflect.Method;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCase(List<Integer> useCase,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc=m.getAnnotation(UseCase.class);
			if(uc!=null){
				System.out.println("Find Use Case:" + uc.id()+" "+uc.description());
				useCase.remove(new Integer(uc.id()));
			}
		}
		for(int i:useCase){
			System.out.println("Warning: Missing use case"+i);
		}
	}
}
