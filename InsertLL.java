//insert at the start of linked list 
import java.util.*;
// code for insert at first 
public class insert {
    private Node head;
    private Node tail;
    private int size;

    public insert(){
        this.size = 0;
    }
    
    //insert
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }
    // display
    void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{ //create node 
            private int val;
            private Node next;
    
            public Node(int value){
                this.val = value;
            }
        }
    public static void main(String[] args) {
        insert list = new insert();

        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(6);
        list.insertfirst(45);
        list.insertfirst(56);
        list.insertfirst(78);

        list.display();
    }
}
