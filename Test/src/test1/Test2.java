package test1;

import java.util.Scanner;
//removed char went back to string
public class Test2 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		String answer = "d";
	
		System.out.print("What is the best thing about pandas? ");
		 
		 System.out.println("");
		System.out.println("A. They are cute");
			System.out.println("B. They are fluffy");
			System.out.println("C. They'll eat your face off");
			System.out.println("D. All of the above");
		System.out.println("Answer: ");
			String answer1 = in.next();
		
		 do {	
			
		
		if(answer1 != answer) {
		 System.out.println("Not quite, try again? ");
		 boolean input2 =in.nextBoolean();
			
			if(input2 == true) {
			}//loops it back to beginning
			else if (input2 == false) {
				System.out.println("Aww sad panda....");
				break;//skips to the two end scripts
			
			}
		}
		}while(answer1 == answer); {
			 System.out.println("Correct! Pandas are awesome");
			 System.out.println("Have a nice day!");
		 }//while end
				
			
			}
						
		 }//block end
	
		


