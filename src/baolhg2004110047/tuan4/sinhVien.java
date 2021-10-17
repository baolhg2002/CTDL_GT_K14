package baolhg2004110047.tuan4;
public class sinhVien {
    int MSSV;
    String  hoTen;
    int tuoi;
    String queQuan;


    public sinhVien(int m){
        MSSV = m;
    }

    public sinhVien(int m,String h,int t, String q){
        MSSV = m;
        hoTen = h;
        tuoi = t;
        queQuan = q;

    }
    
    void inThongTinSinhVien(){
        System.out.println("MSSV: " + MSSV + " " + "họ tên: " + hoTen +" " + "tuổi: " + tuoi + " " + "quê quán: " + queQuan);

    }
}