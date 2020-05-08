/*
 *  4. Modify the function from the previous exercise so that column 20 
 *  on the screen corresponds to the value 0. If the value at position n in 
 *  the array is positive, the number of corresponding asterisks to the right of that
 *   position will be printed. If the value is negative then they will be printed to the 
 *   left of the position. At position 20 the | character will be printed. If the value at 
 *   position n is 0 then only the | character will be printed on that line. If the value is 
 *   greater than 20 or less than -20 only 20 asterisks will be printed. If, for example, the 
 *   array had the values {5, 9, -12, 5, 0, -6} the following would be printed:
 *
 *      		  |*****
 *      		  |*********
 *	    **********|
 *	      		  |*****
 *	       		  |
 *			******|
 */

public class Print_stars_right_left {

	static void printArrayInAsterisks(int array[]){
		int elem, auxelem; 
		
		for(int i=0; i<array.length; i++) {
			
			elem = array[i];
			auxelem = elem;
			
			if(elem>0) {
				
				if(elem>20) {
					auxelem=20;
				}
				for(int l=0;l<20;l++) {
					System.out.print(" ");
				}
				System.out.print("|");

				for(int j=0;j<auxelem;j++) {
					System.out.print("*");
					//elem--;
				}
				System.out.println(" ");
				
			}else if (elem < 0) {
				
				if(elem<-20) {
					auxelem=-20;
				}

				auxelem = auxelem*(-1);
				
				
				for(int l=0;l<20-auxelem;l++) {
					System.out.print(" ");
				}
				for(int j=0;j<auxelem;j++) {
					System.out.print("*");
					//elem--;
				}
				System.out.print("|");
				
				System.out.println(" ");
				
			}
			else {
				for(int l=0;l<20;l++) {
					System.out.print(" ");
				}
				System.out.println("|");
			}
			
		}
		
	}
		
		
		

	public static void main(String[] args) {
		
		// **** arrays defined to test the functionality of the program
		int[] array1 = {0,4,21,8,2,3,-3,-5,-21,6,4,5,0,3,34,3,4,12,4,0,65,25};
		int[] array2 = {1,5,7,9,0,0,7,5,3,0,5,3,6,12,34,4,2};
		int[] array3 = {3,6,-23,-33,12,-54,5,4,-3,7,0,23,12,2,8,3,7,6};
		int[] array4 = {3,6,-23,33,-12,54,5,4,0,3,7,-23,12,2,8,3,-7,-6};
		
		
		
		System.out.println("Execution of the program forarray1");
		printArrayInAsterisks(array1);
		
		System.out.println("\nExecution of the program forarray2");
		printArrayInAsterisks(array2);
		
		System.out.println("\nExecution of the program forarray3");
		printArrayInAsterisks(array3);
		
		System.out.println("\nExecution of the program forarray4");
		printArrayInAsterisks(array4);

	}
}
