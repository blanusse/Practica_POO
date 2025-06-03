package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej1;

import java.util.*;


public interface UndoCollection<T> extends Set<T>{

    void undo();
    int undo(int n);
}
