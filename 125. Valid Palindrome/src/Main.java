public class Main {
    public static void main(String[] args) {
        String s = "0P";

        StringBuilder sNew = new StringBuilder(s.toLowerCase());

        for(int i = sNew.length()-1 ; i > -1; i--) {
            if((sNew.charAt(i) < 'a' || sNew.charAt(i) > 'z') && (sNew.charAt(i)< '0' || sNew.charAt(i)>'9')) {
                sNew.deleteCharAt(i);
            }
        }

        String sNewReversed = new StringBuilder(sNew).reverse().toString();

        System.out.println(sNew.toString().equals(sNewReversed));

    }
}