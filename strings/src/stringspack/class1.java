package stringspack;

public class class1 {
	public static void main(String[] args) {

		String a1 = "CLASS";   // upper case
		String a2 = "class";   // lower case
		String a3 = "CLASS";
		String a4 = "class";   // lower case
		String a5 = "CLASS";
		
		String a6 = new String("CLASS");    //upper case
		String a7 = new String("class");
		String a8 = new String("class");
		String a9 = new String("velocity");
		String a10 = new String("velocity");
		String a11 = new String("Velocity");  //upper case

		System.out.println(a1 == a3);//address,memory compare  //CLASS in both= data is same hence in "string static pool"
		System.out.println(a1.equals(a3));//data compare
		System.out.println(a6==a1);
		System.out.println(a9.equals(a10));
		System.out.println(a9==a10);
		System.out.println(a9.equals(a11));
		System.out.println(a5.equals(a6));

	}
}
// == operator compares address and memory location// if both same then true else false.
// .equals compares data
