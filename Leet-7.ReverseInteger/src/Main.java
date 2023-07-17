
//7. Reverse a integer
public class Main {
    public static void main(String[] args) {
        int num = 120;
        int rem = 0;
        long ans = 0;

        while (num != 0) {
            rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        if(ans>Math.pow(2,31) || ans<Math.pow(-2,31))
            System.out.println(false);
        else System.out.println((int)ans);
    }
}


