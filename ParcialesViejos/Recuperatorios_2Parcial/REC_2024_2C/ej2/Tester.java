package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_2C.ej2;


public class Tester {
    public static void main(String[] args){
        StockManager sM = new StockManager();
// Se agrega el producto "Cyberpunk 2077" con 10 unidades de stock
        System.out.println(sM.add("Cyberpunk 2077", 10)); // true
        System.out.println(sM.add("Stardew Valley", 6)); // true
        System.out.println(sM.add("Halo Infinite", 10)); // true
// Se obtienen todos los productos agregados, en orden alfabético
        for (String product : sM.products()) {
            System.out.println(product);
        }
// Cyberpunk 2077
// Halo Infinite
// Stardew Valley


// Se consulta el stock actual del producto "Cyberpunk 2077"
        System.out.println(sM.stockUnits("Cyberpunk 2077")); // 10
// Se concreta una compra del cliente "Foo" de 4 unidades del producto "Cyberpunk 2077"
        System.out.println(sM.purchase("Cyberpunk 2077", "Foo", 4)); // true
        System.out.println(sM.stockUnits("Cyberpunk 2077")); // 6
        System.out.println(sM.purchase("Cyberpunk 2077", "Foo", 1)); // true
        System.out.println(sM.purchase("Cyberpunk 2077", "Bar", 3)); // true
        System.out.println(sM.purchase("Cyberpunk 2077", "Abc", 1)); // true
        System.out.println(sM.stockUnits("Cyberpunk 2077")); // 1
// No se concreta la compra porque se necesitan 2 unidades y en el stock hay sólo 1
        System.out.println(sM.purchase("Cyberpunk 2077", "Xyz", 2)); // false
        System.out.println(sM.stockUnits("Cyberpunk 2077")); // 1
// Se consulta el total de unidades vendidas del producto "Cyberpunk 2077" al cliente "Foo"
        System.out.println(sM.salesUnits("Cyberpunk 2077", "Foo")); // 5
// Se obtienen los clientes que compraron "Cyberpunk 2077", en orden descendente
        for (String client : sM.salesClients("Cyberpunk 2077")) {
            System.out.println(client);
        }
// Foo
// Bar
// Abc


        System.out.println(sM.purchase("Stardew Valley", "Foo", 2)); // true
        System.out.println(sM.purchase("Stardew Valley", "Bar", 1)); // true
        System.out.println(sM.purchase("Stardew Valley", "Foo", 2)); // true
        System.out.println(sM.stockUnits("Stardew Valley")); // 1
        System.out.println(sM.salesUnits("Stardew Valley", "Foo")); // 4
        System.out.println(sM.salesUnits("Stardew Valley", "Bar")); // 1
        for (String client : sM.salesClients("Stardew Valley")) {
            System.out.println(client);
        }
// Foo
// Bar


// No se agrega el producto porque ya existe un producto con ese nombre
        System.out.println(sM.add("Cyberpunk 2077", 5)); // false
// No se concreta la compra porque no existe el producto "xxx"
        System.out.println(sM.purchase("xxx", "Foo", 3)); // false
// El stock actual de un producto que no existe es 0
        System.out.println(sM.stockUnits("xxx")); // 0
// El total de unidades vendidas para un producto que no existe (para cualquier cliente) es 0
        System.out.println(sM.salesUnits("xxx", "Foo")); // 0
// No hay clientes que compraron el producto "Halo Infinite"
        System.out.println(sM.salesClients("Halo Infinite").isEmpty()); // true
// Si no se agregaron productos
        System.out.println(new StockManager().products().isEmpty()); // true


    }
}
