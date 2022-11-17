public class PrimeNumber {
    public static void main(String[] args) {
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
        int num = 100;
        int prime = 100 ;
        for (int j = 1; j <= prime; j++) {
            if (prime % j == 0) {
                prime++;
            }
        }
        if (prime == 2) {

            System.out.println("prime number" + prime);
        }
    }
}

