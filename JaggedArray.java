package Pack1;

public class JaggedArray {
	public static void main(String[] args) {
		int a[][] = new int[5][];
		a[0] = new int[] { 1, 2, 3 };
		a[1] = new int[] { 1, 2, 3 };
		a[3] = new int[] { 1, 2, 3 };
		a[4] = new int[] { 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
