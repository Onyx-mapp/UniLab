import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.max(a, Math.max(b, c));
        if (a * a + b * b + c * c == 2 * d * d) System.out.println("Đây là cạnh tam giác vuông");
        else System.out.println("Đây không là cạnh tam giác vuông");
    }
}