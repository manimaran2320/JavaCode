package Pack1;

public class Clone {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 } };
		int clonea[][] = a.clone();
		System.out.println(a == clonea);
		System.out.println(a[0] == clonea[0]);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(a[i][j]);
			}
		}

		// Shallow Copy

		for (int i = 0; i < clonea.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(clonea[i][j]);
			}
		}
	}

}
