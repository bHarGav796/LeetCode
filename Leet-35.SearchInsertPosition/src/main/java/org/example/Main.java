package org.example;


public class Main {
    public static void main(String[] args) {

            int nums [] = {1,3,5,6}, target=5;

                int start = 0;
                int end = nums.length-1;

                while (start <= end) {
                    int mid = start + (end-start)/2;
                    if (nums[mid] == target) {
                        System.out.println(mid);
                        return;
                    }
                    else if (nums[mid] > target) end = mid-1;
                    else start = mid+1;
                }

            System.out.println(start);
    }
}