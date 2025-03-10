public class Main {
    abstract public class NhanVien {
        private String tenNhanVien;
        static final double LUONG_MAX = 20000000;
        public String getTenNhanVien() {
            return tenNhanVien;
        }
        public void setTenNhanVien (String s) {
            this.tenNhanVien = s;
        }
        abstract public double tinhLuong();
        abstract public void inThongTin();
    }
    public class NhanVienCoHuu extends NhanVien {
        private double luongCoBan;
        private double heSoLuong;
        public double tinhLuong() {
            return luongCoBan * heSoLuong;
        }
        boolean tangHeSoLuong (double a) {
            heSoLuong += a;
            if (this.tinhLuong() <= LUONG_MAX && heSoLuong >= 0) {
                return true;
            }
            else {
                heSoLuong -= a;
                return false;
            }
        }
        public void inThongTin() {
            System.out.println("Ten nhan vien:  " + getTenNhanVien());
            System.out.println("Luong: " + tinhLuong());
        }
    }
    public class NhanVienHopDong extends NhanVien {
        private double luongHopDong;
        public double tinhLuong() {
            return luongHopDong;
        }
        public void inThongTin() {
            System.out.println("Ten nhan vien:  " + getTenNhanVien());
            System.out.println("Luong: " + tinhLuong());
        }
    }
    public class TruongPhong extends NhanVienCoHuu {
        private double phuCap;
        private int soNamDuongChuc;
        public double tinhLuong() {
            return super.tinhLuong() + phuCap;
        }
        public void inThongTin() {
            System.out.println("Ten nhan vien:  " + getTenNhanVien());
            System.out.println("So nam duong chuc: " + soNamDuongChuc);
            System.out.println("Luong: " + tinhLuong());
        }
    }
    public class PhongBan {
        private String tenPhongBan;
        private int soNhanVien;
        static final int SO_NV_MAX = 100;
        private NhanVien[] pb = new NhanVien[SO_NV_MAX + 1];
        public boolean themNV (NhanVien nv) {
                if (soNhanVien < SO_NV_MAX) {
                    pb[soNhanVien] = nv;
                    soNhanVien++;
                    return true;
                }
                else return false;
        }
        public NhanVien xoaNV(String s) {
            if (soNhanVien == 0) return null;
            else{
                boolean b = true;
                int l = 0;
                for (int i = 0; i < soNhanVien; i++) {
                    if (pb[i].getTenNhanVien().equals(s)) {
                        l = i;
                        b = false;
                    }
                }
                if (b) return null;
                else {
                    NhanVien nv = pb[l];
                    for (int i = l; i < soNhanVien; i++) {
                        pb[i] = pb[i + 1];
                    }
                    return nv;
                }
            }
        }
        public double tinhTongLuong() {
            double temp = 0;
            for (int i = 0; i < soNhanVien; i++) {
                temp += pb[i].tinhLuong();
            }
            return temp;
        }
        public void inThongTin() {
            System.out.println("Ten phong ban: " + tenPhongBan);
            System.out.println("So nhan vien: " + soNhanVien);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}