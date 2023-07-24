package org.example;

import java.util.ArrayList;

//apply list
public class Main {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0}, nums2[] = {2, 5, 6};
        int m = 3, n = 3; //given

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            list.add(nums2[j]);
        }

        int[] nums3 = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        System.arraycopy(nums3, 0, nums1, 0, nums3.length - 1);
        for (int itr : nums1) {
            System.out.println(nums1[itr]);
        }

/*src denotes the source array.
srcPos is the index from which copying starts.
dest denotes the destination array
destPos is the index from which the copied elements are placed in the destination array.
length is the length of the subarray to be copied.*/
    }
}

