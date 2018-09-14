package ict.sp.test.ch6;

public class ICTChatting implements Chatting{

	@Override
	public void chat() {
		System.out.println("채팅으로 들어왔!");
	}

	@Override
	public String getFile() {
		System.out.println("getFile in");
		return "파일 임돵";
	}

}
