import java.util.Scanner;

public class substring {
    static Scanner sc;
    public static int count = 0;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        substring sub = new substring();
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sub.permutation(str, "");
        System.out.println(count);
    }
    void permutation(String str, String prefix ){
        if(str.isEmpty()){
            System.out.println(prefix);
            count++;
        }
        else{
            for(int i = 0; i < str.length(); i++) {
                 String rem = str.substring(0, i) +str.substring(i+1);
                 permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
