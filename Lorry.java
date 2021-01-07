package garage;

public class Lorry extends vehicle {
	public String lorryBrand = "";
	public int storageSpace;
	public String lorryColour = "";

	public Lorry(int wheels, boolean roadworthy, int maxSpeed, int value, String lorryBrand, int storageSpace,
			String lorryColour) {
		this.wheels = wheels;
		this.roadworthy = roadworthy;
		this.maxSpeed = maxSpeed;
		this.value = value;
		this.lorryBrand = lorryBrand;
		this.storageSpace = storageSpace;
		this.lorryColour = lorryColour;
	}

	public Lorry() {
		setWheels(4);
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;

	}

	public String getLorryBrand() {
		return lorryBrand;
	}

	public void setLorryBrand(String lorryBrand) {
		this.lorryBrand = lorryBrand;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

	public String getLorryColour() {
		return lorryColour;
	}

	public void setLorryColour(String lorryColour) {
		this.lorryColour = lorryColour;
	}

}
