package tuan4; //baolhg2004110047
public class dog {
    String name;
    int size;
    String color;

    public dog(int s){
        size = s;

    }

    public dog(int s,String c, String n){
        size = s;
        color = c;
        name = n;
    }

    void inThongTin(){
        System.out.println("size = " + size + " " + "color = " + color + " " + "name = " + name);
    }

}