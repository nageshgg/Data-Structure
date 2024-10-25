import java.util.Scanner;
public class Fibonacci {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int number  = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.nth_fibonacci(number));
    }

    // the first digit in fibonacci series is 1
    int nth_fibonacci(int n) {
        if(n ==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return nth_fibonacci(n-1) + nth_fibonacci(n-2);
        }
    }
     
}
