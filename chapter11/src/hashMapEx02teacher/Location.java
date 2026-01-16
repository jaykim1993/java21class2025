package hashMapEx02teacher;

public class Location {
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getLatitude() {
		return latitude;
	}
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}
	public Integer getLongitude() {
		return longitude;
	}
	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	private String city;
	private int latitude;
	private int longitude;
	
	Location (String city, int latitude, int longitude){
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	// 자바 최상위 클래스 = object
	// object -> toString()메소드 디폴트 => String 데이터 타입으로 출력
	// 현재 메소드의 최상위 클래스 확인하는 법 : ctrl + T
	// 단, 반드시 재정의해야함
    @Override
    public String toString() {
        return city + " " + latitude + " " + longitude;
    }
}
