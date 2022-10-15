package arrays;

public class array {
	public static void main(String[] args) {
		double a[] = { 45.5, 65.5, 66.2, 88.2, 80.8 };
		int lenght = a.length;
		int lastindex = a.length - 1;
		double check = 66;
		System.out.println("lenght of the array is=" + lenght);
		for (int b = lastindex; b >= 0; b--) {
			if (a[b] == check) {
				System.out.println(check + " is present");
			}

		}

	}

}
