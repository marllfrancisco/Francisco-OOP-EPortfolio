package final_lessons.OOP;


// Polymorphism - the ability of an object to identify at more than one data type
// Car, Boat, Bicycle are child classes of Vehicle
// These 3 identifies as Vehicle, hence we are able to create the racers type
// Practice code in likeness to Bro Code's

class Vehicle {
	void go() {
		System.out.println("Moved");
	}
}

class Car extends Vehicle{
	@Override 
	void go() {
		System.out.println("Broomm");
	}
}

class Boat extends Vehicle{
	@Override
	void go() {
		System.out.println("Swirll");
	}
}

class Bicycle extends Vehicle{
	@Override
	void go() {
		System.out.println("Swooshh");
	}
}



public class tryingPolymorphism {

	public static void main(String[] args) {
		
		// make objects individually
		Car c = new Car();
		Boat b = new Boat();
		Bicycle bi = new Bicycle();
		
		// array of objects (polymorphism - racers)
		Vehicle[] racers = {c, b, bi};
		
		// call go methods individually
		//c.go();
		//b.go();
		//bi.go();
		
		// or iterate using for loop (in the other type)
		for(Vehicle x : racers) {
			x.go();
		}

	}

}
