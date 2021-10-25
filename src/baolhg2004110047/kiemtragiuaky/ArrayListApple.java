package baolhg2004110047.kiemtragiuaky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.unit.Scanner;

public class ArrayListApple {
    public static void main(String[] args) {
       Scanner checkApple = new Scanner(System.in);

        AppleList dst = new AppleList();
        int LuaChon = 0;
        do{
            System.out.println("===MENU===");
            System.out.println("Chọn chúc năng: ");
            System.out.println(
                "1. Thêm táo vào danh sách"
                "2. Tìm táo dựa vào màu nhập từ bàn phím"
                "3. In táo"
                "4. Thoát");

                LuaChon =  AppleList.nextInt();
                            AppleList.nextLine();
              if(LuaChon==1) {
                System.out.println("Nhập tên Apple: "); String name = AppleList.nextLine();
                System.out.println("Nhập khối lượng: ");Double mass = AppleList.nextDouble();
                System.out.println("Nhập màu sắc: "); String color = AppleList.nextLine();

                AppleList.nextLine();

                Apple1 sp = new Apple1(name,mass,color);
                dsAddApple(sp);
        }
            else if(LuaChon==2){
                dst.indanhsachtao();
                AppleList.nextLine();
            }else if(LuaChon==3){
                System.out.println("Nhập màu sắc: "); String color = AppleList.nextLine();
                 System.out.println("Kết quả tìm kiếm: ");
                dst.timtao(color);
        
        }
    }while(luaChon!=0);
    
         


               
        }

}




        
        