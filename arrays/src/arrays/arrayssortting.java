package arrays;

import java.util.Arrays;

public class arrayssortting{
public static void main(String[] args) {
	
	int a[]= {1,9,3,7,5}; //assending desending
	System.out.print(a[0]);
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	System.out.println(a[4]);
	
	
	
	int b = a.length;   //5   last index=4
	
	Arrays.sort(a);  //assending //staticmethod
	System.out.print(a[0]);
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	System.out.println(a[4]);
	
    int lastindex =a.length-1;
	for(int i=0; i<=lastindex;i++) {  //assending
		System.out.println(a[i]);
	}
	System.out.println("_______");
	
	for(int j=lastindex;j>=0;j--) {  //desending
		System.out.println(a[j]);
	}
}
}
