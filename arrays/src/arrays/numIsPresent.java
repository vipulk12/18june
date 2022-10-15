package arrays;

public class numIsPresent {
public static void main(String[] args) {
	float[]arr= {44.5f,52.8f,11.3f,42.6f,80.6f};
	float check = 11.3f;
	boolean isInArray=false;
	
	for(Float f:arr) {
		if (f==check) {
			isInArray=true;
			break;
		}
	}
	if (isInArray) {
		System.out.println(check+" is present in Array");
	}else {
		System.out.println(check+" is not present in Array");
	}
}
}
