public class smallestNumber {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 43, 2}; //array with random numbers

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            //prints the smalest element of the array

        }
        System.out.println("smallest numbe is " + array[0]);
    }
}
