package cbt;

import java.util.Scanner;

public class PersonTester {
public static void main(String[] args) {
	
	Person p1 = new Person();
	p1.name = "Adam";
	p1.age = 20;
	p1.gender = 'M';
	//System.out.println(p1.name);
	p1.eat();
	p1.read();
	
	Person p2 = new Person();
	p2.name = "Jennifer";
	p2.age = 25;
	p2.gender = 'F';
	p2.eat();
	p2.read();
	
	int caloryfrom1mile = p2.run();
	char initial = p2.getInitial();
	
	System.out.println("Person's name is <"+p2.name+"> and her initial is <"+ initial+ ">");

//	System.out.println("Person's name is <"+p2.name+"> and her initial is <"+ p2.getInitial()+">");
	
	System.out.println(p2.name + " was born in year " + p2.getBirthYear());
	
	p2.sayHelloTo("Adam");
	p2.sayHelloTo("John");
	p2.goHome("Your Home ", 10);
	
	double result = p2.addNumbers(1.1, 1.2, 1.3);
	System.out.println("result is "+ result);
	
//	Scanner scanner = new Scanner(System.in);
//	String str = scanner.next();
//	int num = scanner.nextInt();

	
//	System.out.println("This person has a name of <"+p2.name+"> and she is <"+p2.age+
//			                             "> yers old , her gender is <"+p2.gender+">");

	
}
}