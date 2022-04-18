package oops;

public class polymorphism {

	public static void main(String[] args) {
		person2 p1 = new person2();
		person2 p2 = new person2();
		
		p1.name = "Arun";
		p1.age = 23;
		p2.name = "Varun";
		p2.age = 22;
		
		System.out.println(p1.name + " age is "+p1.age);
		System.out.println(p2.name + " age is "+p2.age);
		
		p1.walk(10);                                           //compile time polymorphism
		p1.walk();
		p2.eat();
		}
}

class person2{                         // person2 class 
	String name;
	int age;
	
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



