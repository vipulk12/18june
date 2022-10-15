package pack1;

public class mainmethod {
	public static void main(String[] args) {
		
	
	class1 obj1=new class1();
	obj1.m1();             //here all the access specifier method i.e.,(default,public,protected)
	obj1.m2();             //of class1 except private is called(because private has it's scope in 
	obj1.m3();             //its class itself)
	

    class2 obj2=new class2();
    obj2.m1();             //here all the access specifier method i.e.,(default,public,protected)
    obj2.m2();             //of class2 except private is called(because private has it's scope in 
    obj2.m3();             //its class itself)
}}
