package final_lessons;

class CPU{
	class Processor{
		double cores;
		String manufactures;
		
		double getCache() {
			return 4.3;
		}
	}
	
	protected class RAM{
		double memory;
		String manufactures;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
	
public class ProcessorOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		
		System.out.println("Processor Cache: " + processor.getCache());
		System.out.println("Ram Clock Speed: " + ram.getClockSpeed());
	}

}
