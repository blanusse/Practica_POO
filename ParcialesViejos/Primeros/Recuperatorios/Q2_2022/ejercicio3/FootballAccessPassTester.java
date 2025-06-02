package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio3;

public class FootballAccessPassTester {
public static void main(String[] args) {
FootballMatch match1 = new FootballMatch("Argentina"
,
"Saudi Arabia");
FootballMatch match2 = new FootballMatch("Spain"
,
"Costa Rica");
FootballMatch match3 = new FootballMatch("Brazil"
,
"Serbia");
FootballMatch[] footballMatches = new FootballMatch[]{match1, match2, match3};
// Se instancia una central con los partidos aceptados
FootballCentral footballCentral = new FootballCentral(footballMatches);
// Se crea un pase para John que puede usarse para asistir a todos los partidos
// que sean aceptados por la central no más de una vez por partido
AllAccessPass allAccessPass = footballCentral.buildAllAccessPass("John");
System.out.println(allAccessPass);
/**
* Football Pass for John used for 0 matches
*/
// Se utiliza el pase para el partido Argentina - Arabia Saudita
allAccessPass.visit(match1);
System.out.println(allAccessPass);
/**
* Football Pass for John used for 1 matches
* Match Argentina vs Saudi Arabia
*/
    try {
// Falla porque el pase ya se usó una vez para este partido
        allAccessPass.visit(new FootballMatch("Argentina","Saudi Arabia"));
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
/**
 * Invalid Match
 */
    }
    try {
// Falla porque el partido no es aceptado por la central
        allAccessPass.visit(new FootballMatch("Chile", "New Zealand"));
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
/**
 * Invalid Match
 */
    }
    allAccessPass.visit(new FootballMatch("Brazil", "Serbia"));
    System.out.println(allAccessPass);
/**
 * Football Pass for John used for 2 matches
 * Match Argentina vs Saudi Arabia
 * Match Brazil vs Serbia
 */
// Se crea un pase para Megan que puede usarse para asistir a todos los partidos
// que sean aceptados por la central no más de una vez por partido
// siempre y cuando uno de los dos equipos del partido sea Argentina
AllAccessPass countryAccessPass = footballCentral.buildCountryAccessPass("Megan", "Argentina");
    countryAccessPass.visit(match1);
// Se actualizan los partidos aceptados por la central para futuras visitas
    footballCentral.setFootballMatches(new FootballMatch[]{match2, match3,
            new FootballMatch("Argentina", "Mexico")});
    countryAccessPass.visit(new FootballMatch("Argentina", "Mexico"));
    System.out.println(countryAccessPass);
/**
 * Football Pass for Megan used for 2 matches
 * Match Argentina vs Saudi Arabia
 * Match Argentina vs Mexico
 */
    try {
// Falla porque ninguno de los dos equipos del partido es Argentina
        countryAccessPass.visit(match2);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
/**
 * Invalid Match
 */
    }
}
}