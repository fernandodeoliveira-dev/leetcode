package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        var result = removeDuplicatesFromLinkedList(input);

        printResult(result);
    }

    public List<Integer> getNodesInArray(RemoveDuplicatesFromLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    public static RemoveDuplicatesFromLinkedList.LinkedList addMany(RemoveDuplicatesFromLinkedList.LinkedList ll, List<Integer> values) {
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicatesFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList temp = linkedList;

        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return linkedList;
    }

    private static void printResult(LinkedList linkedList) {
        while (linkedList != null) {
            System.out.println(linkedList.value);
            linkedList = linkedList.next;
        }
    }
}
