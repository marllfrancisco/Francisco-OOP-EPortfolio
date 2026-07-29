package final_lessons.OOP;

// Abstraction	- cannot be instantiated, but they can have subclasses
//				- they are declared w/o an implementation
// 				adding abstract to a class add security 
//Practice code in likeness to Bro Code's

abstract class Human {
	
	// abstract method cannot specify a body/contents
		//abstract void speak() {   }
	
	// hence we simply declare a method, let subclasses define it
	abstract void walk();
}

class Female extends Human {

	// since walk() is abstract, it is REQUIRED in every subclasses
	@Override
	void walk() {
		System.out.println("The female has begun to walk");
		
	}
	
}


public class tryingAbstraction {

	public static void main(String[] args) {
		
		// this cannot be instantiated because this is too vague
			//Human h = new Human();
		
		// hence we need to specify what type of human is our object:
		Female f = new Female();

		f.walk();
	}

}
