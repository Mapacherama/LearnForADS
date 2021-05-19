package com.Mapacherama;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt = bt.createBinaryTree();

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        bt.traverseLevelOrder();

    }
}
