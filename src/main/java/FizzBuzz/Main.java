package FizzBuzz;

public class Main {

    public static void main(String[] args) {
        checkIfFizzBuzz(-7);
    }
 /**
 * If given number is dividable by 3 then method should print Fizz, if the number is
 * dividable by 5 method should print Buzz, if number is dividable by 3 and 5, should print FizzBuzz.
 * If this requirements are not satisfied method should print value of given number
 *
 * @param i represents the number to be checked 
 */
    private static void checkIfFizzBuzz(int i) {

        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
