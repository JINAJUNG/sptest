package ict.sp.test.ch1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PreExecute {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch1/ioc.xml"); //프리로딩
		
		ConsoleGame cg = (ConsoleGame)ac.getBean("consoleGame");
		

		try {
			cg.on();
			cg.start();
			cg.off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
