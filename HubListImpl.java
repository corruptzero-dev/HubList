package task;

import java.util.Comparator;

interface HubListImpl<E> {
    void add(E element);
    E removeAt(int index);
    void sort(Comparator<? super E> c);
    int find(E element);
}