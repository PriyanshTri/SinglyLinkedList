package inplimentation;

public class Node {
    //to store element of sequence
    private int data;
    // to store next reference
    private Node next;
    //constructor
    public Node(int data){
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
