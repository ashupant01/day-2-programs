package onestens;

import java.lang.runtime.ObjectMethods;

public class onestens extends ObjectMethods {

	public static void main(String[] args) {
	

            //Create new scanner
            Scanner input = new Scanner(System.in);

            //Values of each digit
            int hundreds = 0;
            int tens = 0;
            int ones = 0;

            //Prompt user to input 3 digit number           
            System.out.print("Enter a 3 digit number: ");
            int number = input.nextInt();

            //Displays hundreds place digit
            hundreds = number / 100;
            System.out.printf("Hundreds place digit: " , hundreds);

            //Displays tens digit
            tens = (number - hundreds) / 10;
            System.out.printf("\nTens place digit: " , tens);


            //Display ones digit
            ones = (number - tens - hundreds);
            System.out.printf("\nOnes place digit: " , ones);   


            //Error if number is less or more then three digits
            if (number > 999); 
            System.out.println("\nError! Number more then 3 digits.");
            if (number < 100);
            System.out.println("Error! Number less then 3 digits.");
}

	}

}
