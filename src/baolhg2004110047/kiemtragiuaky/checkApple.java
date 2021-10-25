package baolhg2004110047.kiemtragiuaky;
import java.util.ArrayList;
public class checkApple{
    import java.util.ArrayList;


public class checkApple {
    private ArrayList<apple1> danhSach;
		
		public checkApple() {
			this.danhSach = new ArrayList<apple1>();
		}
		
		public checkApple(ArrayList<apple1> danhSach) {
			this.danhSach = danhSach;
		}
        
		public void AddApple(apple1 sp) {
			this.danhSach.add(sp);
		
		}

		public void indanhsachtao() {
			for (apple1 apple1 : danhSach) {
				System.out.println(apple1);
			}
		}
		public void timtao(String tensp) {
			for (apple1 apple1 : danhSach) {
				if(apple1.getmausac().indexOf(tensp)>=0) {
					System.out.println(apple1);
				}
			}
		}
        
    
}
}
