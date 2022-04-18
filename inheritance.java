package oops;

public class inheritance {

	public static void main(String[] args) {
		person4 p1 = new person4(23, "Arun");                                  //parametrised constructor(person class) called             
		person4 p2 = new person4();                                     //non parametrised function(person class) called
		
		p2.name = "Varun";
		p2.age = 22;
		
		System.out.println(p1.name + " age is "+p1.age);
		System.out.println(p2.name + " age is "+p2.age);
		
		p1.walk(10);                                          
		p1.walk();
		p2.eat();
		System.out.println("Number of persons is " +person3.count);   
		
		developer d1 = new developer(24, "Shivam");                        //child class object
		d1.walk();
		
		}
}
	
class developer extends person4{                          //child class
	public developer(int age, String name){
		super(age, name);
	}
	
	void walk(){
		System.out.println("Developer "+name+" is walking. ");            //run time polymorphism
	}
}	
	

class person4{                         // person4 class 
	String name;
	int age;
	
	static int count;                
	
	
	public person4() {                                             //constructor                       
		count++;
		System.out.println("Creating an Object");
	}
	
	public person4(int age , String  name) {                         //constructor              
		this();                                         
		this.name = name;                       
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