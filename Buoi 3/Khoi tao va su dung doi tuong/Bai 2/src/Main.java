import java.util.Scanner;
public class Main {
    class NhanVien {
        private String tenNhanVien;
        private double luongCoBan;
        private double heSoLuong;
        private double LUONG_MAX;
        static double tongLuong = 0;
        public NhanVien (String s, double a, double b, double c) {
            this.tenNhanVien = s;
            this.luongCoBan = a;
            this.heSoLuong = b;
            this.LUONG_MAX = c;
            tongLuong += a * b;
        }
        public void setNhanVien (String s, double a, double b, double c){
            this.tenNhanVien = s;
            this.luongCoBan = a;
            this.heSoLuong = b;
            this.LUONG_MAX = c;
        }
        public String getTenNhanVien() {
            return tenNhanVien;
        }
        public double getLuongCoBan() {
            return luongCoBan;
        }
        public double getHeSoLuong() {
            return heSoLuong;
        }
        public void inTTin(){
            System.out.println("Ten nhan vien: " + tenNhanVien);
            System.out.println("Luong co ban: " + luongCoBan);
            System.out.println("He so luong: " + heSoLuong);
            System.out.println("Luong nhan vien: " + luongCoBan * heSoLuong);
        }
        public boolean tangLuong(double h){
            heSoLuong += h;
            if (luongCoBan * heSoLuong > LUONG_MAX){
                heSoLuong -= h;
                return false;
            }
            else {
                tongLuong += this.luongCoBan * h;
                return true;
            }
        }
        public double getTongLuong() {
            return tongLuong;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            nv[i].setNhanVien(sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        System.out.println (nv[0].getTongLuong());
    }
}