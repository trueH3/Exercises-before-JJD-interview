/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiplyWithoutMultiply;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(7, 3));
        System.out.println(multiply(0, 3));
        System.out.println(multiply(-2, 3));
        System.out.println(multiply(2, -3));
        System.out.println(multiply(-3, -3));

    }

    private static int multiply(int a, int b) {
        int product = 0;

        if (a > 0 && b > 0 || a < 0 && b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
            for (int i = 0; i < b; i++) {
                product += a;
            }
        } else if (a > 0 ^ b > 0) {
            a = Math.abs(a);
            b = Math.abs(b);
            for (int i = 0; i < b; i++) {
                product += a;
            }
            product = -product;
        }
        return product;
    }
}
