package baolhg2004110047.kiemtragiuaky;

import java.util.Scanner;

public class Apple {

    public String name;

    public String color;
    
    public double mass;

    Scanner n = new Scanner(System.in);

    public Apple(String n, int m, String c){
        mass = m;
        color = c;
        name = n;

    }

    void inThongTin(){
        System.out.println("Mass = " + mass + " " +"color = " + color );
        System.out.println("----------------------");
}
        public boolean equals (Apple other){
            boolean match = true;
    
            if ((name.equals(other.name)) && 
            mass == other.mass){
                match =  true;
            }else match = false;
    
    
            return match;
    }
    
}
