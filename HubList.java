package task;

import java.util.Arrays;
import java.util.Comparator;

class HubList<E> implements HubListImpl<E>{

    private int size = 0;

    E[] arr = (E[]) new Object[size];
    public void print(){
        for(E elem: arr){
            System.out.printf("%s ", elem);
        }
    }
    private void resize(){
        size+=1;
        arr = Arrays.copyOf(arr, size);
    }
    @Override
    public void add(E element) {
        resize();
        arr[size-1] = element;
    }

    @Override
    public E removeAt(int index) {
        E[] newArr = (E[]) new Object[size-1];
        E item = null;
        for (int i = 0; i < size; i++) {
            if(index==i) {
                item = arr[i];
                newArr[i] = arr[i + 1];
            } else if (i<index){
                newArr[i] = arr[i];
            } else {
                if (i==size-1){
                    arr = newArr;
                    size--;
                    return item;
                } else {
                    newArr[i] = arr[i+1];
                }
            }
        }
        return item;
    }

    @Override
    public void sort(Comparator<? super E> c) {
        for(int i = 0 ; i < size;i++) {
            for (int j = i + 1; j < size; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    E temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public int find(E element) {
        for (int i = 0; i < size; i++) {
            if(arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}