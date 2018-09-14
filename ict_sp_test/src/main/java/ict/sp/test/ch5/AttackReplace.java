package ict.sp.test.ch5;

import org.springframework.stereotype.Service;

public class AttackReplace {

	private GameCharacter gc;
	
	public void setGc(GameCharacter gc) {
		this.gc = gc;
	}
	
	public GameCharacter getGc() {
		return gc;
	}
}
