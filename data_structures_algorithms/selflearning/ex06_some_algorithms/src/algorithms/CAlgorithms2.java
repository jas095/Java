package algorithms;

/*expected outputs:
 * 
 *   
 * Result of the exercise 1
 *	 * * * * 
 *	 *     *
 *	 *     *
 *	 * * * * 
 * 
 * Result of the exercise 2
 * Slope and intercept values
 * of the linear equation [m=0.5, b=2.0]
 * 
 * 
 * Result of the exercise 3
 * The arrangements are the same in 5 positions.
*/

public class CAlgorithms2 {
	
	//exercise number One
	
	static void starSquare(int number) {
		
		for (int i = 1; i <= number; i++) {
			
			int repite = number -1;
			
			if(i == 1) {
				for (int j = 0; j < number; j++) {
					System.out.print("* ");
				}
				//System.out.println("");
				
			}
			
			if(i<repite) {
				System.out.println("");
				System.out.print("*"); //paraajustar si es par o impar, agregar o quitar un espacio luego del asterisco
				for (int j = 1; j <= number; j++) {
					System.out.print(" ");
				}
				System.out.print(" *");

			}
			if(i==repite) {
				System.out.println("");
				for (int k = 0; k < number; k++) {
					System.out.print("* ");
				}
			}
			
		}
	}//end exercise number One
	
	
	//exercise number Two
	
	//Creation of the StraightLine class that has as attributes 'm' and 'b' that are of type double and are public.
	private static class StraightLine{
		double m, b;
		StraightLine(){}
		StraightLine(double m, double b){
			this.m = m;
			this.b = b;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Slope and intercept values\n" + 
					" of the linear equation [m=" + m + ", b=" + b + "]";
		}
	}
	
	/*
	 * To calculate the slope m we have to x1,y1,x2,y2
	 * numerator = y2-y2
	 * denominator = x2-x1
	 * m = (numerator / denominator); with denominator !=0
	 * 
	 * For calculating intercept b
	 * b=(y-(m*x))
	 * 
	 * equation with m,b
	 * y = m x+ b
	 * */
	static StraightLine lineal(double x1, double y1, double x2, double y2) {
		
		//Recta resultado = new Recta();
		
		double numerator = y2-y1;
		double denominator = x2-x1;
		double m = 0;
		double b = 0;
		//double b1 = 0;
		
		if(denominator != 0 ) {
			m = (numerator/denominator);
			b =(y1-(m*x1));
			//b=(y2-(m*x2));
		}else {
			System.out.println("The calculation of the slope is impossible to solve, because X2 and X1 are the same. \nPlease enter different data. ");
		}

		
		StraightLine result = new StraightLine(m,b);
		
		return result;
		
	}//end exercise number Two
	
	
	//exercise number Three
	static int compareArrays(int[] arr1, int[] arr2) {
		int equal = 0;
		for (int i = 0; i < arr2.length; i++) {

			if(arr1[i] == arr2[i])
				equal++;
		}		
		return equal;
	}//end exercise number Three
	

	public static void main(String[] args) {
		
		//Arrays for exercise function 3
		int[] array1 = {4,8,2,2,7,4,0,0,2,4,6,4,12,4,2,5,2};
		int[] array2 = {1,5,7,9,7,5,3,0,5,3,6,12,34,4,2};
		int count_equal=0;
		
		System.out.println("Result of the excersice 1");
		starSquare(4); System.out.println("\n");
		//-4, 0, 0, 2

		System.out.println("Result of the excersice 2");
		StraightLine print_out = lineal(-4, 0, 0, 2);
		System.out.println(print_out);
		System.out.println("\n");
		
		System.out.println("Result of the excersice 3");
		count_equal = compareArrays(array1, array2);
		System.out.println("The arrangements are the same in " + count_equal + " positions.");
	

	}

}
