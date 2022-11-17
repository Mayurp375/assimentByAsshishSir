import java.util.Scanner;

public class pallindromProgram {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to to check palindrome");
        // lets see the number is palindrome or not
        int r;
        int sum = 0;
        int temp;
        int n = sc.nextInt();// It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}
