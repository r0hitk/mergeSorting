package mergeSorting;

import java.util.Scanner;

public class Executor {

	static int array[];
	
	public static void main(String[] args) {

		System.out.println("Enter the size of array to sort:");

		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();

		array = new int[arraySize];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		MergeSort.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		scan.close();

	}

}
