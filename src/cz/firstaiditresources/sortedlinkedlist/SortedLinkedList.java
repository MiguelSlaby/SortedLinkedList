package cz.firstaiditresources.sortedlinkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * This is the SortedLinkedList.
 * It is based on LinkedList and keeps the order of elements from the smallest one to the
 * largest one.
 * The idea behind is that we want to keep interchangeability with LinkedList so interface is kept.
 * On the other hand some methods should not be used anymore as those have lost their original meaning -
 * namely methods adding element on specified index are not doing this anymore. Therefor those are annotated with deprecation.
 *
 * @param <E>
 */
public final class SortedLinkedList<E> extends LinkedList<E>
        implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

    /**
     * Adds e into this collection and sorts it.
     *
     * @param e element whose presence in this collection is to be ensured
     * @return true
     */
    public boolean add(E e) {
        super.add(e);
        Collections.sort((LinkedList) this);
        return true;
    }

    /**
     * Adds all elements in c into this collection and sorts this collection. For performance purposes, sort is called
     * after all elements are added.
     *
     * @param c collection containing elements to be added to this collection
     * @return true when collection is not empty
     */
    public boolean addAll(Collection<? extends E> c) {
        super.addAll(0, c);
        Collections.sort((LinkedList) this);
        return true;
    }

    /**
     * Adds e into the collection and orders it, so e is NOT added at the beginning - that is the reason why deprecated.
     *
     * @param e the element to add
     */
    @Deprecated
    public void addFirst(E e) {
        add(e);
    }

    /**
     * Adds e into the collection and orders it, so e is NOT added at the end - that is the reason why deprecated.
     *
     * @param e the element to add
     */
    @Deprecated
    public void addLast(E e) {
        add(e);
    }

    /**
     * Adds all elements in c into this collection and sorts this collection. Elements are NOT added to specified index -
     * that is the reason why deprecated.
     *
     * @param index ignored
     * @param c     collection containing elements to be added to this list
     * @return true if collection is not empty
     */
    @Deprecated
    public boolean addAll(int index, Collection<? extends E> c) {
        return addAll(c);
    }

    /**
     * Replaces the element at the specified position in this list with the specified element, which is then typically
     * stored on different position due to sort.
     *
     * @param index   index of the element to replace
     * @param element element to be stored
     * @return removed element
     * @throws IndexOutOfBoundsException – if the index is out of range (index < 0 || index >= size())
     */
    public E set(int index, E element) {
        E removed = this.remove(index);
        add(element);
        return removed;
    }

    /**
     * Adds element into the collection and orders it, so e is NOT added at the index - that is the reason why deprecated.
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Deprecated
    public void add(int index, E element) {
        add(element);
    }

    /**
     * Adds element into the collection and orders it.
     *
     * @param e the element to add
     * @return true
     */
    public boolean offer(E e) {
        return add(e);
    }

    /**
     * Adds element into the collection and orders it, so e is NOT added at the beginning - that is the reason why deprecated.
     *
     * @param e the element to add
     * @return true
     */
    @Deprecated
    public boolean offerFirst(E e) {
        add(e);
        return true;
    }

    /**
     * Adds element into the collection and orders it, so e is NOT added at the end - that is the reason why deprecated.
     *
     * @param e the element to add
     * @return true
     */
    @Deprecated
    public boolean offerLast(E e) {
        add(e);
        return true;
    }

    /**
     * Adds element into the collection and orders it.
     *
     * @param e the element to add
     */
    public void push(E e) {
        add(e);
    }
}