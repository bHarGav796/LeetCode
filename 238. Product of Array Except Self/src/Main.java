public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4};


        int len = nums.length;
        int[] result = new int [len];
        int product = 1; //initial value
        int flag = 0; //if 0 is found or not

        //Calculating Result
        for(int i = 0; i < len; i++){
            if(nums[i] != 0)
                product *= nums[i];
            else flag++;
        }

        //New array values calculating
        for(int i = 0; i < len; i++){
            if(flag == 0 && nums[i] != 0) //if no 0 present and nums[i] is not equal to 0
                result[i] = product/nums[i];
            else if(nums[i] == 0 && flag == 1)
                    result[i] = product;
                else result[i] = 0;
        }

        //Display . . .
        for(int i = 0; i < len; i++){
            System.out.print(result[i] + " ");
        }

    }
}