//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {-1};

        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for(int i = 0; i<nums.length; i++) {
            currentSum += nums[i];
            if(currentSum>maxSum)
                maxSum = currentSum;
            if(currentSum<0)
                currentSum = 0;
        }
        System.out.println(maxSum);
    }
}