package pack1;

public class class1 {
	
	void m1() {                                       //default access specifier=>it has it's scope 
		System.out.println("pack1 class1 default");   //throughout the package
		
	}
    public void m2() {                                //public has it's scope in overall project
    	System.out.println("pack1 class1 public");
	}
    protected void m3() {                             //protected has it's scope in it's package but it
    	System.out.println("pack1 class1 protected"); //can also extends to other packages as well by
    }                                                 //using inheritance
    
    private void m4() {                               //the scope of private is limited to it class itself
    	System.out.println("pack1 class1 protected");
    }
}
// private
// default
// protected
// public