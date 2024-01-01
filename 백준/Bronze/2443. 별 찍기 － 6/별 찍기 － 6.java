import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 2 * N - 1; j++) {
                if ( i > j) {
                    System.out.print(" ");
                } else if (j >= i && j <= 2 * N - i) {
                    System.out.print("*");
                } else {

                }
            }
            System.out.println();
        }
    }
}
