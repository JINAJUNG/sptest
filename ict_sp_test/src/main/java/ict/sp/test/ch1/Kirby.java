package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service
public class Kirby extends Game{

	
	@Override
	public void attack() {
		System.out.println("커비 때려!");
	}

	@Override
	public void jump() {
		System.out.println("커비 쩜뿌");
	}

}
