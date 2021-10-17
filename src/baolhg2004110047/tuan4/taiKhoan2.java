package baolhg2004110047.tuan4;
public class taiKhoan2 {
    String tentaikhoan;
    int sotaikhoan;
    float sodu;

    taiKhoan2(){}

    taiKhoan2(String tk, int stk, float sd){
        tentaikhoan = tk;
        sotaikhoan = stk;
        sodu = sd;

    }

    void intThongTinTaikhoan(){
        System.out.println("Tên tài khoản: " + tentaikhoan + " " + "Số tài khoản: " + sotaikhoan + " " + "Số dư trong tài khoản: " + sodu);
    }
}