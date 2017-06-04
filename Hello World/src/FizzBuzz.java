public class FizzBuzz {   //Declares and opens the class
	public static void main(String[] args) { //Declares and opens the Main method
		
		for(Integer i = new Integer(1); i < 61; i++){  //A 'for' loop starts. Its counter 'i' begins from the value 1 until it reaches 61. i++ increases the value of the counter by 1.
			
			if(i % 3 != 0 && i % 5 != 0){  // First if statement checks if the current value of the counter isn't divisible by 3 (Remainder not equal with 0) AND the same procedure for 5.
				System.out.print(i);}  // If the number isn't divisible by 3 and 5 then it just prints out this its value.
				
			if(i % 3 == 0){ //This if checks if the number is divisible by 3 (Remainder equal to 0). 
				System.out.print("Fizz");} //If it is divisible by 3 then it prints out the word Fizz.
			
			if(i % 5 == 0){  //This if checks if the number is divisible by 5 (Remainder equal to 0).
				System.out.print("Buzz");} // If it is divisible by 5 then it prints out the word Buzz.
			
			System.out.println(); // This empty println allows us change line after each loop for better visualization
				
	    }
    }
}
