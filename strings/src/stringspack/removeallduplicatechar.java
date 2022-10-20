package stringspack;

public class removeallduplicatechar {
public static void main(String[] args) {
	System.out.println("String after removing all duplicate char =");
}
public static String removeduplicates(String str) {
	
	String allduplicate ="";
	
	for(int i=0;i< str.length();i++) {
		char ch = str.charAt(i);
		if(allduplicate.indexOf(ch)== -1) {
			allduplicate = allduplicate + ch;
		}
	}
	return allduplicate;
	
	
}
}
