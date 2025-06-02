package Practicas.Practica7.ej4;

import java.util.*;

public class Ranker {

    private final Set<RankedBook> ranker = new TreeSet<>(Comparator.reverseOrder());


    public Ranker add(Genre genre, Book book){
        ranker.add(new RankedBook(book, genre));
        return this;
    }

    public void rateUp(Book book) {
        boolean found = false;

        Iterator<RankedBook> iterator = ranker.iterator();
        while (iterator.hasNext() && !found) {
            RankedBook rankedBook = iterator.next();
            if(rankedBook.getBook().equals(book)) {
                iterator.remove();
                ranker.add(new RankedBook(rankedBook));
                found = true;
            }
        }
        if(!found) {
            ranker.add(new RankedBook(book));
        }
    }


    public void printRanking(Genre genre) {

        System.out.println("Ranking of " + genre);
        for(RankedBook book : ranker){
            if(book.getGenre() != null && book.getGenre().equals(genre)){
                System.out.println(book);
            }
        }
    }

    public void printRanking(){
        System.out.println("General Ranking");
        for(RankedBook book : ranker){
            System.out.println(book);
        }
    }
}
