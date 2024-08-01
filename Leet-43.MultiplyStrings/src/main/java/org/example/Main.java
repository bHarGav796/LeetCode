package org.example;

// Note:
// You must not use any built-in BigInteger library or convert the inputs to integer directly.

public class Main {
    public static void main(String[] args) {

        String num1 = "498828660196", num2 = "840477629533"; //Given

        long n1 = 0, n2 = 0;

        for (int i = 0; i <num1.length(); i++) {
            n1 = n1 *10 + (num1.charAt(i) - '0');
        }
        for (int j = 0; j <num2.length(); j++) {
            n2 = n2 *10 + (num2.charAt(j) - '0');
        }
        long product = n1 * n2; // Use long to handle large numbers
        System.out.println(product);
    }
}