package final_lessons;

class sampleConstructors {
	String lname,fname,job;
	int age;
	
	/*Output:
	Name : Xavier, Charles
	Age : 60
	Job : Professor*/
	
	sampleConstructors(){ //constructor method containing initial values
		lname="Xavier";
		fname="Charles";
		job="Professor";
		age=60;
	}
	//OVERLOADING CONSTRUCTOR
	//a way to create objects with or without initial arguments
	//constructor with 1 argument
	sampleConstructors(int agey) 
	{ age = agey;}
	// with 4 arguments
	sampleConstructors(String lnamey,int ageyy, 
						String fnamey, String joby) {
	 	lname = lnamey;
		age = ageyy;
		job = joby;
		fname = fnamey;
		}
	
	public void setLastname(String last)
	{ lname=last; }
	public String getLastname()
	{ return lname; }
	
	public void setFirstname(String first)
	{ fname = first; }
	public String getFirstname()
	{ return fname;}
	
	public void setJob(String trabaho)
	{ job = trabaho; }
	public String getJob()
	{ return job; }
	
	public void setAge(int edad)
	{ age = edad; }
	public int getAge()
	{ return age;}
	}
	
	// Now examine the program below. 
	//It no longer calls the setAge(),setLastname(), setFirstname()
	// and setJob() methods.
public class ConstructorsTrial
	{ public static void main(String args[])
	{ 
		String lastname,firstname,work;
		
		sampleConstructors student = new sampleConstructors();
		lastname = student.getLastname();
		work=student.getJob();
		// but if we assign a value to a called method, name will change
		student.setAge(20);
		student.setFirstname("Marl Louie");
		firstname = student.getFirstname();

		System.out.println("Name: " + lastname + ", " + firstname);
		// this calls the age variable inside student class instead
		System.out.println("Age : " + student.age);
		System.out.println("Job : " + work);
		
		
		// from overloading constructors
		sampleConstructors student2 = new 
				sampleConstructors("Francisco", 25, "Maru", "Developer");
		// if outer class variable has no value - returns null
		System.out.println("Name: " + student2.lname + ", " + student2.fname);
		System.out.println("Age : " + student2.age);
		System.out.println("Job : " + student2.job);
	
	}
}
