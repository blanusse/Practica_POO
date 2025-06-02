package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio3;

public class FootballCentral {
    private FootballMatch[] footballMatches;

    public FootballCentral(FootballMatch[] footballMatches) {
        setFootballMatches(footballMatches);
    }

    private FootballMatch[] getFootballMatches() {
        return footballMatches;
    }

    public void setFootballMatches(FootballMatch[] footballMatches) {
        this.footballMatches = footballMatches;
    }

    public boolean belongsIn(FootballMatch footballMatch) {
        for (FootballMatch value : getFootballMatches()) {
            if (value.equals(footballMatch)) {
                return true;
            }
        }
        return false;
    }

    public AllAccessPass buildAllAccessPass(String name){
        return new AllAccessPass(this, name);
    }

    public AllAccessPass buildCountryAccessPass(String name, String country){
        return new CountryAccessPass(this, name, country);
    }
}