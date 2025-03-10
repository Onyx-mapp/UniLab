public class Main {
    interface QuanLy {
        public abstract double tinhHoaHong();
    }
    public class NhanVien {
        private String tenNhanVien;
        private double heSoLuong;
        static final double luongCoBan = 750000;
        static final double LUONG_MAX = 20000000;
        public String getTenNhanVien() {
            return tenNhanVien;
        }
        public double getHeSoLuong() {
            return heSoLuong;
        }
        public double tinhLuong() {
            return luongCoBan * heSoLuong;
        }
        public void inTTin(){
            System.out.println("Ten nhan vien: " + tenNhanVien);
            System.out.println("Luong co ban: " + luongCoBan);
            System.out.println("He so luong: " + heSoLuong);
            System.out.println("Luong nhan vien: " + this.tinhLuong());
        }
        public boolean tangLuong(double h){
            heSoLuong += h;
            if (this.tinhLuong() > LUONG_MAX){
                heSoLuong -= h;
                return false;
            }
            return true;
        }
    }
    public class GiamDoc extends NhanVien implements QuanLy{
        private double phuCap;
        static final double loiNhuanCongTy = 200000000;
        public double tinhHoaHong() {
            return 0.05 * loiNhuanCongTy;
        }
        public double tinhLuong() {
            return super.tinhLuong() + phuCap + tinhHoaHong();
        }
    }
    public class CanBoQuanLy extends NhanVien implements QuanLy{
        static final double loiNhuanCongTy = 200000000;
        public double tinhHoaHong() {
            return 0.002 * loiNhuanCongTy;
        }
        public double tinhLuong() {
            return super.tinhLuong() + tinhHoaHong();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}