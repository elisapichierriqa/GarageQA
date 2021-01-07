package garage;

public class Motorcycle extends vehicle {

	public String motorcycleBrand = "";
	public int passengerCapacity;
	public String motorcycleColour = "";

	public Motorcycle(int wheels, boolean roadworthy, int maxSpeed, int value, String motorcycleBrand,
			int passengerCapacity, String motorcycleColour) {
		this.wheels = wheels;
		this.roadworthy = roadworthy;
		this.maxSpeed = maxSpeed;
		this.value = value;
		this.motorcycleBrand = motorcycleBrand;
		this.passengerCapacity = passengerCapacity;
		this.motorcycleColour = motorcycleColour;
	}

	public Motorcycle() {
		setWheels(2);
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


	public String getMotorcycleBrand() {
		return motorcycleBrand;
	}

	public void setMotorcycleBrand(String motorcycleBrand) {
		this.motorcycleBrand = motorcycleBrand;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String getMotorcycleColour() {
		return motorcycleColour;
	}

	public void setMotorcycleColour(String motorcycleColour) {
		this.motorcycleColour = motorcycleColour;
	}
}
