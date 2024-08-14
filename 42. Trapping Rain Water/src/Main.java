public class Main {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};

        int trappedWater = 0;
        int leftVal = 0;
        int rightVal = 0;

        int i = 0, j = height.length - 1;

        while (i <= j) {
            if (leftVal <= rightVal) {
                // Handle the left side
                if (height[i] > leftVal) {
                    leftVal = height[i];
                } else {
                    trappedWater += leftVal - height[i];
                }
                i++;
            } else {
                // Handle the right side
                if (height[j] > rightVal) {
                    rightVal = height[j];
                } else {
                    trappedWater += rightVal - height[j];
                }
                j--;
            }
        }

        System.out.println(trappedWater); // Expected output: 6
    }
}
