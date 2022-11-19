public class reverseOfString {
    public static void main(String[] args) {
        String name = "mayur";

//first method
        String name2 = "";
        char ch;

        System.out.println("real string is:"+name);
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i); //extracts each character
            name2 = ch + name2; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + name2);


        //second method

        StringBuilder name1 = new StringBuilder();

        // append a string into StringBuilder input1
        name1.append(name);

        // reverse StringBuilder input1
        name1.reverse();

        System.out.println("secod method-------");
        // print reversed String
        System.out.println(name1);

    }
}
