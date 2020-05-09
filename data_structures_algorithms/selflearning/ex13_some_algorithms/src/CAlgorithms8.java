/*
 *

1. Car class are their respective constructors (one without arguments and the other that allows assigning values ​​to all its attributes) 
and methods (setters and getters) that make it possible to set and get each of the attributes. For example setMarca (…) and getMarca ().

2. Stack handles Automobile class objects
3. The program provides that before inserting an object into the stack the user can enter the values ​​of the properties.

5. The program provides that when a pop is made, the values ​​of the attributes of the object that popped are displayed on the screen. 
Remember that the stack pop method will not be the one that prints the content of the object, it will only return it.
The content will be printed in the main ().

6. The Stack toString method returns a string that represents the contents of the stack showing the values ​​of the attributes 
in blocks of three lines separated by a string of broken lines. The top of the stack is written first. The following is an example 
of what the string returned by the method would be for a stack with three objects.

Honda 
Accord 
1999
______
Mitsubishi 
Technica 
1997
______
Hundai 
Génesis 
2012

total
 */

import java.util.Scanner;

public class CAlgorithms8 {

	public static void main(String[] args) throws Exception {
		
		Stack pila = new Stack();
		Car car = new Car();
		
		String brand;
		String model;//Accord 
		int year, repeat = 0;//1999
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please indicate the number of cars you want to add: ");
		repeat = input.nextInt();
		for (int i = 0; i < repeat; i++) {
			
			System.out.println("\nEnter the car data number " + (i+1) + " below");
			System.out.print("Brand: ");
			brand = input.next();
			System.out.print("\nModel: ");
			model = input.next();
			System.out.print("\nYear: ");
			year = input.nextInt();
			car.setBrand(brand);
			car.setModel(model);
			car.setYear(year);
			pila.push(car);
			
		}
		input.close();
		pila.outputs();
		System.out.println("==============\nResults ");
		for (int i = 0; i < repeat; i++) {
			
			Object p = pila.pop();
			System.out.println(p);
			
		}
		//pila.outputs();

	}

}


/*
 * Please indicate the number of cars you want to add: 2
Enter the car data number 1 below
Brand: Honda
Model: Accord
Year: 1999

Enter the car data number 2 below
Brand: Mitsubishi
Model: Technica
Year: 1997
==============
Results 
Mitsubishi
Technica
1997
_____
Mitsubishi
Technica
1997
_____

Mitsubishi
Technica
1997


Mitsubishi
Technica
1997

Is empty
*/