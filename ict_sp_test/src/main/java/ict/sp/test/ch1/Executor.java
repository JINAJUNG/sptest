package ict.sp.test.ch1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class Executor {
	public static void main(String[] args) {
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(dlbf);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/ch1/ioc.xml"));
		ConsoleGame cg = (ConsoleGame)dlbf.getBean("consoleGame");

		try {
			cg.on();
			cg.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		cg.off();
	}
}
