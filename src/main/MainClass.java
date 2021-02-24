package main;

import inplimentation.MySinglyLinkedList;
import myinterface.SinglyLinkedListADT;

public class MainClass {
    public static void main(String[] args) {
        MySinglyLinkedList lst=new MySinglyLinkedList();
        System.out.println(lst.isEmpty());    //true
        System.out.println(lst.size());         //0
        lst.addFirst(10);
        lst.addFirst(20);
        lst.addFirst(30);
        lst.addFirst(40);
        lst.addFirst(50);
        System.out.println(lst.size()); //5
        lst.addLast(60);
        lst.addAfterMiddle(35);
        lst.traverse();
        System.out.println(lst.addAfterGivenElement(36, 35));
        System.out.println(lst.size()); //8
        System.out.println(lst.first());
        System.out.println(lst.last());
        System.out.println(lst.lastWithoutTail());
        System.out.println(lst.removeFirst()); //50
        lst.traverse();
        System.out.println(lst.removeLast());//60
        lst.traverse();
        System.out.println(lst.search(40)); //true
        System.out.println(lst.search(45)); //false
        lst.deleteAll();
        System.out.println(lst.size()); //0
        System.out.println(lst.isEmpty()); //true
    }
}
