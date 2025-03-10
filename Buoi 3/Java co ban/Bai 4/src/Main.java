import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        int n = 0;
        while (ok) {
            n = sc.nextInt();
            if (n >= 3 && n <= 8) ok = false;
        }
        int[][] a = new int[n + 1][n + 1];
        int l = 1, r = n;
        int t = 1, b = n;
        int v = 1;
        while (l < r || t < b) {
            for (int i = l; i <= r; i++) {
                a[t][i] = v;
                v++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                a[i][r] = v;
                v++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                a[b][i] = v;
                v++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                a[i][l] = v;
                v++;
            }
            l++;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}