package diExample3;

public class SmsMessage implements MsgInter {

	@Override
	public void Message(String name, String text) {
		System.out.println("["+name+"]에게 ["+text+"] 를 SNS로 전송");
	}

}
