//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EulerNine {
	public static void main(String[] args) {
		findPythagTripletProduct();
	}

	private static void findPythagTripletProduct() {
		boolean run = true;
		NumberFormat formatter = new DecimalFormat("###.#####");
		for (int b = 2; run; b++) {
			for (int a = 1; a < b; a++) {
				double rightSide = (a * a) + (b * b);
				double c = (Math.sqrt(rightSide));
				if (c % 1 == 0 && b < c) {
					// if the square root of the calculated right side is a
					// whole number (dividing by 1 gets a remained of zero) and
					// is > b, then we have a Pythagorean triplet
					if (a + b + c == 1000) {
						System.out.println("The product of " + a + ", " + b
								+ ", and " + c + " is: "
								+ formatter.format(a * b * c) + ".");
						run = false;
					}
				}
			}
		}
	}
}
// Output:
// The product of 200, 375, and 425.0 is: 31875000.