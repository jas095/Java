/*
 * 1. Write a program that contains a function (named 'quantity') 
 * that receives as arguments an array of integer values and 
 * a second argument indicating the value to search for in the array. 
 * The function will return how many times the value is found in the array. 
 * The main of your program must demonstrate that its function works correctly.
 */

public class Search_value {
	
	//Start of the "quantity" function
	static int quantity(int listValues[], int element) {
		
		int cont = 0,i; //Cont variable that stores how many times the element was found in the array.
		
		for(i=0; i < listValues.length; i++) {
			
			if(listValues[i]==element) {
				cont++;
			}
			
		}
		
		return cont;
	}//end of the "quantity" function
	
	

	public static void main(String[] args) {
		
		// **** Arrays defined to test the functionality of the program
		int[] array1 = {4,8,2,23,76,-23,4,65,0,4,-45,23,34,-23,4,12,4,0,5,2};
		int[] array2 = {1,5,7,9,7,5,3,0,5,-3,-6,12,34,-4,-2};
		int[] array3 = {-3,-6,23,33,12,54,-5,-4,-3,-7,23,12,2,8,3,7,6};
		int[] array4 = {-3,-6,23,33,12,54,-5,-4,-3,-7,23,12,2,8,3,7,6};
		
		int itemQuantity;
		
		itemQuantity = quantity(array1,4);
		System.out.println("The value '4' was found " + itemQuantity + " times in the array1. \n");
		itemQuantity = quantity(array2,8);
		System.out.println("The value '8' was found " + itemQuantity + " times in the array2. \n");
		itemQuantity = quantity(array3,-3);
		System.out.println("The value '3' was found " + itemQuantity + " times in the array3. \n");
		itemQuantity = quantity(array4,7);
		System.out.println("The value '7' was found " + itemQuantity + " times in the array4.");
			

	}

}
