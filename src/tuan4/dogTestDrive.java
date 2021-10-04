package tuan4; //baolhg2004110047
public class dogTestDrive {
    public static void main(String[] args) {
        dog[] danhSachDog = new dog[7];

        dog dog0 = new dog(15, "xám", "lulu");
        dog dog1 = new dog(20, "đen", "milu");
        dog dog2 = new dog(18, "vàng", "lili");
        dog dog3 = new dog(25, "nâu", "lala");
        dog dog4 = new dog(10, "nâu đen", "sofi");
        dog dog5 = new dog(12, "xám", "fido");
        dog dog6 = new dog(16, "đốm", "mực");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for(int i = 0; i < danhSachDog.length; i++){
            danhSachDog[i].inThongTin();
        }

    }
}