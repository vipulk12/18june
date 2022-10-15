package pack3;
import pack2.class1;
public class pack3main {
	public static void main(String[] args) {
		class1 obj1= new class1();
		obj1.m2(); // only m2 of class1-pack2 can be called because its scope is throughout the project
	}

}
