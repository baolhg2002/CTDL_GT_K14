package baolhg2004110047.tuan4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTestDrive {

    public static void main(String[] args) {
        Student[] studentList  = new Student[2];

        

        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách sinh viên");

        for(int i = 0; i < studentList.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.print("Tên sinh viên: ");
            String name = varInput.nextLine();
            System.out.print("Tuổi: ");
            int age = varInput.nextInt();//15 ENTER
            varInput.nextLine();//NHẬN VÀO PHÍM ENTER
            studentList[i] = new Student(name, age);
        }


        System.out.println("============in danh sách sinh viên sau nhập===========");
        for (Student student : studentList) {

            student.inThongTin();
            
        }

        List list = Arrays.asList(studentList);
        

        Comparator comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                
                return Integer.compare(o1.age, o2.age);
            }
            
        };

        list.sort(comparator);

        System.out.println("============in danh sách sinh viên sau khi so sánh===========");
        for (Student student : studentList) {

            student.inThongTin();
            
        }

    }
    
}