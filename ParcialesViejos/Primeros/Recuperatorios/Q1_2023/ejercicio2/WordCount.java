package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio2;

public class WordCount {
    private final String word;
    private final int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "WC: %s -> %d".formatted(word, count);
    }
}