package hashMapEx02;

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
}
