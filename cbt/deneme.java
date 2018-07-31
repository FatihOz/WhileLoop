package cbt;
import java.util.Scanner;
public class deneme {
 public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("Enter two whole number between 1 thru 20");
	 int n1 = keyboard.nextInt();
	 int n2 = keyboard.nextInt();
	 System.out.println("Your total= "+ (n1 + n2));
	 System.out.println("Next enter floating point number");
	 System.out.println("Pls enter your two decimal numbers");
	 double n3 = keyboard.nextDouble();
	 double n4 = keyboard.nextDouble();
	 double n5 = n3 + n4;
	 System.out.println("Your Total= " +  n5);
	System.out.println("Conqratulations you got it");
	System.out.println("Now, Pls Enter your name and lastname");
	String b1 = keyboard.next();
	String b2 = keyboard.next();
	System.out.println("Thank you, " + b1+" "+b2);
	System.out.println("And Now, pls entr your favorite color and favorite pet");
	String c1 = keyboard.next();
	String c2 = keyboard.next();
	System.out.println("Your Favorite color and pet is " + c1 + c2);
	System.out.println("THANK YOU!!");
	}
}