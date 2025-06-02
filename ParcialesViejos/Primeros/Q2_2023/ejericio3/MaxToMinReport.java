package ParcialesViejos.Primeros.Q2_2023.ejericio3;

import java.util.Comparator;

public class MaxToMinReport<R> extends MinToMaxReport<R>{


    public MaxToMinReport(Comparator<? super R> cmp) {
        super(cmp.reversed());
    }

}
