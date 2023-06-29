package Pack1;

public class Array2 {
	public static void main(String[] args) {
		int a[][] = { { 12, 14, 16 }, { 18, 20, 22 }, { 24, 26, 28 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println(a[i][j]);
			}
		}
		int[][] b = { { 30, 14, 16 }, { 20, 40, 60 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
