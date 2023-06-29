package Pack1;

public class StaticMeth {
	static void m1() {
		int marks=90;
		System.out.println(marks);
	}
	public static void main(String[] args) {
		Operation op = new Operation();
		int c = op.add(1, 2, 3);
		System.out.println("Addition of 3 nums: " + c);
		op.sub();
		System.out.println(op.multiply(10, 20));
		m1();
	}

}
