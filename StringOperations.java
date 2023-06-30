package Pack1;

public class StringOperations {
	public static void main(String[] args) {
		String s = "Mani";
		String s1 = "Karthi";
		// toUpperCase
		System.out.println("toUpperCase : " + s.toUpperCase());

		// toLowerCase
		System.out.println("toLowerCase : " + s1.toLowerCase());

		// Concat
		System.out.println("concat : " + s.concat(" Karthi"));

		// ==
		System.out.println("== : " + s == s1);

		// equals()
		System.out.println("equals : " + s.equals(s1));

		// charAt
		System.out.println("charAt : " + s.charAt(2));

		// indexOf
		System.out.println("indexOf : " + s1.indexOf('K'));

		// contains
		System.out.println("contains : " + s.contains("M"));

		// replace
		System.out.println("replace : " + s.replace("Mani", "mANI"));

		// trim
		System.out.println("Trim : " + s.trim());

		// Split
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
		for (String str5 : arrStr) {
			System.out.print(str5 + " ");
		}
		String s3 = "";
		System.out.println("isBlank : " + s3.isBlank());
		System.out.println("isEmpty : " + s3.isEmpty());
		System.out.println("Length : " + s3.length());

	}

}
