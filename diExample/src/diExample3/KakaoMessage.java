package diExample3;

public class KakaoMessage implements MsgInter {

	@Override
	public void Message(String name, String text) {
		System.out.println("["+name+"]에게 ["+text+"] 를 KakaoTalk으로 전송");
	}

}
