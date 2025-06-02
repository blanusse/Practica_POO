package ParcialesViejos.Segundos.Q1_2021.ej2;

import java.util.*;

public class FreeMarket {
    private final Map<String, Double> clientMap = new HashMap<>();
    private final Map<String, Product> productMap = new TreeMap<>();


    public void addProduct(String productName, double price, ProductCategory category){
        productMap.putIfAbsent(productName, new Product(productName, price, category));
    }

    public Collection<String> getProductsByCategory(ProductCategory category){
        SortedSet<String> toReturn = new TreeSet<>();
        for(Product product: productMap.values()){
            if(product.getCat()==category){
                toReturn.add(product.getName());
            }
        }
        return toReturn;
    }

    protected void checkClient(String clientName){
        if(!clientMap.containsKey(clientName)){
            throw new IllegalArgumentException("El usuario %s no existe".formatted(clientName));
        }
    }


    public void printUserPoints(String clientName){
        checkClient(clientName);
        System.out.println("Puntos del usuario %s: %.2f".formatted(clientName, clientMap.get(clientName)));
    }

    protected void checkProduct(String productName){
        if(!productMap.containsKey(productName)){
            throw new IllegalArgumentException("El producto no existe");
        }
    }

    public void buyProduct(String clientName, ProductCategory category, String productName){
        checkProduct(productName);
        double actualPoints = clientMap.getOrDefault(clientName, 0.0);
        double productPrice = productMap.get(productName).getPrice();
        double pointsToAdd = category.getPoints() + (category.getMultiplier()*productPrice);
        clientMap.put(clientName, pointsToAdd+actualPoints);
    }
}
