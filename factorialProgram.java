import java.util.Scanner;

public class factorialProgram {
    public static void main(String[] args) {

        // lets check factorial of number

        // 4 ->1,2,4
        // 5 ->1,5
        // 6=>1,2,3,6

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to see the factorial of the program");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.println(i + " " + "is factorial of the" + " " + Number);
            }
        }
    }
}
