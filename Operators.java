package Pack1;

public class Operators {
	public static void main(String[] args) {
		// Relational Operator
		int a = 30, b = 20;
		String s = "Hii";
		String s1 = "Hii";
		System.out.println("== : " + s == s1);

		// Bitwise Operator
		int c = 2, d = 3;
		System.out.println("& :" + (c & d));
		System.out.println("| :" + (c | d));
		System.out.println("^ :" + (c ^ d));
		System.out.println("~ :" + (~d));

		// Shift Operator
		int e = 4, f = e >> 3;
		System.out.println(">> : " + (f));
		//System.out.println("<< : " + g);

		// Ternary Operator
		int h = 2, i = 3;
		boolean j = h > i ? true : false;
		System.out.println(j);

		int a1 = 5, b1 = 3, c1 = 8;
		int s2 = (a1 < b1) ? (a1 < c1 ? a1 : c1) : (b1 < c1 ? b1 : c1);
		System.out.println(s2);

		int mark = 100;
		String s4 = mark > 50 ? "Pass" : "Fail";
		System.out.println(s4);

		// Assignment Operator
		int num1 = 10, num2 = 20;
		num1 += num2;
		System.out.println(num1);

	}

}
