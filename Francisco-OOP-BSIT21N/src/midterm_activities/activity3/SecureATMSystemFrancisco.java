// Marl Louie T. Francisco | BSIT 2-1N
// Midterm Activity # 3 - ATM w/ Transaction Counter
// UPDATED 06/10/26!

//my package
package midterm_activities.activity3;

// necessary imports -------------------------------------------------------
import java.io.Console;
import java.util.*; // for input mismatch and scanner

public class SecureATMSystemFrancisco {

	public static void main(String[] args) {
		
		// declarations ----------------------------------------------------
		Console c = System.console();
		Scanner sc = new Scanner(System.in);
		String thePIN = "Francisco1234";
		int attempt = 1; // as 1st attempt
        boolean lock = true;
		
        System.out.println("Welcome to ATM by Marl :>");
        
        // authentication - while loop -------------------------------------
        while (lock) {
			System.out.print("Enter a PIN: ");
			
			// this manages console null issue in IDEs
			String user_pin;
			if (c != null) {
			    user_pin = c.readLine();
			} else {
			    user_pin = sc.nextLine();
			}
			
			// verify - nested if
			if (user_pin.equals(thePIN)) {
		        if (lock) {
		            lock = false; // unlocked, to exit the loop
		            System.out.println("Login Success.");
		        }
		    } else {
		        if (attempt == 3) { // if 3rd attempt fails,
		            System.out.println("Account Locked.");
		            System.exit(0);
		        } else {
		            System.out.println("Incorrect PIN.");
		            attempt++;
		        }
		    }
		}
     
			
        // ATM system main menu --------------------------------------------
        double balance = 5000; // starting balance
        int choice = 0; // needs to be initialized
    	// do-whiled
    	do {
    		// try - handling string input
    		try {
	            System.out.println("\n===== ATM MENU =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("\nChoose option: ");

	            choice = sc.nextInt();
            
    		} catch (InputMismatchException e) {
    		    System.out.println("Numbers only!");
    		    sc.nextLine(); // this clears the invalid line
    		    continue; // go to next iteration
    		}
           
            // options (switch) --------------------------------------------
            switch (choice) {
            	// balance
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                    
                // deposit
                case 2:
                	try {
                	    System.out.print("Enter deposit amount: ");
                	    double deposit = sc.nextDouble();
                	    
                	    if (deposit > 0) {
                        	balance += deposit;
                        	System.out.println("Deposit successful.");
                        } else {
                        	System.out.println("Invalid value.");
                        }
                        break;
                        
                	} catch (InputMismatchException e) {
                	    System.out.println("Numbers only!");
                	    sc.nextLine();
                	    break;
                	}
                	
                // withdraw
                case 3:
                	try {
                		System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();
                	    
                        // Withdraw VALIDATION - (nested if)
                        if (withdraw > 0) {
                            if (withdraw <= 2000) {
                                if (withdraw <= balance) {
                                    balance -= withdraw;
                                    System.out.println("Withdrawal successful.");
                                } else {
                                    System.out.println("Insufficient balance.");
                                }
                            } else {
                                System.out.println("Max withdrawal is 2000 only.");
                            }
                        } else {
                            System.out.println("Invalid amount.");
                        }
                        break; 
                	           
                	} catch (InputMismatchException e) {
                	    System.out.println("Numbers only!");
                	    sc.nextLine();
                	    break;
                	}
       
                // exit
                case 4:
                    System.out.println("Program terminating...");
                    System.out.println("Thank you for using :>");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
            
         // this expects choice has value hence needs to be initialized first
        } while (choice != 4);

 
        sc.close();
	}
	
}