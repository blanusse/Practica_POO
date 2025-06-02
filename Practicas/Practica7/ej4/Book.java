package Practicas.Practica7.ej4;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book o) {
        int cmp = this.name.compareTo(o.name);
        if(cmp ==0){
            cmp = this.author.compareTo(o.author);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Book book && this.name.equals(book.name) && this.author.equals(book.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, author);
    }

    @Override
    public String toString(){
        return name;
    }
}
