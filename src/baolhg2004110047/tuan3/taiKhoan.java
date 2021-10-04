package tuan3; //baolhg2004110047
public class taiKhoan {
    String tenTaiKhoan;
    int soTaiKhoan;
    int soDu;

    taiKhoan() {

    }

    taiKhoan(String ttk, int stk) {
        tenTaiKhoan = ttk;
        soTaiKhoan = stk;
        System.out.println("Chủ tài khoản: " + tenTaiKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
    }

    taiKhoan(String ttk, int stk, int sd) {
        tenTaiKhoan = ttk;
        soTaiKhoan = stk;
        soDu = sd;
        System.out.println("Chủ tài khoản: " + tenTaiKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
    
}