package diExample3;

public class EmailMessage implements MsgInter {

	@Override
	public void Message(String name, String text) {
		System.out.println("["+name+"]에게 ["+text+"] 를 Email로 전송");
	}

}
