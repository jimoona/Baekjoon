import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];
        int max = 1;
        int min = 2147483647;

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int j = 0; j < N; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            } else {

            }
        }

        for (int k = 0; k < N; k++) {
            if (numbers[k] < min) {
                min = numbers[k];
            } else {

            }
        }
        int result = max * min;
        System.out.println(result);
    }
}
