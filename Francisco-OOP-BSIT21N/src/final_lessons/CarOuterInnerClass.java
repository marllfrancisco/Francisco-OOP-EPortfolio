package final_lessons;


// OUTER CLASS
class Car{
	String carName;
	String carType;
	
	// constructor - accepts arguments when class is called
	public Car(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	
	
	private String getCarName() {
		return this.carName;
	}
	
	// INNER CLASS
	class Engine{
		String engineType;
		
		// this method can determine size, using getCarName method
		void setEngine() {
			if(Car.this.carType.equals("4WD")) {
				if(Car.this.getCarName().equals("Crysller")) {
					this.engineType = "Smaller";
				}else {
					this.engineType = "Bigger";					
				}
			}else {
				this.engineType = "Bigger";
			}
		}
		
		String getEngineType() {
			return this.engineType;
		}
		
	}
}

public class CarOuterInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Mazda", "8WD");
		// Car is need to include when calling the inner class
		Car.Engine engine = car1.new Engine();
		
		engine.setEngine();
		
		System.out.println("Engine type 8WD = " + engine.getEngineType());
		
		Car car2 = new Car("Crysller", "4WD");
		Car.Engine engine2 = car2.new Engine();
		
		engine2.setEngine();
		
		System.out.println("Engine type 4WD = " + engine2.getEngineType());
		
		

	}

}
