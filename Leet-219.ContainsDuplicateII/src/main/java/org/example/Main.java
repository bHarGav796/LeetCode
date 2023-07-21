package org.example;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        int num[] = {1,2,3,1,2,3};

        int l = num.length;
        HashMap<Integer,Integer>  map = new HashMap<>();//using HashMap

        for(int i = 0; i < l; i++){
            if (map.containsValue(num[i]))
                System.out.println(entry.getValue());
            map.put(i,num[i]);
        }




    }
}