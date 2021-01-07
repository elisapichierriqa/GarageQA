package garage;

public class Car extends vehicle {

	public String carBrand = "";
	public String carType = "";
	public String carColour = "";

	public Car(int wheels, boolean roadworthy, int maxSpeed, int value, String carBrand, String carType,
			String carColour) {
		this.wheels = wheels;
		this.roadworthy = roadworthy;
		this.maxSpeed = maxSpeed;
		this.value = value;
		this.carBrand = carBrand;
		this.carType = carType;
		this.carColour = carColour;
	}

	public Car() {
		setWheels(4);
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;

	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

}
