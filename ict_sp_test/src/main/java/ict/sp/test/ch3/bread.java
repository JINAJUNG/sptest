package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class bread implements Food{

	@Override
	public void sell() {
		System.out.println("빵팔아!!!");
	}

	@Override
	public void buy() {
		System.out.println("빵 재료 사서 만들어줘!!");
		
	}

}
