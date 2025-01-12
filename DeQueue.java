//dequeue == delete elements from queue
class QueueArray
{
  static int SIZE=10;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
}
class Main{
  public static void main(String args[]){
    QueueArray ob1=new QueueArray();
    ob1.enqueue(10);
    ob1.enqueue(20);
    ob1.enqueue(30);
    ob1.enqueue(40);

    ob1.dequeue();
    ob1.dequeue();
    ob1.dequeue();
    ob1.dequeue();
    ob1.dequeue();

    ob1.enqueue(50);
  }
}
