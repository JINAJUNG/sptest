package ict.sp.test.ch7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Line {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch7/ioc.xml");
		Chatting c = (Chatting) ac.getBean("ictc");
		System.out.println(c.getFile());
		/*Testcl t = (Testcl)ac.getBean("te");
		t.Testme();*/
	
		
	/*
	 * di : 의존성주입
	 * ioc : 역전제어
	 * aop : 관점지향 프로그램
	*/
	}
}
