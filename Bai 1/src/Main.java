import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) System.out.println("Đây là số nguyên dương");
        else System.out.println("Đây là số nguyên âm");
    }
}