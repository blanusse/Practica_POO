package Practicas.practica5.ej3.Part1;

public class List<T> implements LinearList<T> {
    private Node first;

    @Override
    public void add(T obj) {
        Node current = first;
        if (first == null) {
            first = new Node(obj, null);
        } else {
            while (current.tail != null) {
                current = current.tail;
            }
            current.tail = new Node(obj, null);
        }
    }


    @Override
    public Object get(int i) {
        Node current = first;
        for (int k = 0; k < i; k++) {
            current = current.tail;
        }
        return current.head;
    }

    @Override
    public void set(int i, T obj) {
        Node current = first;
        for (int k = 0; k < i; k++) {
            current = current.tail;
        }
        current.head = obj;

    }

    @Override
    public void remove(int i) {
        Node current = first;
        for (int k = 0; k < i - 1; k++) {
            current = current.tail;
        }
        current.tail = current.tail.tail;
    }

    @Override
    public int indexOf(T obj) {
        Node current = first;
        for (int i = 0; current!=null; i++, current = current.tail) {
            if (current.head.equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        Node current = first;
        int count = 0;
        for (int i = 0; current != null; i++, current = current.tail) {
            count++;
            }
        return count;
        }
    }

