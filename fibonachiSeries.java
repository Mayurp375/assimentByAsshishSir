public class fibonachiSeries {
    public static void main(String[] args) {

        //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        int number = 10;
        int first= 0;
        int second = 1;
        for(int i = 0;i<=number;++i){
            int next = first+ second;
            first = second;
            second= next;
            System.out.println(next);

        }
    }
}