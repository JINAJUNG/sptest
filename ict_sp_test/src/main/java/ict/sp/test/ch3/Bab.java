package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1) //List에 담기는 순서 정렬?지정?가능
public class Bab implements Food{

	@Override
	public void sell() {
		System.out.println("한국인은 밥심이지");
	}

	@Override
	public void buy() {
		System.out.println("명품 쌀 팔아요");
	}

}
