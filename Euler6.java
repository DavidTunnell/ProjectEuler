//The sum of the squares of the first ten natural numbers is,
//
//1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is,
//
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EulerSix {
	public static void main(String[] args) {
		findDifference(100);
	}

	private static void findDifference(int firstNumbers) {
		double sumOfSquares = 0, squareOfSum = 0;
		for (int i = 1; i <= firstNumbers; i++) {
			sumOfSquares += Math.pow(i, 2);
			squareOfSum += i;
		}
		squareOfSum = Math.pow(squareOfSum, 2);
		NumberFormat formatter = new DecimalFormat("###.#####");
		System.out.print(formatter.format(squareOfSum - sumOfSquares));
	}
}
// Output:
// 25164150
//
// Made into a method where you can pass any value and receive the difference
// between sums of the squares. Also used formatting to output answer out of
// scientific notation.