package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio3;

public class SaraCenter {
    private final String name;
    private double holidayDiscount;
    private double memberDiscount;

    public SaraCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHolidayDiscount() {
        return holidayDiscount;
    }

    public void setHolidayDiscount(double holidayDiscount) {
        this.holidayDiscount = holidayDiscount;
    }

    public double getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(double memberDiscount) {
        this.memberDiscount = memberDiscount;
    }



    public DiscountCard buildHolidayCard(String name){
        return new DiscountCard(this, name);
    }

    public DiscountCard buildMemberCard(String name){
        return new MemberCard(this, name);
    }


}