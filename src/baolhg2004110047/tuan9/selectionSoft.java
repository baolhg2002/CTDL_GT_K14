package baolhg2004110047.tuan9;

public class selectionSoft {
    public static void main(String[] args) {
        int[] arr = (6, 9, 2, 19, -7, 12, -10, 1);
        SC(arr);
    }
    public static void SC(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j = arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNum;
        }
        System.out.println("Mảnh sắp xếp tăng dần");
        for(int i = 0; i < arr.length; int++){
            System.out.println(arr[i]);
        }
    }
}
