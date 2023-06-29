package Pack1;

public class Ternary {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 25, e=3, max, min;
		min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
				: ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
		max = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
				: ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
		System.out.println(max);
		System.out.println(min);

//		int f = (a < b) ? ((a < c) ? ((a < d) ?((a<e)? a : e) : ((c < e) ?((c<d)? c : e)
//				: ((b < c) ? ((b < d) ?((b < e)? b : e) : ((c < e) ?((c < d)? c : e):);

	}

}
