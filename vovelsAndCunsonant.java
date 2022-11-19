import java.util.Scanner;

public class vovelsAndCunsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name:");
        String name = sc.next();//taking user input


        int vovels = 0;
        int consonant =0;
        int i = 0;
        do {
            char ch = name.charAt(i);
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vovels++;
            }else{
                consonant++;
            }
            i++;//i wass taken 1st incriment then error come
        } while (i <= name.length() - 1);
        System.out.println("this is count vovels:" + vovels
                +"this is count consonant:" + consonant);
    }

}
