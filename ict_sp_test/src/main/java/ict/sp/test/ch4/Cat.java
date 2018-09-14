package ict.sp.test.ch4;

public class Cat implements Animal {

	@Override
	public void attack() {
		System.out.println("아파");
	}

	@Override
	public void howl() {
		System.out.println("야옹");
	}

	@Override
	public void sleep() {
		System.out.println("맨날자");
	}

}
