import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arrayLength = scanner.nextInt();
        int leftRotation = scanner.nextInt();

        int[] array = new int[arrayLength];
        int opr;
        for(int i=0; i<arrayLength; i++) {
            opr = i - leftRotation;
            array[opr>-1 ? opr : opr+arrayLength] = scanner.nextInt();
        }

        for(int i=0; i<arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }        
}
