package stringspack;

public class strngsplit {
	public static void main(String[] args) {
		String str =  "pimpri chinchwad";
		String[] str2= str.split(" ");
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		
		String str3 = "far from home";
		String[] str4= str3.split("f");
		System.out.println(str4[0]);
		System.out.println(str4[1]);
		System.out.println(str4[2]);
		
		String[] str5 = str3.split(" ");
		System.out.println(str5[0]);
		System.out.println(str5[1]);
		System.out.println(str5[2]);
	}

}
