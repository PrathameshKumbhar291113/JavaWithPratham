package com.company;
public class CWP_Ch15_CollectionFrameworks_LinkedListImplementationBySelfInJava {
    public static void main(String[] args) {
        CWP_Ch15_CollectionFrameworks_LinkedListCustomLinkedList <Integer> customLinkedList = new CWP_Ch15_CollectionFrameworks_LinkedListCustomLinkedList<>();
        for(int i =0 ; i <10 ; i++){
            customLinkedList.add(i);
        }
        customLinkedList.print();
    }
}