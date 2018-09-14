package ict.sp.test.ch4;

public class Dog implements Animal {

	@Override
	public void attack() {
		System.out.println("병원가야해");
	}

	@Override
	public void howl() {
		System.out.println("아우우우우");
	}

	@Override
	public void sleep() {
		System.out.println("고롱고롱");
	}

}