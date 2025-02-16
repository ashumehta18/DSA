// insert element at the end of the linked list 
import java.util.*;

public class insertLLAST {
    private Node head;
    private Node tail; //benifit of taking extra varriable to do it in constant time
    private int size;

    public insertLLAST(){
        this.size = 0;
    }

    private class Node {
        private Node next;
        private int val;

        public Node(int value){
            this.val = value;
        }
    }


    public void insertlast(int val){  
      Node node = new Node(val); //create box 
        if(tail == null){ //at last we want to add so if it will be no element present earlier then 
            head = tail = node;
        }
        else{
        tail.next = node; //next address to previously existing node
        tail = node; //now tail is the last element so we will update recently added node to tail
        }
        size++; //size will increase of ll 
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public static void main (String[] args){
        insertLLAST list = new insertLLAST();
        list.insertlast(3);
        list.insertlast(8);
        list.insertlast(7);

        list.display();
    }
}
