package Pack1;

class A {
	static int a = 10;
	static int b = 20;
}

public class Static {
	public static void main(String[] args) {
		int c = A.a += A.b;
		System.out.println(c);
	}
}
