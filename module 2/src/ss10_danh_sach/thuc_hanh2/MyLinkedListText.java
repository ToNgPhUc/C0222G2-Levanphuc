package ss10_danh_sach.thuc_hanh2;

import java.util.Arrays;

public class MyLinkedListText {
    public static void main(String[] args) {
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedList ll = new MyLinkedList(10);
            ll.addFirst(11);
            ll.addFirst(12);
            ll.addFirst(13);

            ll.add(4,9);
            ll.add(4,9);
            ll.printList();
        }
//        MyLinkedList myLinkedList= new MyLinkedList();
//        myLinkedList= new MyLinkedList(1);
//
//        myLinkedList.add(1,3);
//        System.out.println(Arrays.toString(myLinkedList));
    }

