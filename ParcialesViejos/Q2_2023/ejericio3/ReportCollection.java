package ParcialesViejos.Q2_2023.ejericio3;

public interface ReportCollection<R> {
    void add(R report);

    R get(int index);

    R[] reports();
}