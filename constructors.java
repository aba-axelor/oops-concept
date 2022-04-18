package oops;

public class constructors {

	public static void main(String[] args) {
		person3 p1 = new person3(23, "Arun");                 //whatever written after "new" is constructor
		person3 p2 = new person3();
		
//		p1.name = "Arun";
//		p1.age = 23;
		
		p2.name = "Varun";
		p2.age = 22;
		
		System.out.println(p1.name + " age is "+p1.age);
		System.out.println(p2.name + " age is "+p2.age);
		
		p1.walk(10);                                           
		p1.walk();
		p2.eat();
		System.out.println("Number of persons is " +person3.count);                 //Bcz count is now a class(person3) property.
		
		}
}

class person3{                         // person3 class 
	String name;
	int age;
	
	static int count;                 //Static keyword means that its not a object property now but rather a "Class" property.
	
	
	public person3() {                                 //Constructor with no arguments and its name should be same as "class" name
		count++;
		System.out.println("Creating an Object");
	}
	
	public person3(int age , String  name) {                        //constructor overloading
		this();                                         // calling constructor inside constructor
		this.name = name;                       // bcz both parameters are same.
		this .age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked "+ steps+" steps.");
	}
}
