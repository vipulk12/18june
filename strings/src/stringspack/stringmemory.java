package stringspack;

public class stringmemory {
	public static void main(String[] args) {

		String a1 = "google"; // 1 object is created here //String Constant Pool Area 
		String a5 = "google"; //0
		String a2 = "microsoft";// 1 //SCPA
		String a3 = "amazon";//1 //SCPA

		String a6 = new String("google"); // 2 objects are created here by using new keyword one stored in SCPA and
		                                  // one in heap memory.
		                                  //as google is already stored in SCPA it cannot override the storage.
		                                  // hence only one object is stored here thats in heap area only.
		String a4 = new String("facebook");// 2 objects //SCPA //heap
		String a7 = new String("amazon"); //1  // HEAP
		String a8 = new String("google"); //1   //heap
		String a9 = new String("microsoft");//1  //heap
		
		// when u create a string by using new keyword.. then atleast one object is stored.
		// when u create a string without new keyword .. the one object is stored in SCPA, but if that object is already
		// stored in SCPA the it stores 0 object
		
		
		
		
		
		
		
		
		
		
		
		
	}
}