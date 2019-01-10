package GreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        System.out.println(divisorUnoptimized(36, 12));
        System.out.println(divisorUnoptimized(36, 1));
        System.out.println(divisorUnoptimized(1, 7));
        System.out.println(divisorUnoptimizedWithRecurency(36, 12));
        System.out.println(divisorOptimized(36, 12));
        System.out.println(divisorOptimizedRecurency(48, 12));

    }

    /**
     * Method return greatest common divisor. This is unoptimized algorithm.
     * Used Euclid algorithm that says: 1.take greater number from the given and
     * substract smaller one. 2.assign result to the earlier, bigger one. 3.if
     * both numbers aren't equal repeat .1, if they are then the answer is that value.
     *
     * @param a represents first number to be checked
     * @param b represents second number to be checked
     */
    private static int divisorUnoptimized(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int divisorUnoptimizedWithRecurency(int a, int b) {
        while (a != b) {
            return divisorUnoptimizedWithRecurency(a > b ? a - b : a, b > a ? b - a : b);
        }
        return a;
    }

     /**
     * Method return greatest common divisor. This is optimized algorithm.
     * Used Euclid algorithm that says: 
     * 1.take second number from the given and divide it by first number 
     * 2.assign remainder to the second number and assign to first number second number before the division.
     * 3.If second number isn't equal to 0 then repeat, if it is then the answer is the first number 
     *
     * @param a represents first number to be checked
     * @param b represents second number to be checked
     */
    
    private static int divisorOptimized(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static int divisorOptimizedRecurency(int a, int b){
    while (b !=0){
        divisorOptimizedRecurency(b, a%b);
    }
        return a;
        
    }
}
