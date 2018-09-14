package ict.sp.test.ch4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zoo {
	private Animal cat;
	private Animal dog;
	private Animal tiger;
	
	@Autowired
	private List<Animal> al;
	
	public Zoo() {}
	public Zoo(Animal cat) {
		this.cat = cat;
	}

	@Autowired
	public Zoo(@Qualifier("cat")Animal cat, @Qualifier("dog")Animal dog, @Qualifier("tiger")Animal tiger) { //cat dog 는 xml tiger은 어노테이션
		this.cat=cat;
		this.dog=dog;
		this.tiger=tiger;
	}
	
	
	public void two() {
		dog.sleep();
		cat.sleep();
	}
	
	public void three() {
		dog.howl();
		cat.howl();
		tiger.howl();
	}
	public void doSome() {
		cat.attack();
		cat.howl();
		cat.sleep();
	}

	public List<Animal> outList(){
		return this.al;
	}
	public static void main(String[] args) {
		ApplicationContext ac =new ClassPathXmlApplicationContext("ch4/ioc.xml");
		Zoo z = (Zoo) ac.getBean(Zoo.class);
		z.doSome();

		z.two();
		z.three();
		
		for(Animal a : z.outList()) {
			a.attack();
		}
	}
}
