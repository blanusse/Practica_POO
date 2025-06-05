package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_1Q.ej2;

import java.util.*;

public class Reddy {
    private final Map<String, Map<User, Set<String>>> map = new HashMap<>();


    public void publishComment(String group, User user, String comment){
        map.putIfAbsent(group, new HashMap<>());
        map.get(group).putIfAbsent(user, new HashSet<>());
        map.get(group).get(user).add(comment);
        System.out.println("Publishing comment of user %s in group %s".formatted(user.getName(), group));
    }


    public Collection<String> getAllCommentsFromUser(User user){
        Collection<String> toReturn = new ArrayList<>();
        for(String group: map.keySet()){
            toReturn.addAll(getAllCommentsFromUserInGroup(group, user));
        }
        return toReturn;
    }

    public Collection<String> getAllCommentsInGroup(String group){
        Collection<String> toReturn = new ArrayList<>();
        for(Map.Entry<User, Set<String>> entry: map.getOrDefault(group, new HashMap<>()).entrySet()){
            toReturn.addAll(entry.getValue());
        }
        return toReturn;
    }

    public Collection<String> getAllCommentsFromUserInGroup(String group, User user){
        return map.getOrDefault(group, new HashMap<>()).getOrDefault(user, new HashSet<>());
    }

    protected void checkBeforeDelete(String group, User user){
        if(!map.containsKey(group) || !map.get(group).containsKey(user)){
            throw new RuntimeException("Inexistent group or user");
        }

    }

    public void deleteAllComments(String group, User user){
        checkBeforeDelete(group, user);
        map.get(group).put(user, new HashSet<>());
    }


}
