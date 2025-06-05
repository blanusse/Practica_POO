package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej2;

import java.util.*;

public class PasswordManager {

    private final Map<String, Types> typeByVault = new HashMap<>();
    private final Map<String, Map<String, String>> passwordsByVault = new HashMap<>();

    public void addVault(String vault, Types type){
        typeByVault.put(vault, type);
        passwordsByVault.put(vault, new TreeMap<>());
    }

    protected void checkPassword(String vault, String password){
        if(!typeByVault.get(vault).isValidPassword(password)){
            throw new RuntimeException("Password does not comply vault policy.");
        }

    }

    protected void checkVault(String vault){
        if(!typeByVault.containsKey(vault)){
            throw new RuntimeException("Invalid vault.");
        }
    }

    public void addPassword(String vault, String website, String password){
        checkVault(vault);
        checkPassword(vault, password);
        passwordsByVault.get(vault).put(website, password);
    }

    protected void checkWebsite(String vault, String website){
        if(!passwordsByVault.get(vault).containsKey(website)){
            throw new RuntimeException("Nonexistent website in vault.");
        }
    }

    public String getPassword(String vault, String website){
        checkVault(vault);
        checkWebsite(vault, website);
        return passwordsByVault.get(vault).get(website);
    }

    public void changeVaultPolicy(String vault, Types newType){
        checkVault(vault);
        typeByVault.put(vault, newType);
    }

    public Collection<String> getInvalidPasswords(){
        Collection<String> toReturn = new ArrayList<>();
        for(String vaults : typeByVault.keySet()){
            toReturn.addAll(getInvalidPasswords(vaults));
        }
        return toReturn;
    }

    public Collection<String> getInvalidPasswords(String vault){
        checkVault(vault);
        Collection<String> toReturn = new TreeSet<>();
        for(Map.Entry<String, String> entry : passwordsByVault.get(vault).entrySet()){
            if(!typeByVault.get(vault).isValidPassword(entry.getValue())){
                toReturn.add(entry.getKey());
            }
        }
        return toReturn;

    }



}
