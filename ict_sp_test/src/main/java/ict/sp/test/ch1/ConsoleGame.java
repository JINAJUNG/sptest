package ict.sp.test.ch1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGame {
	
	private List<Game> gameList;
	
	
	public List<Game> getGame() {
		return gameList;
	}

	@Autowired //Spring 4는 주어진 타입의 모든 빈을 자동으로 수집하여 콜렉션이나 배열에 삽입하는 기능을 지원합니다. 그래서 리스트로 받아와야하나바 객체하나씩 받아와서 add가 아니라
	public void setGame(List<Game> gameList) {
		this.gameList=gameList;
	}

	public void on() throws Exception {
		if(gameList.size()==0) {
			throw new Exception("게임팩이 없짜나!");
		}
		System.out.println("로딩완료");
	}
	public void start() {
		for(Game game : gameList) {
			game.start();
			game.attack();
			game.jump();	
		}
		
	}
	public void off() {
			gameList.get(0).end();	

	}
}
