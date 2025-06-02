package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio3;

public class CountryAccessPass extends AllAccessPass{
    private String country;

    public CountryAccessPass(FootballCentral central, String name, String country){
        super(central, name);
        this.country = country;

    }

    @Override
    protected boolean canVisit(FootballMatch match){
        return super.canVisit(match) && (country.equals(match.getTeamA()) || country.equals(match.getTeamB()));
    }




}
