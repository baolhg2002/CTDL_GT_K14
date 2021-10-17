package baolhg2004110047.tuan4;
import java.util.Scanner;

public class sinhVienTestDrive {
    public static void main(String[] args) {
       sinhVien[] danhSachSinhVien = new sinhVien[5];
       
       Scanner varInput = new Scanner(System.in);
      
       System.out.println("nhập vào danh sách sinh viên"); 
        
        for(int i = 0; i < danhSachSinhVien.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            System.out.print("MSSV: ");
            varInput.nextLine();
            System.out.print("họ tên sinh viên: ");
            String hoTen = varInput.nextLine();
            System.out.print("tuổi: ");
            varInput.nextLine();  
            System.out.print("Quê quán: ");   
            String queQuan = varInput.nextLine();
        }
    }
}