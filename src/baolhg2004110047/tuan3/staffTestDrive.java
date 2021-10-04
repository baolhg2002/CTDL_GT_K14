package tuan3; //baolhg2004110047
public class staffTestDrive {
    public static void main(String[] args) {
        staff Staff;

        Staff = new staff("Nguyễn văn A","228 Quân tân bình", "tài chính marketing", "12000000", "trưởng phòng","23/04/1991"  );
        Staff.inThongTinNhanvien();
        System.out.println("=================");
        Staff = new staff("Nguyễn văn B", "230 Quận phú nhuận", "nhân sự", "6000000");
        Staff.tennhanvien = "Nguyễn văn B";
        Staff.diachi = "230 Quận phú nhuận";
        Staff.bophanlamviec = "nhân sư";
        Staff.luong = "6000000";
    }
}