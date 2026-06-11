package final_seatworks;

// final seatwork # 1 i think

public class IsEmpty {
	
	public static String checkTheString (String strng) {
		
		if (strng.trim().isEmpty()) {
			return "String is Empty";
		}else {
			return "String isn't Empty";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strng = "Hello, World!";
		String wala = " ";
		
		String result1 = checkTheString(strng);
		String result2 = checkTheString(wala);
		
		System.out.println(result1);
		System.out.print(result2);

	}

}
