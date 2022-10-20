package arrays;

import java.util.Arrays;

public class programs {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 4, 9, 7, 3 };

		// Reverse The Array
		System.out.print("Reverse array = ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(+arr[i] + " ");
		}
		System.out.println();
		// print Array in ascending order
		System.out.print("Ascending order array = ");
		Arrays.sort(arr);
		for (int a : arr) {
			System.out.print(+a + " ");

		}

		// find lemgth of array
		System.out.println();
		int L = arr.length;
		System.out.println("Length of array = " + L);

		// sum of all numbers in array

		int sum = 0;

		for (int temp : arr) {

			sum = sum + temp;
		}
		System.out.println("Total sum of all numbers in array are = " + sum);

		// Find the max number in array
		int max = Integer.MIN_VALUE;

		for (int e : arr) {
			if (e > max) {
				max = e;
			}
		}
		System.out.println("Max number in array is = " + max);

		// find min number in array

		int min = Integer.MAX_VALUE;

		for (int c : arr) {
			if (c < min) {
				min = c;
			}

		}
		System.out.println("Min number in array is "+min);

	}


}
