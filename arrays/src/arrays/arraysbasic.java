package arrays;

public class arraysbasic {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5};//declaration+initialization
	int []b= {1,2,3,4,5};
	
	System.out.println(a[0]);
	System.out.println(b[2]);
	System.out.println(a[3]);
	System.out.println(a[2]);
	System.out.println(b[4]);
	System.out.println();
	
	int c[]= new int [4]; //declaration and size=4(4 values can be stored)
	int []d= new int [2];//size=2 
	
	c[0]=22; //here 0 is index of array
	c[1]=3;
	c[2]=44;
	c[3]=1;
	/*c[4]=33;     exception--index out of bounds
	c[5]=54;  */// as the size of c array is 4 it won't accept 4th index

	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c[2]);
	System.out.println(c[3]);
	
	
    d[0]=37;
    d[1]=21;
    System.out.println(d[0]);
    System.out.println(d[1]);
    
    int q,r[];//array= r
    int [] h,i,j,k;
    int m,n[]; // n=array
    int s[],t; // s= array and t=variable;

}	

}
