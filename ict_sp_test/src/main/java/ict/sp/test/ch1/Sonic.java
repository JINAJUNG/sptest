package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service
public class Sonic extends Game{

	@Override
	public void attack() {
		System.out.println("소닉 때려!");
	}

	@Override
	public void jump() {
		System.out.println("소닉 점프!");
	}

}
