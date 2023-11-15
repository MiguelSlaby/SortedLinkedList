package cz.firstaiditresources.sortedlinkedlist;

import java.util.Arrays;

public class SortedLinkedListTest {

    private static final String EXPECTED_RESULT = "[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10]";

    public static void main(String[] args) {

        SortedLinkedList<Long> sortedLinkedList = new SortedLinkedList<>();

        sortedLinkedList.add(5L);
        sortedLinkedList.addAll(Arrays.asList(6L, 4L, 8L));
        sortedLinkedList.addFirst(7L);
        sortedLinkedList.addLast(3L);
        sortedLinkedList.addAll(123, Arrays.asList(2L, 1L, 4L));
        sortedLinkedList.add(456, 9L);
        sortedLinkedList.set(4, 10L);
        sortedLinkedList.offer(3L);
        sortedLinkedList.offerFirst(2L);
        sortedLinkedList.offerLast(4L);
        sortedLinkedList.push(5L);

        String result = sortedLinkedList.toString();

        if (!EXPECTED_RESULT.equals(result)) {
            throw new RuntimeException(EXPECTED_RESULT + " expected but " + sortedLinkedList + " received.");
        }
    }
}