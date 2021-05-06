package com.TheCodingCoon;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dl_list = new DoublyLinkedList();

        dl_list.addNode(10);
        dl_list.addNode(20);
        dl_list.addNode(30);
        dl_list.addNode(40);
        dl_list.addNode(50);

        dl_list.printNodes();
    }
}
