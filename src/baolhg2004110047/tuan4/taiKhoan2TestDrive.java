package baolhg2004110047.tuan4;
import java.util.Scanner;

public class taiKhoan2TestDrive {
    public static void main(String[] args) {
        taiKhoan2[] taikhoanlist = new taiKhoan2[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < taikhoanlist.length; i++ ){
            System.out.println("nhập tài khoản thứ  " + (i + 1));
            System.out.print("Tên tài khoản: ");
            String tk = bienNhap.nextLine();
            System.out.print("Số tài khoản: ");
            int stk = bienNhap.nextInt();
            System.out.print("Số dư trong tài khoản: ");
            float sd = bienNhap.nextFloat();
            bienNhap.nextLine();
            taikhoanlist[i] = new taiKhoan2(tk, stk, sd);

        }

        System.out.println("_____THÔNG TIN TÀI KHOẢN_____");
        for(taiKhoan2 taikhoan : taikhoanlist){
            taikhoan.intThongTinTaikhoan();
        }

    }
}