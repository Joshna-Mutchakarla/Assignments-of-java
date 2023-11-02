
ASSIGNMENT-2:

CAR PROGRAM:
---------------------
package com.Java.Assignments;

public class Car {
	String make;
	String model;
	short year;
	int price;
	
	Car(String make,String model,short year,int price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
		System.out.println(make +" " +model +" " +year +" " +price +" ");		
		
	}

	public static void main(String[] args) {
		Car C1 = new Car("TATA" , "INDICA" , (short) 2000 , 500000);
		

	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------
CALCULATOR PROGRAM:
------------------------
package com.Java.Assignments;

public class Calculator {
	public int add(int a, int b) {
		System.out.println("addition of two numbers:");
		return (a+b);
	}
	public int add(int a, int b, int c) {
		System.out.println("addition of three numbers:");
		return (a+b+c);
	}
	public double add(double a, double b) {
		System.out.println("addition of two  decimal numbers:");
		return (a+b);
	}
	

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2,3));
		System.out.println(c1.add(4,5,8));
		System.out.println(c1.add(1.5,2.5));

	}
	
	}



