package Pack1;

public class Unary {
	public static void main(String[] args) {
		int x=20;
		int y=++x*10/x++ + ++x;
		System.out.println(y);
		int a=100;
		System.out.println(~a);
		System.out.println(a);
	}

}
