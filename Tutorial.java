/*
Tutorial Program
Author: John Pepling

Description:
	This program aims to demonstrate simple code structure practices
	for people new to programming
*/

//--------------------------------------------------------------------
public class Tutorial{

	/*
	main

	Description:
		The main body of code that a computer will execute in
		the Java programming language.
	*/
	public static void main(String[] args){

		// Create variables
		int size = 10;						// Size of array x
		int sum = 0;							// sum
		int[] x = new int[size];	// array x with (size) elements

		/*
		places 0 in position 0, 1 in position 1, 2 in position 2, etc.
		up to 9 in position 9
		Sums the integers together
		*/
		for(int i=0;i<size;i++){
			x[i] = i;sum = sum + i;
		}

		// Prints the sum to the console
		System.out.println("Sum is "+sum+".");

	}

}
//--------------------------------------------------------------------
