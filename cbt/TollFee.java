package cbt;
import java.util.Scanner;
public class TollFee {
public static void main(String[] args) {
    String carType = new Scanner(System.in);
    String carType = carType.nextLine();
	
	//String carType; 
	double fee = 0;
	switch(carType) {
	case "bus":
		fee = 2.5; break;
	case "taxi":
		fee = 5.0; break;
	case "truck":
		fee = 60; break;
	default:
		fee = 10; break;
		
	}
	System.out.println("type "+ carType + " car toll fee is "+ fee);
}
}
