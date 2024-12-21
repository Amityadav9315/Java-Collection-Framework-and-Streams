package LinkedList;

public class Test {

    public static void main(String[] args) {
        Node Node1=new Node();
        Node Node2=new Node();
        Node Node3=new Node();
        node1.value=2;
        node2.value=3;
        node1.next=node2;
        node2.next=null;


    }


}
class Node{
    public int value;
    public Node next;
}
