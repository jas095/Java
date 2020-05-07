/*
 * This is an old-fashioned 
 * procedural version of an array.
 * Demonstrates Java arrays.
 * To run this program:
 * :$ java Array
 * 
 */

public class Array {

	public static void main(String[] args) {
	
			long[] arr; //Reference to Array
			arr = new long[100]; // make array
			int n = 0; //number of items
			int j; //loop counter
			long searchKey; //Key of item to search for
			
		//--------------------------------------------------------------
			arr[0] = 77; // insert 10 items
			arr[1] = 44; 
			arr[2] = 11;
			arr[3] = 22; 
			arr[4] = 55;
			arr[5] = 88; 
			arr[6] = 99;
			arr[7] = 66;
			arr[8] = 33;
			arr[9] = 00;
			n = 10; // There are ten items in array
		//--------------------------------------------------------------
			for ( j = 0; j < n; j++) { //display items
				System.out.print(arr[j] + " ");
			}
			System.out.println("");
		//--------------------------------------------------------------
			searchKey = 55; //find item with key 55
			for(j=0; j<n; j++) // for each element
				if(arr[j]== searchKey) // found item?
					break; //yes, exit before end
			if(j==n) // at the end?
				System.out.println("Sorry, we can't find " + searchKey); //Yes. It's not found.
			else
				System.out.println("We found " + searchKey); //No. It's found.
			
		//--------------------------------------------------------------
			searchKey = 11; //delete item with key 11
			for(j=0; j<n; j++) //look for it
				if(arr[j]== searchKey)
					break;
			for(int k=j; k<n-1; k++) //move higher ones down
				arr[k] = arr[k+1];
			n--;
			System.out.println("We deleted the elemnt " + searchKey);
		//--------------------------------------------------------------
			for (j=0; j<n; j++) //display items again
				System.out.print(arr[j] + " ");
			System.out.println("");
	} //end main()

} //end class Array
