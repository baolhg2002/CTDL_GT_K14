package baolhg2004110047.tuan7;

public class MyLinkedList {

    Node head = null;//DANH SÁCH RỖNG
    Node tail = null;

    public MyLinkedList(){}


    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    
    }

    void remve(){

    }

    void print (){

        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng !!!");
            return;
        }

        System.out.println("Các nút trong danh sách:");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    

    }

    void find(){

    }

   

    
}
