package stringspack;

public class palindrom_number {
	public static void main(String[] args) {
		int number = 121;
		int reverse = 0;
		int orignal = number;

		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}

		System.out.println(reverse);

		if (orignal == reverse)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");

	}

}
