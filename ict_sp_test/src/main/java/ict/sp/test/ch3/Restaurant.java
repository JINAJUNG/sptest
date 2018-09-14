package ict.sp.test.ch3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Restaurant {
	@Autowired
	private List<Food> foods;

	@Autowired
	@Qualifier("pizza")
	private Food food1;
	@Autowired
	@Qualifier("bread")
	private Food food2;

	public List<Food> getFoods() {
		return foods;
	}

	public Food getPizza() {
		return food1;
	}

	public Food getBread() {
		return food2;
	}
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch3/ioc.xml");
		
		Restaurant r = (Restaurant) ac.getBean("restaurant");
		r.getPizza().sell();
		r.getBread().sell();

		for(Food f : r.getFoods()) {
			f.buy();
		}
		
	}
}
