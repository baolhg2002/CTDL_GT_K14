package baolhg2004110047.tuan3;
public class vehicle {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;
    String dongco;
    

    

    vehicle(String tcx, String hsx, String d, String gp, String dtx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
    }

    vehicle(String tcx, String hsx, String d, String gp, String dtx, String dc, String nsx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
        dongco = dc;
    }

    void inThongSoXe(){
        System.out.println("Tên chủ xe: " + tenchuxe);
        System.out.println("Hãng sản xuất: " + hangsanxuat);
        System.out.println("Dòng xe: " + dong);
        System.out.println("Giấy phép: " + giayphep);
        System.out.println("Dung tích bình xăng: " + dungtichxang);
        System.out.println("Động cơ: " + dongco);
        
    }
}