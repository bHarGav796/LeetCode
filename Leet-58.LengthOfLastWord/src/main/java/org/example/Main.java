package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon   ";//given

        int l = s.length()-1, flag = 0, count = 0;
        for (int i = l; i >= 0; i--){
            if(s.charAt(i)==' ' && flag==1) break;
            if (s.charAt(i)!=' '){
                flag = 1;
                count++;
            }
        }
        System.out.println(count);
    }
}