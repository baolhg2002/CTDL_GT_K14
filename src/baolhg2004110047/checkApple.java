package baolhg2004110047;
import java.util.ArrayList;

import baolhg2004110047.kiemtragiuaky.Apple;
public class checkApple {

    private ArrayList<apple1> danhSach;
		
		public checkApple() {
			this.danhSach = new ArrayList<apple1>();
		}
		
		public checkApple(ArrayList<Apple1> danhSach) {
			this.danhSach = danhSach;
		}
        // 1.	Thêm táo vào danh sách.
		public void dsAddApple(Apple sp) {
			this.danhSach.add(sp);
		
		}
		//2. In danh sách táo ra màn hình.
		public void indanhsachtao() {
			for (Apple Apple : danhSach) {
				System.out.println(Apple);
			}
		}
       // 3.	Tìm kiếm tất cả táo dựa trên màu sắc  được nhập từ bàn phím.
		public void timtao(String tensp) {
			for (apple1 apple1 : danhSach) {
				if(apple1.getmausac().indexOf(tensp)>=0) {
					System.out.println(apple1);
				}
			}
		}
        
    
}
}
