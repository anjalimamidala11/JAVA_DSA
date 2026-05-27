package day8;

import java.util.LinkedList;

public class AllMethodsOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();
        node.add(34);
        System.out.println(node);
        node.addFirst(34);
        System.out.println(node);
        node.addLast(34);
        System.out.println(node);
        node.offer(34);
        System.out.println(node);
        node.offerFirst(34);
        System.out.println(node);
        node.offerLast(34);
        System.out.println(node);
        node.get(34);
        System.out.println(node);
        
    }
}
