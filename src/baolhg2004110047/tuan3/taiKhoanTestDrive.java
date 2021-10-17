package baolhg2004110047.tuan3;
public class taiKhoanTestDrive {
    public static void main(String[] args) {
        taiKhoan Taikhoan;

        Taikhoan = new taiKhoan("Lê Văn A", 123456);
       Taikhoan.tenTaiKhoan = "Lê Văn A";
        Taikhoan.soTaiKhoan = 123456789;

        Taikhoan = new taiKhoan("Lê Văn A", 123456, 100000);
        Taikhoan.tenTaiKhoan = "Lê Văn A";
        Taikhoan.soTaiKhoan = 123456789;
        Taikhoan.soDu = 100000;
    }

}