package Prct1;

public class Day2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number for Prime: ");
		int a = sc.nextInt();
		System.out.println(Prime(a));
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter Prime Range: ");
		int b = sc.nextInt();
		PrimeRange(b);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Sum of Prime: ");
		int c = sc.nextInt();
		SumOfPrime(c);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter num for perfectnum: ");
		int d = sc.nextInt();
		PerfectNum(d);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Perfect Range: ");
		int e = sc.nextInt();
		RangeOfPerfectNum(e);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Strong: ");
		int f = sc.nextInt();
		StrongNum(f);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Strong Range : ");
		int k = sc.nextInt();
		for(int i=1;i<=k;i++) {
			strongrange(i);
		}
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Factorial: ");
		int g = sc.nextInt();
		Factorial(g);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter Factorial Range: ");
		int h = sc.nextInt();
		for(int i=1;i<=h;i++) {
			FactRange(i);
		}
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Nevin : ");
		int i = sc.nextInt();
		NevinNum(i);
		System.out.println("xxxxxxxxxxxxxx");
		System.out.println("Enter number for Nevin Range : ");
		int j = sc.nextInt();
		for(int i1=1;i1<=j;i1++) {
			NevinRange(i1);
		}
		System.out.println("xxxxxxxxxxxxxx");
	}

	static boolean Prime(int a) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	static void PrimeRange(int a) {
		for (int i = 1; i < a; i++) {
			boolean prime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i + " ");
			}
		}
	}

	static void SumOfPrime(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	static void PerfectNum(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		if (sum == a) {
			System.out.println(a + " is Prefect Number");
		} else
			System.out.println(a + " is not a Prefect Number");
	}

	static void RangeOfPerfectNum(int a) {
		for (int i = 1; i <= a; i++) {
			int sum = 1;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

	static void Factorial(int a) {
		int fact = 1;
		for (int i = a; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	static void FactRange(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		System.out.println(a+"------>"+fact);
	}

	static void StrongNum(int a) {
		int temp=a;
		int sum=0;
		while(a>0) {
			int fact=1;
			int b=a%10;
			for(int i=1;i<=b;i++) {
				fact*=i;
				
			}
			sum+=fact;
			a/=10;
		}
		if(temp==sum) {
			System.out.println("Strong Number");
		}
		else System.out.println("Not a Strong Number");

	}
	
	static void NevinNum(int a) {
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		if(temp%sum==0) {
			System.out.println("Nevin");
		}
	}
	
	static void NevinRange(int a) {
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		if(temp%sum==0) {
			System.out.println(temp);
		}
	}
	
	static void strongrange(int a) {
		int temp=a;
		int sum=0;
		while(a!=0) {
			int fact=1;
			int b=a%10;
			for(int i=1;i<=b;i++) {
				fact*=i;
			}
			sum+=fact;
			a/=10;
		}
		if(sum==temp) {
			System.out.println(temp);
		}
	}

	}
