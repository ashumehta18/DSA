//inserting elements in queue
import java.util.*;

class QueueArray {
  static int SIZE=5;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE]; 
 
  void enqueue(int item) 
  {
    if (rear == SIZE-1) 
    {
      System.out.println("Queue is full.");
      return;
    }

    if (front == -1)
      front = rear = 0;
    else
      rear++;
    
    array[rear] = item;
    System.out.println(item+" enqueued to queue.");
  }
}

class queue{
  public static void main(String args[]){  
    QueueArray ob1=new QueueArray(); 
    ob1.enqueue(10); 
    ob1.enqueue(20);
    ob1.enqueue(30);
    ob1.enqueue(40);
    ob1.enqueue(50);
    ob1.enqueue(67);
  }
}
