package stringspack;

public class palindromeNum {
public static void main(String[] args) {
	int num=121;
	int rev=0;
	int remainder;
	int temporary;
	temporary=num;
	
	while(num > 0) {
		remainder=num%10;        // 1   //2   //1                        //1     //2    //3    //2     //1
		rev=(rev*10)+remainder;  // 1   //12  //121                       //1     //12   //123  //1232  //12321
		num=num/10;              // 12  //1   //0                         //1232  //123  //12   //1     //0
	}
	if (temporary==rev)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
}
}
