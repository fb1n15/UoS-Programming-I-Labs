import java.util.Scanner;

public class ATM {
	
	static Scanner scan = new Scanner(System.in);
	static int bankBalance;
	static String input;
	/////Main Method/////
	public static void main(String[] Args){
	
	ATM myATM = new ATM();
	myATM.go();	
	scan.close();
	
	}
	
	public void go(){
		/////Starting Balance Declaration///// 
		System.out.println("Welcome to online ATM banking\nHow much do you want in your account?\nEnter your number:");
		Boolean temp=true;
		while (temp){
			input = scan.nextLine();
			bankBalance = Integer.parseInt(input);
			if (bankBalance>=0){////Sanitizes the starting Balance. !(bankBalance<0)////
				temp = false;
			}else{
				System.out.println("Invalid input. Please re-enter your input:");
			} 
		} 
		
		System.out.println("Your current Balance is: " + bankBalance + " £");
		/////Menu Loop Starts.The user must choose an action (Choice) the "Menu"//////
		while(true){
			System.out.println("What do you want to do?\n1 : Withdraw\n2 : Deposit\n3 : Inquire\n4 : Quit\nEnter your number");
			temp = true;
			while (temp){
				input  = scan.nextLine();////Sanitizes the input. The input (Choice) must be either 1 | 2 | 3 | 4////
				if (input.equals("1")| input.equals("2")  | input.equals("3") | input.equals("4")  ){
					temp = false;
				}else{
					System.out.println("Invalid input. Please re-enter your input:");
				}
			}
			
			/////Calling the methods/////
			////Choice "1" for Withdrawal////
		    ////Choice "2" for Deposit////
	      	////Choice "3" for Inquire////
	     	////Choice "4" for Quit////
			if(input.equals("1")){
				ATM.withdraw();
			}else if(input.equals("2")){
				ATM.deposit();
			}else if(input.equals("3")){
				ATM.inquire();
			}else if(input.equals("4")){
				ATM.quit();
			}
		}
		
		
	}
	/////Methods/////
	
	////Withdrawal Method: It abstracts the desired amount from the balance/////
	public static void withdraw(){
		System.out.println("*****************************************\n              Withdrawal\n*****************************************\nHow much would you like to withdraw?\nEnter your number:");
	    input = scan.nextLine();
	    if(Integer.parseInt(input)>=0){////Sanitizes the input. Input !(<0)////
	    	if ((bankBalance - Integer.parseInt(input))>0){ ////Sanitizes the input. Input !(Remaining balance <0)////
		    	bankBalance = bankBalance - Integer.parseInt(input);
		    }else{
		    	System.out.println("Invalid Input. Withdrawal greater than current account balance.");
		    }
	    }else{
	    	System.out.println("Invalid input. WIthdrawal Cannot be a negative number.");
	    }
	    
	    
	}
	////Deposit Method: The user can add the desired amount to his Balance./////
	public static void deposit(){
		System.out.println("*****************************************\n              Deposit\n*****************************************\nHow much would you like to deposit?\nEnter your number:");
		input = scan.nextLine();
		if(Integer.parseInt(input)>=0){/////Sanitizes the input. Input !(<0)./////
			bankBalance = bankBalance + Integer.parseInt(input);
		}else{
			System.out.println("Invalid Input. You cannot perfom a negative deposit.");
		}
		
	}
	////Inquire Method. It displays the remaining amount of the balance on the screen////
	public static void inquire(){
		System.out.println("*****************************************\n              Your Balance is " + bankBalance + "£\n*****************************************");

	}
	////Quit Method. It breaks the loop and exits the program////
	public static void quit(){
		System.out.println("*****************************************\n              GoodBye!\n*****************************************");
		System.exit(0);
	}
	

}
