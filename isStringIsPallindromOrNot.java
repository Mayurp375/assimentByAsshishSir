public class isStringIsPallindromOrNot {
    public static void main(String[] args) {


        String str = "Radar", temp = ""; //string and temp

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {//fist decres then -1
            temp = temp + str.charAt(i);
        }

        if (str.toLowerCase().equals(temp.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
