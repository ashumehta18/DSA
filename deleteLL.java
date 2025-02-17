// delete the first element of linked list
import java.util.*;

public class first {
    private Node head;
    private Node tail;
    private int size;

    public first(){
        this.size = 0;
    }

    private class Node{ //create node 
        private int val;
        private Node next;

        public Node (int value){
            this.val = value;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;  
        head = node; 

        if(tail == null){ 
            tail = head;
        }
        size++; ;
    }
    public void deleteF(int index){
        if(index == 0){
            Node temp = head; 
            head = head.next;
            temp.next = null;
        }
        size--;
    }

    public static void main(String[] args) {
        first list = new first();
        list.insertfirst(7);
        list.insertfirst(8);
        list.insertfirst(10);
        list.insertfirst(34);


        list.deleteF(0);
        list.display();
    }
}

