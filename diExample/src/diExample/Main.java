package diExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCal mycal = new MyCal();
		mycal.cal(20, 10, new Add());
		mycal.cal(20, 10, new Sub());
		mycal.cal(20, 10, new Mul());
		mycal.cal(20, 10, new Div());
		
	}

}
