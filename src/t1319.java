import java.util.Scanner;
public class t1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        int[][] a = new int[n][n];
        int cur = 0;

        for (int c = 0; c < n * 2 - 1; ++c) {
            for (int i = 0; i < n; ++i) {
                int j = c - i;

                if (0 <= j && j < n) {
                    a[i][n - 1 - j] = ++cur;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
