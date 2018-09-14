package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service
public class Mario extends Game{

	@Override
	public void attack() {
		System.out.println("마리오 때려!");
	}

	@Override
	public void jump() {
		System.out.println("마리오 점프!");
	}

}
