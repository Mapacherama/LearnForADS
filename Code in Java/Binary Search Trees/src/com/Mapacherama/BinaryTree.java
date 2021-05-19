package com.Mapacherama;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    // To add the new node we'll follow these rules starting from the root node:
    // * if the new node's value is lower than the current node's. We go to the left child.
    // * if the new node's value is greater than the current node's. We go to the right child.
    // * when the current node is null. We've reached a leaf node and we can insert the new node in that position.
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // Value already exists
            return current;
        }

        return current;
    }

    // Create a public method that starts the recursion from the root node

    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Let's create a tree:

    public BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    // Let's see if the Tree contains a specific value. First create a recursive method that traverses the tree:

    private boolean containsNodeRecursive(Node current, int value) {
        // Base case:
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return containsNodeRecursive(value < current.value ? current.left : current.right, value);
    }

    // Find the node to delete same as before:
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go in here.
            // Tree different cases:
            // * A node has no children- This is the simplest case; we just need to replace this node with null in it's
            // parent node
            // * A node has exactly one child - int the parent node, we replace this node with its only child.
            // * A node has two children - This is the most complex case because it requires a tree reorganization

            if (current.left == null && current.right == null) {
                return null;
            }
            // Now for the one child implementation:
            // We're returning the non- null child so it can be assigned to the parent node.
            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            // Lastly the case where the node has two children.
            // First find the node that will replace the deleted node. We'll use the smallest node of the soon to be
            // deleted node's right sub-tree:

            // Then we assign the smallest value to the node to delete, and after that, we'll delete it from the right
            // sub tree:

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }


    // create public method that starts from the root:
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    // Depth first Search

    // This is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.

    // Next we have three examples: in-order, pre-order and post-order:

    // The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    // Pre-order traversal visits first the root node, then the left sub-tree, and finally the right sub-tree:
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Post-order traversal visits the left sub-tree, the right sub-tree, and the root node at the end:
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    // Breadth-First search

    // Visits all the nodes of a level before going to the next.

    // Also called level order
    // Visits all the levels of the tree starting from the root, and from left to the right.

    // We'll use a Queue to hold the nodes from each level in order. We'll extract each node from the list. Print the
    // values, and add its children to the queue:

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if(node.right != null) {
                nodes.add(node.right);
            }
        }
    }


}
