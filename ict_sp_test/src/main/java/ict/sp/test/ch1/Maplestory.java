package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service
public class Maplestory extends Game{

	@Override
	public void attack() {
		System.out.println("도적 때려");
	}

	@Override
	public void jump() {
		System.out.println("도적 점뿌");
	}

}
