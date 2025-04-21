package Teorica.Iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl<T> implements Queue<T>{

    private Node<T> first, last;


    @Override
    public void enqueue(T element) {
        Node<T> node = new Node<>(element);
        if(isEmpty()){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        T toReturn = first.elem;
        if(first == last) {
            first = last = null;
        } else {
            first = first.next;
        }
        return toReturn;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                T toRet = current.elem;
                current = current.next;
                return toRet;
            }
        };
    }


    private static class Node<T> {
        T elem;
        Node<T> next;

        public Node(T elem) {
            this.elem = elem;
        }
    }
}
