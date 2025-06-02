package ParcialesViejos.Segundos.Q2_2024.ej1;

import java.time.MonthDay;
import java.util.Comparator;

public class Issue implements Comparable<Issue> {
    private final String title;
    private final MonthDay date;
    private final IssueType type;
    private boolean status;

    public Issue(String title, MonthDay date, IssueType type) {
        this.title = title;
        this.date = date;
        this.type = type;
        this.status = false;
    }

    public void resolve(){
        this.status = true;
    }

    public String getTitle() {
        return title;
    }

    public MonthDay getDate() {
        return date;
    }

    public IssueType getType() {
        return type;
    }

    public String toString(){
        return "%s %s: %s (%s)".formatted(date, type, title, status? "resolved" : "pending");
    }



    @Override
    public int compareTo(Issue o) {
        int cmp = this.type.compareTo(o.type);
        if(cmp == 0){
            cmp = o.date.compareTo(this.date);
            if(cmp == 0){
                cmp = this.title.compareTo(o.title);
            }
        }
        return cmp;
    }
}
