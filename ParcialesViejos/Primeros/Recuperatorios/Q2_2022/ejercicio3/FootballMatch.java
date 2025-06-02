package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio3;

public class FootballMatch {
    private final String teamA, teamB;

    public FootballMatch(String teamA, String teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    @Override
    public String toString() {
        return String.format("Match %s vs %s", teamA, teamB);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof FootballMatch match2 && match2.getTeamA().equals(this.getTeamA()) && match2.getTeamB().equals(this.teamB);
    }
}