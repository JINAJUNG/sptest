package ict.sp.test.ch7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectLog {

	@Pointcut("execution(* ict.sp.test.ch7.*Chatting.**())")//이렇게 쓰먼 얘만 바꾸면 되겟죠?
	public void joinpoint() {}
	
	// @Around("execution(* ict.sp.test.ch7.(*,*Chatting).**())")
	@Around("joinpoint()") // 맨앞 *는 접근제어자 쓰는 곳입니다 스페이스바가 필요해요
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		//joinPoint는 인터페이스
		System.out.println("실행 전");
		Object obj = pjp.proceed();

		System.out.println(pjp.getTarget().getClass().getName());
		System.out.println(pjp.getThis().getClass().getName());

		System.out.println("실행 후");
		return obj;
	}

}
