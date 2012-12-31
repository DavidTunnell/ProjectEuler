//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class EulerThree {
	
	public static void main(String[] args) {
		final Long NUMBER = 600851475143L;
		findLargestPrimeFactor(NUMBER);
	}

	private static void findLargestPrimeFactor(Long number) {
		for (int j = 3; j < number; j++) {
			if (primeCheck(j) == true) {
				if (number % j == 0) {
					System.out.println(j);
				}
			}
		}
	}
	
	static boolean primeCheck(int check) {
		for (int i = 2; i < check; i++) {
			if (check % i == 0) {
				return false;
			}
		}
		return true;
	}

}
// Output: 71
// 839
// 1471
// 6857