package garage;

public class Runner {

	public static void main(String[] args) {
		vehicle car1 = new Car(4, true, 150, 5000, "Ford", "Offroader", "Red");
		vehicle motorcycle1 = new Motorcycle(2, false, 0, 200, "Vespa", 1, "Blue");
		vehicle lorry1 = new Lorry(4, true, 150, 7000, "Mitsubishi", 10, "Grey");

		Garage g = new Garage();
		g.addVehicle(car1);
		g.addVehicle(motorcycle1);
		g.addVehicle(lorry1);


		System.out.println(g);
	}
}
