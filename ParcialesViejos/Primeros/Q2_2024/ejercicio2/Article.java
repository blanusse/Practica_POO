package ParcialesViejos.Primeros.Q2_2024.ejercicio2;


public class Article implements Comparable<Article> {
    protected boolean status;
    protected FeedType type;
    private String title;

    public Article(FeedType type, String title){
        this.type = type;
        this.title = title;
        this.status = false;
    }

    public void read(){
        this.status = true;
    }

    @Override
    public String toString(){
        return "%s %s %s".formatted(type, title, status ? "is read" : "is unread");
    }

    @Override
    public int compareTo(Article o) {
        int cmp = this.type.compareTo(o.type);
        if(cmp == 0){
            cmp = this.title.compareTo(o.title);
        }
        return cmp;
    }
}
