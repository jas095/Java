/*
 * 3.Write a program that contains a function (named printarrayInAsterisks)
 * that receives an array of integer values as its argument. 
 * For each value in the array the function will print a line of asterisks 
 * where the number of asterisks in line n corresponds to the value in position n of the array. 
 *  For example, if the array values are {5, 3, 8, 4} the following would be printed:
 *  '*****'
 *  '***'
 *  '********'
 *  '****'
*/

public class Print_asterisks {
	
	static void printarrayInAsterisks(int array[]){
		int elem = 0, i;
		
		for(i=0; i<array.length; i++) {
			
			elem = array[i];
			
			while(elem>0) {
				System.out.print("*");
				elem--;
			}
			System.out.println(" ");
			
		}
		
	}

	public static void main(String[] args) {
		
		// **** Arrays defined to test the functionality of the program
		int[] array1 = {4,8,2,23,76,4,65,0,4,23,34,23,4,12,4,0,5,2};
		int[] array2 = {1,5,7,9,7,5,3,0,5,3,6,12,34,4,2};
		int[] array3 = {3,6,23,33,12,54,5,4,3,7,23,12,2,8,3,7,6};
		int[] array4 = {3,6,23,33,12,54,5,4,3,7,23,12,2,8,3,7,6};
		
		
		
		System.out.println("\nRunning the program for the array1");
		printarrayInAsterisks(array1);
		
		System.out.println("\nRunning the program for the array2");
		printarrayInAsterisks(array2);
		
		System.out.println("\nRunning the program for the array3");
		printarrayInAsterisks(array3);
		
		System.out.println("\nRunning the program for the array4");
		printarrayInAsterisks(array4);

	}

}
