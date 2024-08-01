class Solution {
    public void rotate(int[] nums, int k) {
        // if(k<0)
        //     return ;
        // else{
        // int len = nums.length-1;
        // int x=0;

        // while(k!=0){
        //     int temp = nums[len];

        //     for(int i = len -1; i >= x; i--){
        //         nums[i+1] = nums[i];
        //     }
        //     nums[0] = temp;
        //     k-=1;
        // }

        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}