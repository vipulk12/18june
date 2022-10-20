package stringspack;

public class reversestring1 {
	public static void main(String[] args) {
		String str = "tenet";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i)); //index values-43210
		}

	}
}
