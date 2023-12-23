import java.util.Scanner;

public class Calculator2 {
	
	// this method returns one of these inputs if the user enter of them
	public static boolean isValidStandardOperator(String operators) {
		return operators.equals("+") || operators.equals("-") || operators.equals("*") || operators.equals("/");
	}
	
	// it's similar to the above method but it's for scientific mode
	public static boolean isValidScientificOperator(String operators) {
		return operators.equals("+") || operators.equals("-") || operators.equals("*") || operators.equals("/") || operators.equals("sin") || operators.equals("cos") || operators.equals("tan");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		   
	    // this variable is there to store standard or scientific
	    String mode;
	    
	    // this variable will store the operators the user puts later on
	    String operators;
	    
	    // this variable will store the numbers that the user wants to add later on
	    int userNumbers;
	    
	    // this variable will store the numbers that are involved in performing the operation
	    double numberPerform = 0.0;
	    
	    // this variable will store the result of the calculations
	    double results = 0.0;
	    
	    // this variable will store the choice of the user to continue the program
	    String userChoice;
	    
	    // this variable will assist with restarting the program
	    boolean startOver = true;
	    
	    // this while loop is used to run the program again if the user desires
	    while (startOver) {
	    	// a do while loop is used to run the program
		    do {
		        System.out.println("Enter the calculator mode: Standard/Scientific?");
		        mode = scnr.next();
		         
		        // if the user chooses standard mode, inform the user that the calculator is going to operate in standard mode, and prompt the user for operations they want to use
		        if (mode.equalsIgnoreCase("Standard")) {
		           System.out.println("The calculator will operate in standard mode.");
			       System.out.println("Enter " + '\'' + '+' + '\'' + " for addition, " + '\'' + '-' + '\'' + " for subtractions, " + '\'' + '*' + '\'' + " for multiplication, " + '\'' + '/' + '\'' + " for division");
			       operators = scnr.next();
			       
			       // Keep reprompting the user when the user inputs an invalid operator
			       while (!isValidStandardOperator(operators)) {
			           System.out.println("Invalid operator " + operators);
				       System.out.println("Enter " + '\'' + '+' + '\'' + " for addition, " + '\'' + '-' + '\'' + " for subtractions, " + '\'' + '*' + '\'' + " for multiplication, " + '\'' + '/' + '\'' + " for division");
				       operators = scnr.next();			        	
					    			        	
			       }
			       // if the user wants to add, ask them how many numbers do they want to add
			       if (operators.equals("+")) {
			    	   System.out.println("How many numbers do you want to add?");
			    	   userNumbers = scnr.nextInt();
			        	   
			    	   // prompt the user to input the numbers to perform the operation
			    	   System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			    	   // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			    	   for (int i = 1; i <= userNumbers; i++) {
			        		numberPerform = scnr.nextDouble();
				        	   
			        		// this stops collecting the last input and focuses on all the inputs being entered
			        		// numberPerform is being added to the results in each iteration
				        	results += numberPerform; // results = numberPerform + results;
			    	   }
			        	   
			    	   System.out.println("Result: " + results);
			        	   
			    	   // Ask the user if they want to start over the program
			    	   System.out.println("Do you want to start over? (Y/N)");
			    	   userChoice = scnr.next();
			        	   
			    	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					   if (!userChoice.equalsIgnoreCase("Y")) {
					    	startOver = false;
					    	System.out.println("Goodbye"); 	
					    	scnr.close();
					    	break;
					   }
					   // if they said, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					   else if (userChoice.equalsIgnoreCase("Y")){
					    	results = 0.0;
					   }
			        	         	   
			        	   
			        	   
			        	    
			        }
			        // subtraction
			       	else if (operators.equals("-")) {
			        	 // Prompts the user how many numbers do they want to subtract
			        	 System.out.println("How many numbers do you want to subtract?");
			        	 userNumbers = scnr.nextInt();
			        	   
			        	 // prompt the user to input the numbers to perform the operation
			        	 System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	 // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	 for (int i = 1; i <= userNumbers; i++) {
			        		  numberPerform = scnr.nextDouble();
			        		  results -= numberPerform;
			        		   
			        		  // when you subtract numberPerform from results in the first iteration, results will be a negative number (0 - numberPerform)
			        		  // Ultimately, the program is going to print the wrong result.
			        		  // Math.abs() is used once in the first iteration to make results a positive numbers, and later iterations will run as normal, ignoring the if statement
			        		  if (i == 1) {
			        			  results = Math.abs(results);
			        		  }
			        	 }
			        	   
			        	   
			        	 // Prints result
			        	 System.out.println("Result: " + results);
			        	   
			        	 // Ask the user if they want to start over the program
			        	 System.out.println("Do you want to start over? (Y/N)");
			        	 userChoice = scnr.next();
			        	   
			        	 // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					     if (!userChoice.equalsIgnoreCase("Y")) {
					    	  startOver = false;
					    	  System.out.println("Goodbye");
					    	  scnr.close();
					    	  break;
					     }
					     // if they said, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					     else if (userChoice.equalsIgnoreCase("Y")){
					    	  results = 0.0;
					     }
			        }
			           
			        // multiplication
			       	else if (operators.equals("*")) {
			        	  // Prompts the user how many numbers do they want to multiply
			        	  System.out.println("How many numbers do you want to multiply?");
			        	  userNumbers = scnr.nextInt();
			        	   
			        	  // prompt the user to input the numbers to perform the operation
			        	  System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	  // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	  for (int i = 1; i <= userNumbers; i++) {
			        		   numberPerform = scnr.nextDouble();
			        		   results *= numberPerform;
			        		   
			        		   // without the if statement, results will always be 0 (0 * numberPerform)
			        		   // on the first iteration, numberPerform is stored in results so 0 wouldn't be printed in the result
			        		   if (i == 1) {
			        			   results = numberPerform;
			        		   }
			        	  }
			        	   
			        	  // Prints result
			        	  System.out.println("Result: " + results);
			        	   
			        	  // Ask the user if they want to start over the program
			        	  System.out.println("Do you want to start over? (Y/N)");
			        	  userChoice = scnr.next();
			        	   
			        	  // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					      if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					      }
					      // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					      else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					      }
			        	   
			        }
			           
			        // Division
			       	else if (operators.equals("/")) {
			        	  // Prompts the user how many numbers do they want to divide
			        	  System.out.println("How many numbers do you want to divide?");
			        	  userNumbers = scnr.nextInt();
			        	   
			        	  // prompt the user to input the numbers to perform the operation
			        	  System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	  // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	  for (int i = 1; i <= userNumbers; i++) {
			        		   numberPerform = scnr.nextDouble();
			        		   results /= numberPerform;
			        		   
			        		   // similar to multiplication, results will always be zero if there isn't an if statement that will save numberPerform into results in the first iteration
			        		   if (i == 1) {
			        			   results = numberPerform;
			        		   }
			        	  }
			        	   
			        	  // Prints result
			        	  System.out.println("Result: " + results);
			        	   
			        	  // Ask the user if they want to start over the program
			        	  System.out.println("Do you want to start over? (Y/N)");
			        	  userChoice = scnr.next();
			        	   
			        	  // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					      if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					      }
					      // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					      else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					    	   // System.out.println("Enter the calculator mode: Standard/Scientific?");
					    	   // operators = scnr.next();
					      }
			        	   
			        }
			        // if the user puts anything that are not the operators, inform the user that their input is an invalid operator
			        	// break;
			        	// System.out.println("Enter the calculator mode: Standard/Scientific?");
			        	// operators = scnr.next();
			        	   
			        
			       
		           // } while (operatorValid);
		        }
		        
		        
		        
		        // if the user chooses scientific mode
		        else if (mode.equalsIgnoreCase("Scientific")){
		        	System.out.println("The calculator will operate in scientific mode.");
		        	System.out.println("Enter " + '\'' + '+' + '\'' + " for addition, " + '\'' + '-' + '\'' + " for subtractions, " + '\'' + '*' + '\'' + " for multiplication, " + '\'' + '/' + '\'' + " for division, " + '\'' + "sin" + '\'' + " for sin x, " + '\'' + "cos" + '\'' + " for cos x, " + '\'' + "tan" + '\'' + " for tan x:");
		        	operators = scnr.next();
		        	
		        	
				    // Keep reprompting the user when the user inputs an invalid operator
				    while(!isValidScientificOperator(operators)) {
			           System.out.println("Invalid operator " + operators);
			           System.out.println("Enter " + '\'' + '+' + '\'' + " for addition, " + '\'' + '-' + '\'' + " for subtractions, " + '\'' + '*' + '\'' + " for multiplication, " + '\'' + '/' + '\'' + " for division, " + '\'' + "sin" + '\'' + " for sin x, " + '\'' + "cos" + '\'' + " for cos x, " + '\'' + "tan" + '\'' + " for tan x:");
				       operators = scnr.next();        	
				    }		        	
		        	
		        	
		        	
		        	// if the user wants to add, ask them how many numbers do they want to add
			        if (operators.equals("+")) {
			        	System.out.println("How many numbers do you want to add?");
			        	userNumbers = scnr.nextInt();
			        	   
			        	// prompt the user to input the numbers to perform the operation
			        	System.out.println("Enter " + userNumbers + " numbers:");
			        	
			        	// for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	for (int i = 1; i <= userNumbers; i++) {
			        		 numberPerform = scnr.nextDouble();
				        	   
			        		  // this stops collecting the last input and focuses on all the inputs being entered
			        		  // numberPerform is being added to the results in each iteration
				        	  results += numberPerform; // results = numberPerform + results;
			        	 }
			        	   
			        	 System.out.println("Result: " + results);
			        	 
			        	 // Ask the user if they want to start over the program
			        	 System.out.println("Do you want to start over? (Y/N)");
			        	 userChoice = scnr.next();
			        	 
			        	 // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					     if (!userChoice.equalsIgnoreCase("Y")) {
					    	  startOver = false;
					    	  System.out.println("Goodbye");
					    	  scnr.close();
					    	  break;
					     }
					     // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					     else if (userChoice.equalsIgnoreCase("Y")){
					    	 results = 0.0;
					     }
			        	 
			        	 
			        	  
			         }
			         // subtraction
			         else if (operators.equals("-")) {
			        	 // Prompts the user how many numbers do they want to subtract
			        	 System.out.println("How many numbers do you want to subtract?");
			        	 userNumbers = scnr.nextInt();
			        	   
			        	 // prompt the user to input the numbers to perform the operation
			        	 System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	 // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	 for (int i = 1; i <= userNumbers; i++) {
			        		 numberPerform = scnr.nextDouble();
			        		 results -= numberPerform;
			        		   
			        		 // when you subtract numberPerform from results in the first iteration, results will be a negative number (0 - numberPerform)
			        		 // Ultimately, the program is going to print the wrong result.
			        		 // Math.abs() is used once in the first iteration to make results a positive numbers, and later iterations will run as normal, ignoring the if statement
			        		 if (i == 1) {
			        			 results = Math.abs(results);
			        		 }
			        	 }
			        	   
			        	   
			        	 // Prints result
			        	 System.out.println("Result: " + results);
			        	   
			        	 // Ask the user if they want to start over the program
			        	 System.out.println("Do you want to start over? (Y/N)");
			        	 userChoice = scnr.next();
			        	   
			        	 // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					     if (!userChoice.equalsIgnoreCase("Y")) {
					    	 startOver = false;
					    	 System.out.println("Goodbye");
					    	 break;
					     }
					     // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					     else if (userChoice.equalsIgnoreCase("Y")){
					    	 results = 0.0;
					     }
			         }
			         // Multiplication
			         else if (operators.equals("*")) {
			        	 // Prompts the user how many numbers do they want to multiply
			        	 System.out.println("How many numbers do you want to multiply?");
			        	 userNumbers = scnr.nextInt();
			        	   
			        	 // prompt the user to input the numbers to perform the operation
			        	 System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	 // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	 for (int i = 1; i <= userNumbers; i++) {
			        		 numberPerform = scnr.nextDouble();
			        		 results *= numberPerform;
			        		   
			        		 // without the if statement, results will always be 0 (0 * numberPerform)
			        		 // on the first iteration, numberPerform is stored in results so 0 wouldn't be printed in the result
			        		 if (i == 1) {
			        			 results = numberPerform;
			        		 }
			        	   }
			        	   
			        	   // Prints result
			        	   System.out.println("Result: " + results);
			        	   
			        	   // Ask the user if they want to start over the program
			        	   System.out.println("Do you want to start over? (Y/N)");
			        	   userChoice = scnr.next();
			        	   
			        	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					       if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					       }
					       // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					       else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					       }
			        	   
			           }
			           // Division
			           else if (operators.equals("/")) {
			        	   // Prompts the user how many numbers do they want to divide
			        	   System.out.println("How many numbers do you want to divide?");
			        	   userNumbers = scnr.nextInt();
			        	   
			        	   // prompt the user to input the numbers to perform the operation
			        	   System.out.println("Enter " + userNumbers + " numbers:");
			        	   
			        	   // for loop is used to input the numbers a specific number of times based on their response stored in userNumbers
			        	   for (int i = 1; i <= userNumbers; i++) {
			        		   numberPerform = scnr.nextDouble();
			        		   results /= numberPerform;
			        		   
			        		   // similar to multiplication, results will always be zero if there isn't an if statement that will save numberPerform into results in the first iteration
			        		   if (i == 1) {
			        			   results = numberPerform;
			        		   }
			        	   }
			        	   
			        	   // Prints result
			        	   System.out.println("Result: " + results);
			        	   
			        	   // Ask the user if they want to start over the program
			        	   System.out.println("Do you want to start over? (Y/N)");
			        	   userChoice = scnr.next();
			        	   
			        	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					       if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					       }
					       // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					       else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					       }
			        	   
			           }
			           // sin 
			           else if (operators.equals("sin")) {
			        	   System.out.println("Enter a number in radians to find the sine");
			        	   numberPerform = scnr.nextDouble();
			        	   
			        	   // use Math.sin() from the math library to perform the operation
			        	   results = Math.sin(numberPerform);
			        	   
			        	   // Prints result
			        	   System.out.println("Result: " + results);
			        	   
			        	   // Ask the user if they want to start over the program
			        	   System.out.println("Do you want to start over? (Y/N)");
			        	   userChoice = scnr.next();
			        	   
			        	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					       if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					       }
					       // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					       else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					       }
			        	   
			           }
			           // cosine
			           else if (operators.equals("cos")) {
			        	   System.out.println("Enter a number in radians to find the cosine");
			        	   numberPerform = scnr.nextDouble();
			        	   
			        	   // use Math.cos() from the math library to perform the operation
			        	   results = Math.cos(numberPerform);
			        	   
			        	   // Prints result
			        	   System.out.println("Result: " + results);
			        	   
			        	   // Ask the user if they want to start over the program
			        	   System.out.println("Do you want to start over? (Y/N)");
			        	   userChoice = scnr.next();
			        	   
			        	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					       if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					       }
					       // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					       else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					       }
			        	   
			           }
			           // tan
			           else if (operators.equals("tan")) {
			        	   System.out.println("Enter a number in radians to find the tangent");
			        	   numberPerform = scnr.nextDouble();
			        	   
			        	   // use Math.tan() from the math library to perform the operation
			        	   results = Math.tan(numberPerform);
			        	   
			        	   // Prints result
			        	   System.out.println("Result: " + results);
			        	   
			        	   // Ask the user if they want to start over the program
			        	   System.out.println("Do you want to start over? (Y/N)");
			        	   userChoice = scnr.next();
			        	   
			        	   // if they said no or any other word, set startOver to false and put break to exit the loop and the program wouldn't run anymore
					       if (!userChoice.equalsIgnoreCase("Y")) {
					    	   startOver = false;
					    	   System.out.println("Goodbye");
					    	   scnr.close();
					    	   break;
					       }
					       // if they said yes, the program will start again and reset the results to 0.0 so it don't affect the result of future calculations
					       else if (userChoice.equalsIgnoreCase("Y")){
					    	   results = 0.0;
					       }
			        	   
			           }
			           
			         	
		        }
		        
		        
		        
		        
		         
		    } while(scnr.hasNextLine() && (mode.equalsIgnoreCase("Standard")) || (mode.equalsIgnoreCase("Scientific")));
		    
		    
		    
	    }   
		    
	    
	}

}
