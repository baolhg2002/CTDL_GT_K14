package baolhg2004110047.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(1);
        queue.add(10);
        queue.add(2);


        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ Queue " + phanTuDuocLayRa);
        
        System.out.println("Phần tử còn lại trong Queue");

        System.out.println(queue);

        int phanDuocPham = queue.peek();

        System.out.println("Phần tử vừa được thăm " + phanDuocPham);

        System.out.println("Phần tử còn lại trong queue sau Thăm");

        System.out.println(queue);


    }
}
