package inheritance02;

public class IPTV extends ColorTV {
	protected String address;
	


	public IPTV(String address, int size, int color) {
		this.address = address;
		super.size = size;
		super.color = color;
		
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// @ : 어노테이션, 오버라이드는 = 재정의하다.
	@Override 
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s주소의 %d인치 %d컬러",address, super.size, super.color);
	}

}
