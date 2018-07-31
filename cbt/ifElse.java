package cbt;
import java.util.Scanner;
public class ifElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
             int score;
             System.out.println("Enter Your Score:" );
             score = input.nextInt();	        
	        
		    if(score >= 300) {
			System.out.print("Perfect");}
	    
			else if(score >= 200) {
	    	    System.out.print("Very Good");
			}
	    	    else if(score >= 50) {
	    	    	System.out.print("Good Job");}
	    
	    	    	else {
	    	    		System.out.println("Thank you for playing");
	    	    		System.out.println("Try again later");
	    	    	}
	    	    }
	    
		}
		
		
		
	

