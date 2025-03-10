import java.util.Scanner;
public class Main {
    public class Student {
        private int year;
        private String name;
        public Student(int year, String name) {
            this.year = year;
            this.name = name;
        }
        public int getYear() {
            return year;
        }
        public String getName() {
            return name;
        }
        public void setYear(int n) {
            this.year = n;
        }
        public void setName(String s) {
            name = s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] cls = new Student[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int year = sc.nextInt();
            cls[i].setName(name);
            cls[i].setYear(year);
        }
        int total = 0;
        System.out.println("Danh sach lop: ");
        for (int i = 0; i < N; ++i) {
            total += 2012 - cls[i].getYear();
            System.out.println(cls[i].getName());
        }
        System.out.println("Tong so tuoi: " + total);
    }
}