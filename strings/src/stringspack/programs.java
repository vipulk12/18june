package stringspack;

public class programs {
	public static void main(String[] args) {

		String name = "This  is velocity class";
		System.out.println("string is = " + name);
		String Rev = "";
		// 1) Reverse the string

		for (int i = name.length() - 1; i >= 0; i--) {
			// System.out.print(name.charAt(i));
			Rev = Rev + name.charAt(i);

		}
		System.out.println("Reverse string is = " + Rev);

		// 2) string is palindrom or not

		if (name.equals(Rev)) {
			System.out.println("Resilt = String is palindrom");
		} else {
			System.out.println("Result = String is not palindrom");
		}
		// 3) Reverse word from string
		System.out.println();
		System.out.println("string is = " + name);
		String a[] = name.split(" ");

		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// 4) Convert string into int
		String str = "1234";
		System.out.println(Integer.valueOf(str));
		int converted = Integer.valueOf(str);
		System.out.println(converted + 4);

		// 5) Count number of words in string
		System.out.println("");
		System.out.println("string = " + name);
		int count = 1;
		for (int i = 0; i <= name.length() - 1; i++) {
			if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Numbers of words in string:- " + count);

		// 6) reverse the words of string at their locations
		System.out.println();

		System.out.println("Our orignal string = " + name);
		String[] words = name.split(" ");
		String revstring = "";
		for (String w : words) {
			String revword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revword = revword + w.charAt(i);
			}
			revstring = revstring + revword + " ";
		}
		System.out.println("Result = " + revstring);

		// 7) remove or replace character from string
		System.out.println();
		String str7 = "vipul khadse";
		System.out.println(str7.replace(" ", ""));
		System.out.println(str7.replaceAll("", " "));

		// 8) find max occurring char in string

	}

}
