public class Main{
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5};
        int k =3;

        int len = nums.length-1;
        int x=0;

        while(k!=0){
            int temp = nums[len];

            for(int i = len -1; i >= x; i--){
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k-=1;
        }
        //for printing
        for(int j = 0; j<= (nums.length-1) ; j++){
            System.out.print(nums[j] + " ");
        }
        return;
    }
}