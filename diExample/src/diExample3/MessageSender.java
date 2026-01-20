package diExample3;

public class MessageSender{
	public void sendMessage(String name, String text, MsgInter mi) {
		mi.Message(name, text);
	}
}
// 의존성을 주입하는 외부 클래스 역할
// DI는 업캐스팅 + 상속으로 만든 다형성을 외부에서 주입하는 설계 방식이다.
// 어노테이션은 코드에 붙이는 메타데이터(설명서) -> XML 대체