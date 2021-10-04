package tuan4; //baolhg2004110047
public class nhanVien {
    String tenNhanVien;
    String diaChi;
    String boPhanLamViec;
    int luong;
    String ngaySinh;


    nhanVien(String tnv, String dc, String bplv, int l, String ns){
        tenNhanVien = tnv;
        diaChi = dc;
        boPhanLamViec = bplv;
        luong = l;
        ngaySinh = ns;

    }

    void inThongTinNhanVien(){
        System.out.println("Tên Nhân viên:" + tenNhanVien + " " + "Địa chỉ:" + diaChi + " " + "Bộ phận làm việc:" + boPhanLamViec + " " + "Lương:" + luong + " " + "Ngày sinh:" + ngaySinh + " ");
        
    }
}