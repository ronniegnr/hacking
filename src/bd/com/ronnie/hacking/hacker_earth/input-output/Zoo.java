import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int i;
        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'z') {
                break;
            }
        }

        if (i * 2  == (input.length() - i)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}