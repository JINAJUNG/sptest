package ict.sp.test.ch2;

import org.springframework.stereotype.Service;

@Service
public class Projectmanager implements Emp{

	@Override
	public void goForWork() {
		System.out.println("프로젝트관리자 출근");
	}

	@Override
	public void doWorking() {
		System.out.println("프로젝트관리자 일하는 척");
		
	}

	@Override
	public void goHome() {
		System.out.println("프로젝트관리자 퇴근");
		
	}

}
