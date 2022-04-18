package oops;

public class methods {

	public static void main(String[] args) {
		person1 p1 = new person1();
		person1 p2 = new person1();
		
		p1.name = "Arun";
		p1.age = 23;
		p2.name = "Varun";
		p2.age = 22;
		
		System.out.println(p1.name + " age is "+p1.age);
		System.out.println(p2.name + " age is "+p2.age);
		
		p1.walk(5);                             //method calling
		p2.eat();
		}
}

class person1{                         // person1 class 
	String name;
	int age;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {                                                  //methods
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked "+ steps+" steps.");
	}
}



