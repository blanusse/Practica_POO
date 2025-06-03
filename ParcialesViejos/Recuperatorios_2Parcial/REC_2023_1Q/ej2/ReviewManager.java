package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_1Q.ej2;

import java.util.Collection;
import java.util.*;

public class ReviewManager {
    private Map<String, UserLevel> clientMap = new TreeMap<>(Comparator.reverseOrder());
    private Map<String, Collection<String>> productMap = new TreeMap<>();


    protected void checkUser(String name){
        if(clientMap.containsKey(name)){
            throw new RuntimeException("User already exists");
        }
    }

    public void addUser(String name, UserLevel level){
        checkUser(name);
        clientMap.putIfAbsent(name, level);
    }


    protected void checkExistingUser(String name){
        if(!clientMap.containsKey(name)){
            throw new RuntimeException("User does not exists");
        }
    }

    public void addReview(String name, String product, String review){
        checkExistingUser(name);
        UserLevel level = clientMap.get(name);
        int productReviews = productMap.getOrDefault(product, new ArrayList<>()).size();
        if(!level.canReview(productReviews)){
            throw new RuntimeException("User cannot review");
        }
        productMap.putIfAbsent(product, new ArrayList<>());
        productMap.get(product).add(review);
    }

    public Collection<String> getReviews(String product){
        return productMap.getOrDefault(product, new ArrayList<>());
    }

    public Collection<String> getProducts(){
        if(productMap.isEmpty()){
            return new ArrayList<>();
        }
        return productMap.keySet();
    }

    public Collection<String> getUsers(){
        if(productMap.isEmpty()){
            return new ArrayList<>();
        }
        return clientMap.keySet();
    }
}
