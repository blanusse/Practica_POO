package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio3;

public class SaraTester {
    public static void main(String[] args) {
// Se instancia un SaraCenter y se indican los descuentos para los dos tipos de tarjetas
        SaraCenter center = new SaraCenter("USA Miami");
        center.setHolidayDiscount(0.2); // 20% de Descuento
        center.setMemberDiscount(0.4); // 40% de Descuento
        Product product1 = new Product("Vestido con flecos", 3000.0);
        System.out.println(product1);
        System.out.println(" ------------");

// Se instancia una tarjeta Holiday y se consulta el precio con 20% de descuento
        DiscountCard holidayCard = center.buildHolidayCard("BF1001");
        System.out.println(String.format("%s Full Price: $%.2f", product1, product1.getPrice()));
        System.out.println(String.format("%s Price with Holiday Card: $%.2f", product1, holidayCard.checkPrice(product1)));
        System.out.println(holidayCard);
        System.out.println(" ------------ ");
// Se compra el producto con la tarjeta Holiday
        holidayCard.buyProduct(product1);
        System.out.println(holidayCard);
        System.out.println(" ------------ ");
// Se instancia una tarjeta para miembros y se consulta el precio con 40% descuento
        DiscountCard memberCard = center.buildMemberCard("ME1002");
        System.out.println(String.format("%s Full Price: $%.2f", product1, product1.getPrice()));
        System.out.println(String.format("%s Price with Member Card: $%.2f", product1, memberCard.checkPrice(product1)));
        System.out.println(memberCard);
        System.out.println(" ------------ ");
// Se compra el producto con la tarjeta para miembros y se suman puntos
        memberCard.buyProduct(product1);
        System.out.println(memberCard);
        System.out.println(" ------------ ");
        Product product2 = new Product("Sombrero", 1300.0);
        System.out.println(product2);
        System.out.printf("%s Full Price: $%.2f%n", product2, product2.getPrice());
        System.out.printf("%s Price with Holiday Card: $%.2f%n", product2, holidayCard.checkPrice(product2));
        System.out.printf("%s Price with Member Card: $%.2f%n", product2, memberCard.checkPrice(product2));
        System.out.println(" ------------");
// Se compra sin costo el producto con la tarjeta para miembros
// porque tiene más puntos que el precio sin descuento
        memberCard.buyProduct(product2);
        System.out.println(memberCard);
        System.out.println(" ------------");
    }
}