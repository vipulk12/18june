package stringspack;

public class strings2reverse {
	public static void main(String[] args) {
		String str = "mumbai";
		String str2 = ""; // 1=""+i
							// 2=ia
							// 3,4,5,6= iabmum

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
			System.out.println(str2);
		}
		System.out.println(str2);
	}
}
