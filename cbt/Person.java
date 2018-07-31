package cbt;

public class Person {

	String name;
	int age;
	char gender;
	
	public void eat() {
		
		System.out.println(name + " is eating");
	}
	
	public void sayHelloTo(String target) {
		System.out.println("Hello, " + target);
		
	}
	
	public void goHome(String destination, int distance) {
		System.out.println("go to "+ destination + distance);
	}
	
	public double addNumbers(double n1, double n2, double n3) {
		return n1+n2+n3;
	}
	
	
	
	
	void read() {
		if(gender=='M')
		System.out.println("<"+name+ "> is reading and He is <"+age+"> years old");
		else if(gender=='F')
			System.out.println("<"+name+ "> is reading and She is <"+age+"> years old");
		else
			System.out.println("<"+name+ "> is reading ");
	}
	
	//run for a mile , it should return 10 calory as a number
	public int run() {
		
		System.out.println("run 1 mile");
		return 10;
	}
	public char getInitial() {
		//char c = name.charAt(0)
		//return c;
		return name.charAt(0);
	}
	public int getBirthYear() {
		return 2018-age;
	}
	
}
