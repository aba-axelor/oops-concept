package oops;
import java.util.*;

import encapsulation.encapsulationIntro;

public class classesAndObjects {

	public static void main(String[] args) {
		person p1  = new person();             //p1 is object of class person
		person p2  = new person();             //p2 is object of class person
		p1.name = "Arun";                
		p1.age = 23;
		
		p2.name = "Varun";
		p2.age = 23;
		
		System.out.println(p1.name + " age is "+p1.age);
		System.out.println(p2.name + " age is "+p2.age);
		
		encapsulationIntro obj = new encapsulationIntro();
		obj.doWork();

	}
	
	
}

class person{                         // person class 
	String name;
	int age;
}

