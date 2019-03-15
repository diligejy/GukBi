package aop06;

import org.aspectj.lang.ProceedingJoinPoint;

//AOP를 관리하는 인터페이스 : ProceedingJoinPoint => JoinPoint
//http://www.eclipse.org/aspectj/ API 문서 확인
//5.10.4에 적혀 있엉 히힛.
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
			System.out.println("PerformanceTraceAdvice : " + signature + "실행 시간 -" + (finish - start) + "ms");
		}

	}

}
