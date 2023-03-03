package bd.com.ronnie.hacking.algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{45, 6, 2, 46, 1, 333};
        int numbers_length = numbers.length;

        for (int i = 0; i < numbers_length; i++) {
            int minimum_index = i;
            for (int j = i+1; j < numbers_length; j++) {
                if(numbers[j] < numbers[i]) {
                    minimum_index = j;
                }
            }
            if (minimum_index != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minimum_index];
                numbers[minimum_index] = temp;
            }
        }

        for (int unsorted_number : numbers) {
            System.out.print(unsorted_number + " ");
        }

    }
}
