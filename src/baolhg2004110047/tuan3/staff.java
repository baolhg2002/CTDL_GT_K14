package tuan3; //baolhg2004110047
public class staff {
    String tennhanvien;
    String diachi;
    String bophanlamviec;
    String luong;
    String chucvu;
    String ngaysinh;

   

    staff(String tnv, String dc, String bplv, String l, String cv,String ns){
        tennhanvien = tnv;
        diachi = dc;
        bophanlamviec = bplv;
        luong = l;
        chucvu = cv;
        ngaysinh = ns; 
    }

    staff(String tnv, String dc, String bplv, String l){
        tennhanvien = tnv;
        diachi = dc;
        bophanlamviec = bplv;
        luong = l;
        
        System.out.println("Tên nhân viên: " + tennhanvien);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Bộ phận làm việc: " + bophanlamviec);
        System.out.println("Lương tháng: " + luong);
       
        
    }

    void inThongTinNhanvien(){
        System.out.println("Tên nhân viên: " + tennhanvien);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Bộ phận làm việc: " + bophanlamviec);
        System.out.println("Lương tháng: " + luong);
        System.out.println("Chức vụ: " + chucvu);
        System.out.println("ngày sinh: " + ngaysinh);
    }  
}