package ict.sp.test.ch4;

import org.springframework.stereotype.Service;

@Service
public class Tiger implements Animal {

	@Override
	public void attack() {
		System.out.println("죽어요");
	}

	@Override
	public void howl() {
		System.out.println("크와앙");

	}

	@Override
	public void sleep() {
		System.out.println("도로롱도로롱");
	}

}
