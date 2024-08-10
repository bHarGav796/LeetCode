class Solution {
    public int search(int[] nums, int target) {

        int index = nums.length/2, updated = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1])
            {
                index = i;
                updated = 1;
            }
        }

        if(target == nums[index])
            return index;


        if(updated == 1) {
            if (target < nums[0])
                for(int i = index; i < nums.length; i++){
                    if(target == nums[i])
                        return i;
                }
            else
                for(int i = 0; i < index; i++){
                    if(target == nums[i])
                        return i;
                }
        }
        else
        if(target > nums[index])
            for(int i = index; i < nums.length; i++){
                if(target == nums[i])
                    return i;
            }
        else
            for(int i = 0; i < index; i++){
                if(target == nums[i])
                    return i;
            }


        return -1;
    }
}