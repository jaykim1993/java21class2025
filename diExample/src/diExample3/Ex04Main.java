package diExample3;

public class Ex04Main {

	public static void main(String[] args) {
		MessageSender ms = new MessageSender();
		
		ms.sendMessage("홍길동", "밥 먹었냐?", new SmsMessage());
		ms.sendMessage("임꺽정", "집에 가자", new KakaoMessage());
		ms.sendMessage("개나리", "공부하세요", new EmailMessage());

	}

}
