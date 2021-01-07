package garage;

import java.util.ArrayList;

public class Garage {

	public Garage() {

	}

	private ArrayList<vehicle> vehicles = new ArrayList<>();

	// add vehicle to garage
	public void addVehicle(vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(int ID) {
		vehicles.remove(ID);
	}

	public void removeVehicle(String Type) {
		for( vehicle v : vehicles) {
			if(v instanceof Car) {
				vehicles.remove(v);
			}
		}
		for( vehicle v : vehicles) {
			if(v instanceof Motorcycle) {
				vehicles.remove(v);
			}
		}
		for( vehicle v : vehicles) {
			if(v instanceof Lorry) {
				vehicles.remove(v);
			}
		}
	}
	public void garageClear() {
		vehicles = new ArrayList<>();
	}

	public void vehicleBill(int getValue) {

		for (vehicle v : vehicles) {

			if (v instanceof Car) {
				System.out.println("The value of this car is " + Integer.valueOf(getValue));
			}
			if (v instanceof Motorcycle) {
				System.out.println("The value of this motorcycle is " + Integer.valueOf(getValue));
			}
			if (v instanceof Lorry) {
				System.out.println("The value of this lorry is " + Integer.valueOf(getValue));
			}
		}

	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

}
