import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {

        // Method - 1 
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;
        int sum = 0;

        while(i>=0 || j>=0){
            sum = carry;
            if(i >= 0)
                sum += (a.charAt(i--) - '0');
            if(j >= 0)
                sum += (b.charAt(j--) - '0');

            result.append(sum%2);
            carry = sum/2;
        }

        if(carry != 0)
            result.append(carry);

        return result.reverse().toString();



        // Method - 2 

        // BigInteger s1 = new BigInteger(a, 2);
        // BigInteger s2 = new BigInteger(b, 2);

        // BigInteger sum = s1.add(s2);

        // return sum.toString(2);
    }
}
