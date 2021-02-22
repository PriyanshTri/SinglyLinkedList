package myinterface;

public interface SinglyLinkedListADT {
    boolean isEmpty(); //O(1);
    int size();        //O(1);
    void addFirst(int element);  //O(1);
    void addAfterMiddle(int element); //O(n);
    void addLast(int element);    //O(1);
    void traverse();               //O(N);
    int removeFirst();           //O(1);
    int removeLast();      //O(N);
    boolean search(int element);
    //deleteFromBeginning
    //deleteFromHead
    //deleteFromEnd
    //will bring the first element that is the data of first node
    int first();  //O(1);
    int last();   //O(1)
    int lastWithoutTail();
    boolean addAfterGivenElement(int ele,int givenElement);
    boolean addBeforeGivenElement(int ele,int givenElement);
    void deleteAll();
}

