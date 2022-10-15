package arrays;

import java.util.Arrays;

public class leastnumberinarray {
	public static void main(String[] args) {
		int a[] = { 4, 6, 8, 1, 9, 2, 3, 7, 5 };
		
		Arrays.sort(a);
		
		int lastindex = a.length - 1;
		for (int i = 0; i <= lastindex; i++) {
			//System.out.println(a[i]);
		}
		System.out.println("----------");
		System.out.println("smallest number in array="+a[0]);
	}
}
