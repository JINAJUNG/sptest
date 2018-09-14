package ict.sp.test.ch6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ChatAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("채팅전");
		Object obj = mi.proceed();
		System.out.println("채팅후");
		return obj;//데이터타입이 void가 아니라면 해줘야징 안그럼 널이쟈나
	}

}
