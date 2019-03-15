package aop06;

import org.aspectj.lang.ProceedingJoinPoint;

//AOP�� �����ϴ� �������̽� : ProceedingJoinPoint => JoinPoint
//http://www.eclipse.org/aspectj/ API ���� Ȯ��
//5.10.4�� ���� �־� ����.
public class PerformanceTraceAdvice {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signature = joinPoint.getSignature().toShortString();
		System.out.println("PerformanceTraceAdvice :" + signature);
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println("PerformanceTraceAdvice : " + signature + "���� �ð� -" + (finish - start) + "ms");
		}

	}

}
