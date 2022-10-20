package stringspack;

public class stringmethods {
	public static void main(String[] args) {

		String a1 = "google";
		String a2 = new String("google");
		String a3 = new String("AMAZON");
		String a4 = "microsoft";
		String a5 = new String ("amazon");
		String a6 = "";
		
		System.out.println(a1.equals(a2));  //true
		
		System.out.println(a4.charAt(5));   // s
		System.out.println(a4.charAt(6));   // o
		System.out.println(a4.indexOf("o")); //4
		System.out.println(a4.indexOf("z"));  //-1
		
		System.out.println(a3.length());    // 6
		
		System.out.println(a3.concat(a1));  // Connects two strings
		System.out.println(a1.concat("home"));
		
		System.out.println(a3.equalsIgnoreCase(a5));  // compare string without cases // boolean
		
		System.out.println(a4.contains("ros"));  //find string character present or not //boolean
		
		System.out.println(a5.endsWith("zon"));  //true
		System.out.println(a5.endsWith("zo"));  //false
		
		System.out.println(a1.startsWith("go"));  //true
		
		System.out.println(a6.isEmpty()); //true
		System.out.println(a5.isEmpty()); //false
		
		System.out.println();
		System.out.println();
		
	}
}
