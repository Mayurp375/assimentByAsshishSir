import java.util.Scanner;

public class duplicateCharectorInString {
    //
    static char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd' };

    public static void main(String[] args) {
        duplicateCharectorInString obj = new duplicateCharectorInString();
        // obj.duplicateChar();       //duplicate Charector in String array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string name");
        String name = sc.nextLine();
        obj.duplicateCharectorString(name);
    }

    public void duplicateChar() {
        for (int j = 0; j < ch.length; j++) {
            for (int i = j + 1; i < ch.length; i++) {
                if (ch[j] == ch[i]) {
                    System.out.println(ch[i]);
                }
            }
        }
    }

    public static void duplicateCharectorString(String name) {

        for (int i = 0; i < name.charAt(i); i++) {
            for (int j = i + 1; j < name.charAt(j); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    System.out.println(name.charAt(j) + " " + "is the duplicate charector in string");
                } else {
                    System.out.println("no nublicate charector in string");
                }
            }
        }
    }

}
