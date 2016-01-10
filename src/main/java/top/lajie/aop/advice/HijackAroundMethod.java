package top.lajie.aop.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class HijackAroundMethod implements MethodInterceptor{

	public Object invoke(MethodInvocation methodinvocation) throws Throwable {
		System.out.println("Method name:"+methodinvocation.getMethod().getName());
		System.out.println("Method arguments:"+Arrays.toString(methodinvocation.getArguments()));
		//相当于 MethodBeforeAdvice
		 System.out.println("HijackAroundMethod : Before method hijacked!");
		 try {
	            // 调用原方法，即调用CustomerService中的方法
	            Object result = methodinvocation.proceed();

	            // 相当于 AfterReturningAdvice
	            System.out.println("HijackAroundMethod : After method hijacked!");

	            return result;

	        } catch (IllegalArgumentException e) {
	            // 相当于 ThrowsAdvice
	            System.out.println("HijackAroundMethod : Throw exception hijacked!");
	            throw e;
	        }
	}


}
