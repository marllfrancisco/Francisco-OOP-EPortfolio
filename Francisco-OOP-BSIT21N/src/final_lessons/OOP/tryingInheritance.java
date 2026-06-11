package final_lessons.OOP;

// Inheritance - one class(es) acquires the attributes(methods) of another
// Laptop and Cellphone should inherit all methods and variables of Devices
// Practice code in likeness to Bro Code's

class Devices {
	String device;
	int fps;
	double CPUspeed;
	
	void runDevice() {
		System.out.println("device is now running");
	}
	
	void performance() {
		System.out.println(device + " running speed at " + CPUspeed + " and " + fps + " fps");
	}
}

class Laptop extends Devices {
	
}

class Cellphone extends Devices {
	int simslot = 2; 
}

public class tryingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Laptop lt = new Laptop();
		lt.runDevice(); // this will run w/o contents inside Laptop class
		
		Cellphone cp = new Cellphone();
		System.out.println(cp.fps);
		System.out.println(cp.simslot);
	}

}
