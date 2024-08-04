class Solution {
    public int removeDuplicates(int[] nums) {
        int itr = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[itr] != nums[i]){
                itr++;
                nums[itr] = nums[i];
            }
        }
        return itr+1;
    }
}