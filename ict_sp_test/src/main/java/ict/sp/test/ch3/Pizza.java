package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class Pizza implements Food{

	@Override
	public void sell() {
		System.out.println("피자 팔아");
	}

	@Override
	public void buy() {
		System.out.println("피자 재료 사서 해 먹쟈");
		
	}

}
