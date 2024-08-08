//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = new String(" a ");

        int len = 0;
        for (int i = s.length()-1; i>=0 ; i--) {

            if(len>=1)
                if(s.charAt(i)==' ') {
                    System.out.println(len);
                    break;
                }
            if(s.charAt(i)!=' ')
                len++;

        }

    }
}
