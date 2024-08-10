class Solution {
    public int search(int[] nums, int target) {

        int index = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1])
                index = i;
        }

        if(target == nums[index])
            return index;

        for(int i = index; i < nums.length; i++){
            if(target == nums[i])
                return i;
        }
        for(int i = 0; i < index; i++){
            if(target == nums[i])
                return i;
        }

        return -1;
    }
}