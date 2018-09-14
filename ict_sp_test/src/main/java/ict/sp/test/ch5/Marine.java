package ict.sp.test.ch5;

import org.springframework.stereotype.Service;


public class Marine implements GameCharacter{

	@Override
	public void attack() {
		System.out.println("총 따다다다다다닫ㄷ");
	}

	@Override
	public void deffence() {
		System.out.println("메딕 커몬");
	}

}
