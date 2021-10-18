package baolhg2004110047.tuan4;
public class Student {

    String name;
    int age;

   public Student (){};

    public Student(String n, int a){
        name = n;
        age = a;
    }

    void inThongTin(){
        System.out.println("Name: " + name + "   age: " + age);
    }
    
}