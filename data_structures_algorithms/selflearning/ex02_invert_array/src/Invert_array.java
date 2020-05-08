/* 
 * 2. Write a program that contains a function (name 'invert') that receives as an argument
 * an array of type double and inverts its content. That is, if the values ​​were 
 * originally {1,5,7,12} now they are {12, 7, 5, 1}. The function should work correctly 
 * for any array with any size.
*/

public class Invert_array {
	
	//Start of the "invert" function
	static void invert(double array[]) {
		
		String text = "normal array:";
		String text1 = "invert array:";	
		int index = array.length, i;
		double[] invertArray=new double[index];
		
		
		for(i=0; i< array.length; i++)
		{
			invertArray[i] = array[index-1];
			index--;
		}
		
		
		for(i=0; i< invertArray.length; i++)
		{
			text += array[i] + ", ";
			text1 += invertArray[i] + ", ";
		}
		
		System.out.println(text);
		System.out.println(text1 +"\n\n");

	}////end of the "invert" function
	
	

	public static void main(String[] args) {
		
		// **** Arrays defined to test the functionality of the program
		double[] array1 = {4,8,2,23,76,-23,4,65,0,4,-45,23,34,-23,4,12,4,0,5,2};
		double[] array2 = {1,5,7,9,7,5,3,0,5,-3,-6,12,34,-4,-2};
		double[] array3 = {-3,-6,23,33,12,54,-5,-4,-3,-7,23,12,2,8,3,7,6};
		double[] array4 = {-3,-6,23,33,12,54,-5,-4,-3,-7,23,12,2,8,3,7,6};
		
		
		
		System.out.println("Running the program for the array1");
		invert(array1);
		
		System.out.println("Running the program for the array2");
		invert(array2);
		
		System.out.println("Running the program for the array3");
		invert(array3);
		
		System.out.println("Running the program for the array4");
		invert(array4);
		
	
		
		

	}

}
