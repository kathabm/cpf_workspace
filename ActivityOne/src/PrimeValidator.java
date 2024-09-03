/* Student
   Erika Katherin Barbosa Mayorga 
*/
import java.util.Scanner;

public class PrimeValidator {

	public static void main(String[] args) {
		
		System.out.println("This program validates if the number is prime.");
		
		Scanner sn = new Scanner(System.in);
		// Prompt user for input
        System.out.print("Enter an integer between 2 and 2000000: ");
        int inputNumber = sn.nextInt();
        
        // Validate if the input follows the rule 
        if (inputNumber < 2 || inputNumber > 2000000) {
            System.out.println("Input number is out of range.");
            sn.close();
            return;
        }
        
        // Validate using the isPrime method if the number is prime and display the result
        if (isPrime(inputNumber)) {
            System.out.println("The number: "+ inputNumber + " is prime");
        } else {
            System.out.println("The number: "+ inputNumber + " is not prime");
        }
        
        // Close the scanner
        sn.close();
		
	}
	
	/**
     * Checks if a number is prime.
     * 
     * @param number the number to validate
     * @return true if the number is prime, false otherwise
     */
	
	public static boolean isPrime(int number) {
		// Initialize the counter of divisible numbers to zero
		int amountDivisibleNumber = 0;
		// Finds the amount of divisible numbers checking one by one if the MOD of the number is zero
		for(int i=1; i<= number; i++)
			if(number % i == 0)
				amountDivisibleNumber++; 
		// Validate if the amountDivisibleNumber follows the rule of prime numbers 
		if(amountDivisibleNumber == 2)
			return true;
		
		return false;
    }

}
