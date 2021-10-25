package baolhg2004110047.kiemtragiuaky;
import java.util.ArrayList;
public class AppleList{

public class AppleList {
    private ArrayList<Apple> danhSach;
		
		public AppleList() {
			this.danhSach = new ArrayList<Apple>();
		}
		
		public AppleList(ArrayList<Apple> danhSach) {
			this.danhSach = danhSach;
		}
        
		public void AddApple(Apple sp) {
			this.danhSach.add(sp);
		
		}

		public void indanhsachtao() {
			for (Apple apple : danhSach) {
				System.out.println(Apple);
			}
		}
		public void timtao(String tensp) {
			for (Apple apple : danhSach) {
				if(apple.getcolor().indexOf(tensp)>=0) {
					System.out.println(Apple);
				}
			}
		}
	}
}
        
    

