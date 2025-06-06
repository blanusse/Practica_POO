package ParcialesViejos.Segundos.Q2_2023.ej2;

import java.util.Comparator;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S >> {
   private final String player;
   private final S score;


   public PlayerScore(String player, S score) {
       this.player = player;
       this.score = score;
   }


   @Override
   public String toString() {
       return "Player %s scored %s".formatted(player, score);
   }


    @Override
    public int compareTo(PlayerScore<S> o) {
        int cmp = o.score.compareTo(this.score);
        if (cmp ==0){
            cmp = this.player.compareTo(o.player);
        }
        return cmp;
    }
}

