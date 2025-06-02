package Practicas.Practica7.ej4;

import java.util.Objects;

public class RankedBook implements Comparable<RankedBook>{
    private Book book;
    private Genre genre;
    private int ranking;

    public RankedBook(Book book, Genre genre) {
        this.book = book;
        this.genre = genre;
    }

    RankedBook(RankedBook rankedBook) {
        this.book = rankedBook.book;
        this.ranking = rankedBook.ranking + 1;
        this.genre = rankedBook.genre;
    }

    RankedBook(Book book) {
        this.book = book;
        this.ranking = 1;
    }



    protected void incRanking() {
        this.ranking++;
    }


    protected Book getBook() {
        return book;
    }

    protected Genre getGenre() {
        return genre;
    }

    protected int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(RankedBook o) {
        int cmp = this.ranking - o .ranking;
        if(cmp == 0) {
            cmp = this.book.compareTo(o.book);
        }
        return cmp;
    }


    @Override
    public boolean equals(Object o) {
        return o instanceof RankedBook that &&
                book.equals(that.book) &&
                genre == that.genre;
    }


    @Override
    public int hashCode() {
        return Objects.hash(book, genre);
    }


    @Override
    public String toString() {
        return "%s : %d".formatted(book, ranking);
    }

}
