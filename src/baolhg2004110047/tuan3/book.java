package tuan3; //baolhg2004110047
public class book {
    
    String nhaxuatban;
    String loai;
    double namphathanh;
    double giaban;
    double sotrang;
    double soluong;

    book(String nxb, double nph, double gb){

        nhaxuatban = nxb;
        namphathanh = nph;
        giaban = gb;
        
        System.out.println("Nhà xuất bản: " + nhaxuatban);
        System.out.println("Năm phát hành: " + namphathanh);
        System.out.println("Giá bán: " + giaban);

        
    }
    book(String nxb, String l, double nph, double gb, double st, double sl){

        nhaxuatban = nxb;
        loai = l;
        namphathanh = nph;
        giaban = gb;
        sotrang = st;
        soluong = sl;
    }    
    void inThongTinSach(){
        System.out.println("Nhà xuất bản: " + nhaxuatban);
        System.out.println("Năm phát hành: " + namphathanh);
        System.out.println("Giá bán: " + giaban);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Loại sách:" + loai);
        System.out.println("Số trang: " + sotrang);
    }
    
}