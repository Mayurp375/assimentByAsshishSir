public class duplicateCharectorInString {
//
    static char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd' };

    public static void main(String[] args) {
        for (int j = 0; j < ch.length; j++) {
            for (int i = j + 1; i < ch.length; i++) {
                if (ch[j] == ch[i]) {
                    System.out.println(ch[i]);
                }
            }
        }
    }
}
