/**
 * Compute value of Fibonacci sequence for a given parameter.
 *
 * @param i represents the place in Fibonacci sequence in which we want to get
 * a value
 */
package FibonacciNumber;

public class Fibonacci {

    public long findNumberUsingRecurence(int i) {

        if (i == 1) {
            return 0;
        } else if (i == 2) {
            return 1;
        } else if (i > 2) {
            return findNumberUsingRecurence(i - 1) + findNumberUsingRecurence(i - 2);
        } else {
            throw new IllegalArgumentException("Parameter must be a positive number");
        }

    }

    public long findNumberWithoutRecurence(int i) {
        if (i == 1) {
            return 0;
        } else if (i == 2) {
            return 1;
        } else if (i > 2) {
            long[] array = new long[i];
            array[0] = 0;
            array[1] = 1;

            for (int j = 2; j < i; j++) {
                array[j] = array[j - 1] + array[j - 2];
            }
            return array[i - 1];
        } else {
            throw new IllegalArgumentException("Parameter must be a positive number");

        }
    }
}
