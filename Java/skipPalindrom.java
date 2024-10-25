import java.util.Scanner;
public class skipPalindrom {

    static Scanner sc;
    static int allowedSkip = 1;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

//        System.out.println("Enter a String: ");
//        String str = sc.nextLine();
        skipPalindrom sp = new skipPalindrom();
        String[] astr ={"abcdedcba","aaaan", "aaaana","all", "sagapr", "sagrr", "abbad", "rsaras"};

        for(int i = 0; i < astr.length; i++) {
            System.out.println(astr[i]);
            System.out.println(sp.checkPalindrom(astr[i], allowedSkip));
        }
    }

    boolean checkPalindrom(String str, int allowedSkip){
       int last = str.length()-1;
       int temp = last;

       for(int i = 0; i < temp/2; i++, last--){
           if (str.charAt(i) == str.charAt(last)) {
               continue;
           }
           else if (allowedSkip > 0 && str.charAt(i+1) == str.charAt(last)) {
               i++;
               allowedSkip--;
           }
           else if (allowedSkip > 0 && str.charAt(i) == str.charAt(last-1)) {
               last--;
               allowedSkip--;
           }else{
               return false;
           }
       }
       return true ;
    }
}
