package baolhg2004110047.tuan3;
public class computer {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    int RAM;
    String CPU;
    int gia;
    int namBaoHanh;

    computer() {

    }

    computer(String nsx) {
        nhaSanXuat = nsx;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
    }

    computer(String nsx, int nSx) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }

    computer(String nsx, int nSx, String hdh) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        heDieuHanh = hdh;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
    }

    computer(String nsx, int nSx, String hdh, int r) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        heDieuHanh = hdh;
        RAM = r;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("RAM: " + RAM);
    }

    computer(String nsx, int nSx, String hdh, int r, String c) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        heDieuHanh = hdh;
        RAM = r;
        CPU = c;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
    }

    computer(String nsx, int nSx, String hdh, int r, String c, int g) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        heDieuHanh = hdh;
        RAM = r;
        CPU = c;
        gia = g;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + gia);
    }

    computer(String nsx, int nSx, String hdh, int r, String c, int g, int nbh) {
        nhaSanXuat = nsx;
        namSanXuat = nSx;
        heDieuHanh = hdh;
        RAM = r;
        CPU = c;
        gia = g;
        namBaoHanh = nbh;
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + gia);
        System.out.println("Năm bảo hành: " + namBaoHanh);
    }

}