package baolhg2004110047.tuan3;
public class vehicleTestDrive {
    public static void main(String[] args) {
        vehicle Vehicle;
        Vehicle = new vehicle("Nguyễn Văn A", "lamborghini", "Supercar", "B2", "14.2l");
        
        Vehicle.inThongSoXe();

        System.out.println("===================");

        Vehicle = new vehicle("Nguyễn Văn B", "Rolls-Royce", "Classic car", "B2", "15l", "V8","1965");

        Vehicle.inThongSoXe();

    }
    
}