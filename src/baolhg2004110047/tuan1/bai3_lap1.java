package tuan1; //baolhg2004110047
import java.util.Scanner;
public class bai3_lap1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cạnh khối lập phương:");
        double canh = scanner.nextDouble();
        double theTich = canh * canh * canh;
        System.out.println("Thể tích khối lập phương là: " + theTich);
    }
}
