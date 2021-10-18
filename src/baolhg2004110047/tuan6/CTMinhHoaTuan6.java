package baolhg2004110047.tuan6;

public class CTMinhHoaTuan6 {

    public static void main(String[] args) {
        So so1, so2;

        so1 = new So(5);

        so2 = new So(10);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

        swap(so1, so2);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

    }


    static void swap(So a, So b){
        int temp;
        temp = a.number;
        a.number = b.number;

        b.number = temp;
        
    }
    
}

