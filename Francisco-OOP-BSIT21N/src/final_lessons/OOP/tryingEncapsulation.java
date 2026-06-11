package final_lessons.OOP;

//Encapsulation - attributes of a class being hidden or private
//				- only accessed through methods (getters and setters)
// Practice code in likeness to Bro Code's


class Horse {
	private String name;
	private double height;
	private int age;
	
	// Constructor - accepts 3 parameters
	Horse(String n, double h, int a){
		this.name = n;
		this.setHeight(h); // changed into setter method call
		this.age = a;
	}

	// Solution 1: use getter method that returns the variable
	public String getThem() {
		return name + height + age; // concatenated 
	}
	
	// Solution 2: use getter method that returns the variable
	public void setHeight(double h) {
		this.height = h;
	}
}

public class tryingEncapsulation {

	public static void main(String[] args) {
		
		Horse hrs = new Horse("Xerbeus", 99.99, 5);
		
		// error bcs remember, name is private
			// System.out.println(hrs.name); 
		
		// use getter method: displayed success
		System.out.println(hrs.getThem()); 

		// error bcs remember, height is private
			// hrs.height = 67;
		
		// use setter method: height changed success
		hrs.setHeight(101.101);
		System.out.println(hrs.getThem()); 
	}

}
