package pack4;

public class class11 {
	private void m1() { // the scope of private is limited to it class itself
		int a = 10;
		System.out.println("pack4 class11 protected" + a);
	}

	private int m2(int x) { // the scope of private is limited to it class itself
		int y = 11;
		System.out.println("pack4 class11 protected" + y);
		return y;
	}

	private static int m3() { // the scope of private is limited to it class itself
		int c = 12;
		System.out.println("pack4 class11 protected" + c);
		return c;
	}

	void m4() { // default access specifier=>it has it's scope throughout the package
		System.out.println("pack4 class11 default");

	}

	int m5(int a) { // default access specifier=>it has it's scope throughout the package
		int d = 13;
		System.out.println("pack4 class11 default" + d);
		return d;
	}

	static int m6() { // default access specifier=>it has it's scope throughout the package
		int e = 14;
		System.out.println("pack4 class11 default" + e);
		return e;
	}

	protected void m7() { // protected has it's scope in it's package but it can also extends
							// to other packages as well by using inheritance
		System.out.println("pack4 class11 protected");
	}

	protected int m8() { // protected has it's scope in it's package but it can also extends
		   int f=15;                   // to other packages as well by using inheritance
		System.out.println("pack4 class11 protected"+f);
		return f;
	}

	protected static int m9() { // protected has it's scope in it's package but it can also extends
		 int g=16;                      // to other packages as well by using inheritance
		System.out.println("pack4 class11 protected"+g);
		 return g;
	}

	public void m10() { // public has it's scope in overall project
		System.out.println("pack4 class11 public");
	}

	public int m11() { // public has it's scope in overall project
		int h=17;
		System.out.println("pack4 class11 public"+h);
		return h;
	}

	public static int m12() { // public has it's scope in overall project
		int i=18;
		System.out.println("pack4 class11 public"+i);
		return i;
	}

}
