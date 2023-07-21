package org.example;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//1. Roman to Integer
    String s = "XI";

    s.replace("IV","IIII");
    s.replace("IX","VIIII");
    s.replace("XL","XXXX");
    s.replace("XC","LXXXX");
    s.replace("CD","CCCC");
    s.replace("CM","DCCCC");

    char itr;
    int ans = 0;

    HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        for(int i= 0; i<s.length(); i++){
            itr = s.charAt(i);  //get what character(key) is in the index
            ans += map.get(itr); //using the key get the value  //and add to the answer
        }
        System.out.println(ans);

    }
}