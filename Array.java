package Pack1;

public class Array {
	public static void main(String[] args) {
		// Single dimensional Array
		int[] a = { 2, 5, 4 };
		for (int i = 0; i < a.length; i++) {
			// System.out.print(a[i]);
		}
		// Multidimensional Array
		int a1[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		//System.out.println(a1[0][0]);
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j <= a1.length - 1; j++) {
				System.out.println(a1[i][j]);
			}
		}
		// For loop
		for (int i = 10; i >= 0; i--) {
			// System.out.println(i);
		}
		// While loop
		int k = 0;
		while (k <= 10) {
			// System.out.println(k);
			k++;
		}
	}

}
