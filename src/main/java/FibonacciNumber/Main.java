/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FibonacciNumber;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.findNumberUsingRecurence(20));
        System.out.println(f.findNumberWithoutRecurence(20));
    }
}
