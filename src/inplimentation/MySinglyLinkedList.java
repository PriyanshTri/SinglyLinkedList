package inplimentation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT{
    //head or start of linked list, this will refer to first element of linked list
    private Node head;
    //tail or end of linked list, this will refer to the last element of linked list
    private Node tail;
    //total number of elements in  linked list
    private int size;
    //constructor
    public MySinglyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    @Override
    public boolean isEmpty(){
        return head==null;
    }
    //to get the number of element in linked list
    @Override
    public int size(){
        return size;
    }

    public void addFirst(int element){
        //create a node
        Node node=new Node(element);
        if(isEmpty()){
            head=node;
            tail=node;
        }
        else{
            node.setNext(head);
            head=node;
        }
        size++;
    }
    
//    this method will add the node in the middle of the linked list
    @Override
    public void addAfterMiddle(int element){
        Node node=new Node(element);
        if(isEmpty()){
            head=node;
            tail=node;
        }
        else{
            int middle=size/2;
            Node temp=head;
            for (int i = 1; i < middle; i++) {
                temp=temp.getNext();
            }
            node.setNext(temp.getNext());
            if(middle==0){
                tail=node;
            }
            temp.setNext(node);
        }
        size++;
    }

    //    adding last element
//    add at end
//    insert at tail
    @Override
    public void addLast(int element){
        Node node=new Node(element);
        //for special cases list is empty
        if(isEmpty()){
            head=node;
            tail=node;
            //addFirst(element) will also work
        }
        else{
            tail.setNext(node);
            tail=node;
        }
        size++;
    }
    @Override
    //traversing the linked list
    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
    @Override
    //removing first element
    public int removeFirst(){
//        special case when list is empty
        if(isEmpty()){
            return -1;      //using -1 for, considering as invalid data
        }
        else {
            Node response = head;
            //        special case, when only a single node
            if (head == tail) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.getNext();
                size--;
            }
            return response.getData();
        }
    }


    @Override
    public int removeLast(){
        if(isEmpty()){
            return -1;
        }
        else{
            Node temp=head;
            Node previous=null;
            while(temp.getNext()!=null){
                previous=temp;
                temp=temp.getNext();
            }
            //special case, if there only a single node;
            if(previous==null){
                head=null;
                tail=null;
                size--;
                return -1;
            }
            else{
                return -1;
            }
        }
    }
    @Override
    public boolean search(int element){
        Node temp=head;
        while(temp!=null){
            if(head.getData()==element){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    @Override
    public int first(){
        if(isEmpty()){
            return -1; //considering the code for empty is -1
        }
        else{
            return head.getData();
        }
    }
    @Override
    public int last(){
        if (isEmpty()){
            return -1;  //considering -1 as invalid data
        }
        else{
            return tail.getData();
        }
    }
    @Override
    public int lastWithoutTail(){
        if(isEmpty()){
            return -1; //considering -1 as invalid data
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            return temp.getData();
        }
    }


    public boolean addAfterGivenElement(int ele,int givenEle){
        boolean response=false;
        if(!isEmpty()){
            Node temp=head;
            while (temp!=null){
                if(temp.getData()==givenEle){
                    break;
                }
                temp=temp.getNext();
            }
            if(temp!=null) {
                Node node = new Node(ele);
                node.setNext(temp.getNext());
                temp.setNext(node);
                response=true;
                size++;
                if(temp==tail){
                    tail=node;
                }
            }

        }
        return response;
    }
    public boolean addBeforeGivenElement(int ele,int givenEle){
        boolean response=false;
        if(!isEmpty()){
            Node temp=head;
            Node previous=null;
        }
        return response;
    }
    //it will completely delete the linked list
    @Override
    public void deleteAll(){
        head=null;
        tail=null;
        size=0;
    }
}
