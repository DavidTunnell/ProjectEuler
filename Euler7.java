// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?
public class EulerSeven {
	public static void main(String[] args) {
		nthPrime(10001);
	}

	private static void nthPrime(int nth) {
		// pass which prime you want to find
		int counter = 0;
		int i = 2;
		while (true) {
			if (primeCheck(i) == true) {
				counter += 1;
				if (counter == nth) {
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}

	static boolean primeCheck(int check) {
		// Reused from EulerThree =)
		for (int i = 2; i < check; i++) {
			if (check % i == 0) {
				return false;
			}
		}
		return true;
	}
}
// Output:
// 104743

// Methods used so the nth prime number can be calculated 