package org.example;

public class Main {
    public static void main(String[] args) {
        //3. Check if number is palindrome
        int x= 8228; //given

        int ans = 0, temp = x;
        if(x<0)
            System.out.println(false);
        else
            while(temp>0){
                ans = (ans * 10)+ temp % 10;
                temp/=10;
            }
        System.out.println(ans==x);
    }
}