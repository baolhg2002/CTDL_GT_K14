package tuan3; //baolhg2004110047
public class computerTestDrive {
    
    public static void main(String[] args) {
        computer Computer;

        Computer = new computer("DELL");
        Computer.nhaSanXuat = "DELL";

        Computer = new computer("DELL", 2018);
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;

        Computer = new computer("DELL", 2018, "Windows 10 Pro");
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;
        Computer.heDieuHanh = "Windows 10 Pro";

        Computer = new computer("DELL", 2018, "Windows 10 Pro", 16);
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;
        Computer.heDieuHanh = "Windows 10 Pro";
        Computer.RAM = 16;

        Computer = new computer("DELL", 2018, "Windows 10 Pro", 16, "i7 8700");
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;
        Computer.heDieuHanh = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 8700";

        Computer = new computer("DELL", 2018, "Windows 10 Pro", 16, "i7 8700", 30000000);
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;
        Computer.heDieuHanh = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 8700";
        Computer.gia = 30000000;

        Computer = new computer("DELL", 2018, "Windows 10 Pro", 16, "i7 8700", 30000000, 2023);
        Computer.nhaSanXuat = "DELL";
        Computer.namSanXuat = 2018;
        Computer.heDieuHanh = "Windows 10 Pro";
        Computer.RAM = 16;
        Computer.CPU = "i7 8700";
        Computer.gia = 30000000;
        Computer.namBaoHanh = 2020;
    }

}