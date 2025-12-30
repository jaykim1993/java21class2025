package ifexample;

public class Switchtest {

	public static void main(String[] args) {
		char grade = 'C'; // 대소문자 구분함
		switch(grade) {
		case 'A' : System.out.println("VVIP 혜택"); break;
		case 'B' : System.out.println("VIP 혜택"); break;
		case 'C' : System.out.println("우수 혜택"); break;
		case 'D' : System.out.println("일반 혜택"); break;
		default: System.out.println("혜택 없음"); break;
		}

	}

}
