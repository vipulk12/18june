package pack5;

public class class13 {
	private void m13() { // the scope of private is limited to it class itself
		int a = 10;
		System.out.println("5 class13 protected" + a);
	}

	private int m14(int x) { // the scope of private is limited to it class itself
		int y = 11;
		System.out.println("pack5 class13 protected" + y);
		return y;
	}

	private static int m15() { // the scope of private is limited to it class itself
		int c = 12;
		System.out.println("pack5 class13 protected" + c);
		return c;
	}

	void m16() { // default access specifier=>it has it's scope throughout the package
		System.out.println("pack5 class13 default");

	}

	int m17(int a) { // default access specifier=>it has it's scope throughout the package
		int d = 13;
		System.out.println("pack5 class13 default" + d);
		return d;
	}

	static int m18() { // default access specifier=>it has it's scope throughout the package
		int e = 14;
		System.out.println("pack5 class13 default" + e);
		return e;
	}

	protected void m19() { // protected has it's scope in it's package but it can also extends
							// to other packages as well by using inheritance
		System.out.println("pack5 class13 protected");
	}

	protected int m20() { // protected has it's scope in it's package but it can also extends
		   int f=15;                   // to other packages as well by using inheritance
		System.out.println("pack5 class13 protected"+f);
		return f;
	}

	protected static int m21() { // protected has it's scope in it's package but it can also extends
		 int g=16;                      // to other packages as well by using inheritance
		System.out.println("pack5 class13 protected"+g);
		 return g;
	}

	public void m22() { // public has it's scope in overall project
		System.out.println("pack5 class13 public");
	}

	public int m23() { // public has it's scope in overall project
		int h=17;
		System.out.println("pack5 class13 public"+h);
		return h;
	}

	public static int m24() { // public has it's scope in overall project
		int i=18;
		System.out.println("pack5 class13 public"+i);
		return i;
	}
}
