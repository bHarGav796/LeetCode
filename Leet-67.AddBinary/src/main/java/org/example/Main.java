package org.example;

public class Main {
    public static void main(String[] args) {
        String a = "11", b = "1";

        int num_a = Integer.parseInt(a,2);
        int num_b = Integer.parseInt(b,2);
        System.out.println(Integer.toBinaryString(num_a+num_b));



    }

}