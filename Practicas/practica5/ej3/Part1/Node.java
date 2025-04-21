package Practicas.practica5.ej3.Part1;

public class Node<T>{
    protected T head;
    protected Node tail;

    public Node(T head, Node tail){
        this.head = head;
        this.tail = tail;
    }
}
