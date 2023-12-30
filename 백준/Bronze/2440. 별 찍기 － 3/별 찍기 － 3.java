import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > 0; j--) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                }
            }
             System.out.println();
        }
    }
}