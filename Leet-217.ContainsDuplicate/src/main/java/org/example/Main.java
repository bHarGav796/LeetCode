package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int nums [] = {1,2,3}; //given

        int l = nums.length;
        HashSet<Integer> set = new HashSet<>();//Using HashSet

        for(int i = 0; i < l; i++ ){
            if(set.add(nums[i])){

            }else{
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}