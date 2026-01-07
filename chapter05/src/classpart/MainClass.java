package classpart;

public class MainClass {

	public static void main(String[] args) {

		Bicycle biki01 = new Bicycle();
		biki01.showBicycleInfo();

		
		Bicycle biki02 = new Bicycle("red",10000);
		biki02.showBicycleInfo();
	}

}
