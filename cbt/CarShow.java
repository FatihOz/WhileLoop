package cbt;

public class CarShow {
	public static void main(String[] args) {
	
	Car c1 = new Car();
	Car c2 = new Car("BMW", "X8", 2019);
	Car c3 = new Car("AUDI", "Q8", 2016, "BLACK", 65000);
	Car c4 = new Car("BMW", "X8", 2019, "WHITE", 45000);
	Car c5 = new Car("MERCEDES", "X500", 2020,"",100000);
	
	Car[] allCars = {c1,c2,c3,c4,c5};
	for(Car car : allCars) {
		car.display();
	}
	
}
}
