package garage;

public class vehicle {
	int wheels;
	boolean roadworthy;
	int maxSpeed;
	int value;

	public Car getValue;

	public vehicle(int wheels, boolean roadworthy, int maxSpeed, int value) {
		this.wheels = wheels;
		this.roadworthy = roadworthy;
		this.maxSpeed = maxSpeed;
		this.value = value;

	}

	public vehicle() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean getRoadworthy() {
		return roadworthy;
	}

	public void setRoadworthy(boolean roadworthy) {
		this.roadworthy = roadworthy;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
