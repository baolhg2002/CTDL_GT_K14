package tuan4; //baolhg2004110047
import java.util.Scanner;

public class nhanVienTestDrive {
    public static void main(String[] args) {
        nhanVien[] nhanvienlist = new nhanVien[4];
        Scanner bienNhap = new Scanner(System.in);
     for(int i = 0; i < nhanvienlist.length; i++){
        System.out.println("Nhân viên thứ " + (i + 1));
        System.out.print("Tên nhân viên: " );
        String t = bienNhap.nextLine();
        System.out.print("Địa chỉ: ");
        String dc = bienNhap.nextLine();
        System.out.print("Bộ phận làm việc: ");
        String bplv = bienNhap.nextLine();
        System.out.print("Lương: ");
        int l = bienNhap.nextInt();
        System.out.print("Ngày sinh: ");
        String ns = bienNhap.nextLine();
         bienNhap.nextLine();
        nhanvienlist[i] = new nhanVien(t, dc, bplv, l, ns);
        }

        System.out.println("====THÔNG TIN NHÂN VIÊN=====");
        for(nhanVien nhanvien : nhanvienlist){
            nhanvien.inThongTinNhanVien();
        }
        
    }
}