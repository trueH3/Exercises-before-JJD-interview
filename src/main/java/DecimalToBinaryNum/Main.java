/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimalToBinaryNum;

public class Main {

    public static void main(String[] args) {
        compute(21);
        computeShort(21);
    }

    // this is longer way
    private static void compute(int i) {
        StringBuilder sb = new StringBuilder();

        if (i < 1) {
            System.out.println("Chosen number is less than 0");
        } else {
            while (i != 0) {
                sb.append(i%2);
                i = i/2;
            }
        }
        System.out.println(sb.reverse());
    }
    // shorter way
    private static void computeShort(int i) {
        System.out.println(Integer.toBinaryString(i));
    }
    

}
