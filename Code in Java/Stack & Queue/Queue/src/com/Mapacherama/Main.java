package com.Mapacherama;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queueA = new LinkedList();
        Queue queueB = new PriorityQueue();

        Queue<String> queue = new LinkedList<>();

        queue.add("element 1");
        queue.offer("element 2");
        queue.add("element 3");

        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
        }

        for(String element : queue) {
            System.out.print(element + " ");
        }

        int size = queue.size();

        String element1 = queue.poll();

        String element2 = queue.remove();

        String firstElement = queue.element();

        Queue<String> queueQuickPeek = new LinkedList<>();

        queueQuickPeek.add("element 1");
        queueQuickPeek.add("element 2");
        queueQuickPeek.add("element 3");

        String firstElementPeek = queueQuickPeek.element();

        Queue<String> queueRemove = new LinkedList<>();

        queueRemove.add("element 0");
        queueRemove.add("element 1");

        boolean containsElementZero = queueRemove.contains("element 0");
        boolean containsElementFree = queueRemove.contains("element 3");

        String removedElement = queueRemove.remove();

        queueRemove.clear();

    }
}
