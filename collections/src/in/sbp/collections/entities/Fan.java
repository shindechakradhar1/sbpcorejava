package in.sbp.collections.entities;

import java.util.Objects;

public class Fan {

	private int wings;
	private int speed;
	private String brand;

	public Fan() {}

	public Fan(int wings, int speed, String brand) {
		this.wings = wings;
		this.speed = speed;
		this.brand = brand;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public int hashCode() {
//		int hash=13;
//		hash = hash +  17 * wings; 
//		hash = hash +  17 * speed; 
//		hash = hash +  17 * brand.hashCode(); 
//		return hash;
		return Objects.hash(wings,speed,brand);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Fan fan = (Fan)obj;
		
		return (fan.wings==this.wings 
				&& fan.speed==this.speed 
				&& fan.brand.equals(this.brand));
		
	}

	@Override
	public String toString() {
		return "Fan [wings=" + wings + ", speed=" + speed + ", brand=" + brand + "]";
	}

}
