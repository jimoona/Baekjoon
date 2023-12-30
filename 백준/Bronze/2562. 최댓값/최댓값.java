import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            } else {
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}