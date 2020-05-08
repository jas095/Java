import java.util.Scanner;

/*
 * Investigate on the Internet about sorting algorithms. 
 * Select four of them and use them in implementing the program below.
 * 
 * Design a program have two arrangements one with the names of 10 people and another with the ages corresponding to 10 people.
 * The program will first ask the user if they want to sort the list by age (ascending) or by name (alphabetical).
 * 
 * Then the program will ask what sorting algorithm you want to use (of the four that you selected) to sort the lists. 
 * After this the program will print the information in two columns. The names will appear in the left column and 
 * the ages corresponding to each of the names will appear in the right column.
 * 
 * The data must appear organized in order of age or names as indicated by the user. 
 *
 *
 **/


public class Sorting_algorithms<T extends Comparable<T>>  {
	
	
	//Start of the InsertionSort algorithm 
	    public static <T extends Comparable<T>> void InsertionSort(T[] array) {
	        for (int i = 1; i < array.length; i++) {
	            T item = array[i];
	            int indexHole = i;
	            while (indexHole > 0 && array[indexHole - 1].compareTo(item) > 0) {
	                array[indexHole] = array[--indexHole];
	            }
	            array[indexHole] = item;
	        }
	    }
	
	
	
	//Start of the Quicksort algorithm
	    public static <T extends Comparable<T>> void Quicksort(T[] array) {
	    	Quicksort(array, 0, array.length - 1);
	    }

	    private static <T extends Comparable<T>> void Quicksort( T[] array, int left, int right) {
	        if (left < right) {
	            int pivot = partition(array, left, right);
	            Quicksort(array, left, pivot - 1);
	            Quicksort(array, pivot + 1, right);
	        }
	    }

	    
	    
   //Auxiliary Methods Needed to Help Execute the Algorithms
	    private static <T extends Comparable<T>> int partition( T[] array, int left, int right) {
	        T pivot = array[right];
	        int mid = left;
	        for (int i = mid; i < right; i++) {
	            if (array[i].compareTo(pivot) <= 0) {
	                swap(array, i, mid++);
	            }
	        }
	        swap(array, right, mid);
	        return mid;
	    }

	    private static <T extends Comparable<T>>  void swap( T[] array, int a, int b) {
	        if (a != b) {
	            T temp = array[a];
	            array[a] = array[b];
	            array[b] = temp;
	        }
	    }
	    
 
	    
	 // Start of the SelectionSort algorithm
	    public static void SelectionSort(int[] edades) {
	        for (int i = 0; i < edades.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < edades.length; j++) {
	                if (edades[j] < edades[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            if (minIndex != i) {
	                swap(edades, i, minIndex);
	            }
	        }
	    }
	    

		
	  //Start of the bubbleSort algorithm 
	    public static void bubbleSort(int[] array) {
	        int unsortedBelow = array.length;
	        while (unsortedBelow != 0) {
	            int lastSwap = 0;
	            for (int i = 1; i < unsortedBelow; i++) {
	                if (array[i - 1] > array[i]) {
	                    swap(array, i, i - 1);
	                    lastSwap = i;
	                }
	            }
	            unsortedBelow = lastSwap;
	        }
	    }
	    
	    
		private static void swap(int[] array, int i, int j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		} 
	  
	

		
	public static void main(String[] args) {
		
		int value , valor = 0;
		
		
		//Design a program have two arrangements one with the names of 10 people and another with the ages corresponding to 10 people.  
		
		String [] names = {"Andrea", "Rodrigo", "Miguel", "Mario", "Homero", "Ricardo", "Vicente","Carlos","Maria", "Daniela"};
		int []    ages =  {12, 		14, 		15, 	10, 		16, 	80, 		90, 	15, 		33, 	50 };
		String[] auxname = new String[names.length];
		int []    auxages = ages.clone();
		int aux,in = 0;
		
		System.out.println("Unordered items");
		for (int i = 0; i < ages.length; i++) {
			System.out.print(names[i]+" ");
			System.out.print(ages[i]+ " ");
			System.out.println(" ");
			
		}
		System.out.println(" \n\n");
		//Create an element of type scanner to get input from the command line
		Scanner input = new Scanner(System.in);
		System.out.println("Please select an option to order the items");
		System.out.println("Sort by age (ascending): 1");
		System.out.println("Sort by name (alphabetical): 2");
		value = input.nextInt();
		
		if(value == 1) {
			// Sort by age in an ascending way, that is, from lowest to highest 1,2,3,4,5 etc.
			// We use the Bubble method to order it before.
			bubbleSort(ages);
			System.out.println("\n Ordered elements");
			
			
			for (int i = 0; i < ages.length; i++) {
				System.out.print(names[i]+ " ");
				System.out.print(ages[i]+ " ");
				System.out.println(" ");
			}
			
			
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("\n\n Please enter the number or method of your choice");
			System.out.println("1. Insertion Sort \n" + 
					"2. Selection Sort \n" + 
					"3. Quicksort\n" + 
					"4. bubbleSort   ");
			valor = input2.nextInt();
			
			
			switch (valor) {
			case 1:
				InsertionSort(names);
				//InsertionSort(ages);
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				
				break;
			case 2:
				SelectionSort(ages);
				//SelectionSort(nombres);
				
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				break;
			case 3:
				Quicksort(names);
				//Quicksort(edades);
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				
				break;

			default:
				bubbleSort(ages);
				//bubbleSort(nombres);
				
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				break;
			}
			
			
			
		}else if(value == 2) {
			// Sort by names alphabetically, that is, it goes in order a, b, c, d, e etc.
			// We use the Bubble method to order it before.
			// bubbleSort (names); // Must be with this one.
			Quicksort(names);
			System.out.println("\n Ordered elements");
			
			
			for (int i = 0; i < ages.length; i++) {
				System.out.print(names[i]+ " ");
				System.out.print(ages[i]+ " ");
				System.out.println(" ");
			}
			
			
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("\n\n Please enter the number or method of your choice");
			System.out.println("1. Insertion Sort \n" + 
					"2. Selection Sort \n" + 
					"3. Quicksort\n" + 
					"4. bubbleSort   ");
			valor = input2.nextInt();
			
			
			switch (valor) {
			case 1:
				InsertionSort(names);
				//InsertionSort(ages);
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				
				break;
			case 2:
				SelectionSort(ages);
				//SelectionSort(names);
				
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				break;
			case 3:
				Quicksort(names);
				//Quicksort(ages);
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				
				break;

			default:
				bubbleSort(ages);
				//bubbleSort(names);
				
				System.out.println("\n Ordered elements");
				
				for (int i = 0; i < ages.length; i++) {
					System.out.print(names[i]+ " ");
					System.out.print(ages[i]+ " ");
					System.out.println(" ");
				}
				break;
			
			}
			
		}
		

	}

}
