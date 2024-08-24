package org.example;


public class Main {
    public static void main(String[] args) {

        int[] height = {2,3,4,5,18,17,6};

        //1. Brute-force
//        int upto = height.length -1, temp_ans = 0, result = 0;
//
//            for (int start = 0; start< upto; start++ ) {
//                for(int end = upto; end>0; end--){
//
//                    temp_ans = Math.min(height[start], height[end]) * (end - start); // value = lowest height - (diff between the index)
//                    if(temp_ans > result)
//                        result = temp_ans;
//
//                    }
//            }
//        System.out.println(result);

        // 2. Efficient Solution
        int start = 0, end = height.length -1, temp_ans = 0, result = 0;

        while (start < end) {
            temp_ans = Math.min(height[start], height[end]) * (end - start);
            if (temp_ans > result)
                result = temp_ans;
            if (height[start] < height[end])
                start++;
            else end--;
        }
    System.out.println(result);
    }
}