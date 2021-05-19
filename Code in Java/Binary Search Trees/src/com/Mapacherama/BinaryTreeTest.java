package com.Mapacherama;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree bt = new BinaryTree();
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(){
        bt = bt.createBinaryTree();
        assertTrue(bt.containsNode(42));
        assertTrue(bt.containsNode(73));
        assertFalse(bt.containsNode(79));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        bt = bt.createBinaryTree();

        assertTrue(bt.containsNode(42));
        bt.delete(42);
        assertFalse(bt.containsNode(42));
    }
}
