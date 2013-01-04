//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91*99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class EulerFour {
	public static void main(String[] args) {
		int n1 = 100;
		int n2;
		int product;
		int palindrome = 0;
		while (n1 < 1000) {
			n2 = n1;
			while (n2 < 1000) {
				product = n1 * n2;
				char[] charArray = String.valueOf(product).toCharArray();

				if (charArray[0] == charArray[charArray.length - 1]) {
					if (charArray[1] == charArray[charArray.length - 2]) {
						if (charArray[2] == charArray[charArray.length - 3]) {
							if (palindrome < product) {
								palindrome = product;
							}
						}
					}
				}
				n2++;
			}
			n1++;
		}
		System.out.println(palindrome);
	}
}
// Output: 906609