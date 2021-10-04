package tuan3; //baolhg2004110047
public class bookTestDrive {
    public static void main(String[] args) {
        book Book;

        Book = new book("nhà xuất bản Lao Động", 2021 , 30000 );
        Book.nhaxuatban = "nhà xuất bản Lao Động";
        Book.namphathanh = 2021;
        Book.giaban = 30000;

        System.out.println("=================");
        
        Book = new book("nhà xuất bản Kim Đồng","truyện cười",  2021 , 25000, 70 ,20000  );
        Book.inThongTinSach();
        
    }
}