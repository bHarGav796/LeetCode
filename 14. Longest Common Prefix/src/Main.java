import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        StringBuilder ans = new StringBuilder();

        int first = strs[0].length();

        for (int i = 0; i < first; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                ans.append(strs[0].charAt(i));
            } else break;
        }
        return ans.toString();
    }
}