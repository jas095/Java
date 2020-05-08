/*
 * expected outputs:
 * the method inOrder returns:true
 * the method theSame returns:false
 * Diagonal of the character 'l'
 * l
 * .l
 * ..l
 * ...l
 * ....l
 * 
 * 5302617
 * the greater is: 5
 * the minor is: 5
 * the minor is: 3
 * the minor is: 0
 * the greater is: 6
 * the greater is: 7
 * 
 * The new array order
 * 5372610
 * 
 * exchange between stars and crosses
 *  *****+++*******++******+
 *  
 * */


public class CAlgorithms {
	
	//This is a static Class with two internal methods 
	private static class Trio{
		int x,y,z;
		
		//the class controller
		public Trio(int x, int y, int z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		boolean inOrder() {
			if (x > y & y > z) {
				return true;
			}else return false;
			
		}
		
		boolean theSame() {
			if (x == y && x == z) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	//Print a diagonal with a particular character and points between spaces
	static void diagonal(int value, String caracter){
		int i;
		for(i=1; i<=value; i++)
		{
			if (i==0) {
				System.out.print(caracter);
				//System.out.println();
			}
			for (int k = 1; k < i; k++) {
				System.out.print(".");
				
			}System.out.print(caracter);
			System.out.println();	 

		}
	}

	//Invests the greater number with the minor
	static void interchangeGreaterMinor(int[] number) {

		int aux = number.length;
		int greater = 0;
		int minor = 1000;
		int temp1 = 0, posi = 0;

		for (int i = 0; i < aux; i++) {

			if(greater < number[i] ) {

				greater = number[i];
				temp1 = i;
				System.out.println("the greater is: " + greater);

			}

			if(minor > number[i] ) {

				minor = number[i];
				posi = i;
				System.out.println("the minor is: " + minor);

			}

		}
		int auz = number[posi];
		number[posi] = number[temp1];
		number[temp1] = auz;


	}
	
	//Print by exchanging between stars and crosses
	static void interchange(int[] arrValues) {
		boolean centinela = false;
		
		for (int i = 0; i < arrValues.length; i++) {
			int star = arrValues[i];

			if(!centinela){	
				for (int j = 0; j < star; j++) {
					System.out.print("*");					
				}
				centinela = true;
			}else{			
				for (int j =0 ; j < star; j++) {
					System.out.print("+");						
				}
				centinela = false;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trio trio = new Trio(5,4,2);
		System.out.println("the method inOrder returns:" + trio.inOrder());
		System.out.println("the method theSame returns:" + trio.theSame());
		System.out.println();
		
		System.out.println("\nDiagonal of the character 'l'");
		diagonal(5, "l");
		System.out.println();
		
		int [] numbers= {5,3,0,2,6,1,7};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
		interchangeGreaterMinor(numbers);
		
		System.out.println("\nThe new array order");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		
		System.out.println("\n\nexchange between stars and crosses");
		interchange(numbers);

	}

}
