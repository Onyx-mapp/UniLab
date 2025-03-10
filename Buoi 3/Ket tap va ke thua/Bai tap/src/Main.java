public class Main {
    public class NhanVien {
        private String tenNhanVien;
        private double luongCoBan;
        private double heSoLuong;
        private double LUONG_MAX;
        static double tinhLuong = 0;
        public NhanVien (String s, double a, double b, double c) {
            this.tenNhanVien = s;
            this.luongCoBan = a;
            this.heSoLuong = b;
            this.LUONG_MAX = c;
            tinhLuong += a * b;
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
                tinhLuong += this.luongCoBan * h;
                return true;
            }
        }
        public double getTinhLuong() {
            return tinhLuong;
        }
    }
    public class PhongBan {
        private String tenPhongBan;
        private byte soNhanVien;
        public static final int SO_NV_MAX = 100;
        private NhanVien[] dsnv;
        public boolean themNhanVien(NhanVien nv) {
            if (soNhanVien < SO_NV_MAX) {
                dsnv[soNhanVien] = nv;
                soNhanVien++;
                return true;
            } else return false;
        }
        public NhanVien xoaNhanVien(){
            if (soNhanVien > 0) {
                NhanVien tmp = dsnv[soNhanVien-1];
                dsnv[soNhanVien-1] = null;
                soNhanVien--;
                return tmp;
            } else return null;
        }
        public PhongBan(String tenPB){

            dsnv = new NhanVien[SO_NV_MAX];
            tenPhongBan = tenPB;
            soNhanVien = 0;
        }
        public double tongLuong(){
            double tong = 0.0;
            for (int i=0;i<soNhanVien;i++)
                tong += dsnv[i].getTinhLuong();
            return tong;
        }
        public void inTTin(){
            System.out.println("Ten phong: " + tenPhongBan);
            System.out.println("So NV: "+soNhanVien);
            System.out.println("Thong tin cac NV");
            for (int i=0;i<soNhanVien;i++)
                dsnv[i].inTTin();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}