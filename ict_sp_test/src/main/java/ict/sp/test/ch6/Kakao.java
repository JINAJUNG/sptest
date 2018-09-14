package ict.sp.test.ch6;

import org.springframework.aop.framework.ProxyFactory;

public class Kakao {
	public static void main(String[] args) {
		Chatting c = new ICTChatting();
		ProxyFactory pf = new ProxyFactory();
		ChatAdvice ac = new ChatAdvice();//로그,입셉션,프록시 처리할때 주로 사용
		pf.addAdvice(ac);
		pf.setTarget(c);
		
		Chatting pc = (Chatting)pf.getProxy();
		pc.chat();
		System.out.println(pc.getFile());
	}
}
