package ParcialesViejos.Segundos.Q2_2022.ej2;

import java.util.*;

public class MultilingualDictionary {
    private final Language dictionaryLanguage;
    private final Map<Language, Map<String, String>> dictionary = new EnumMap<>(Language.class);

    public MultilingualDictionary(Language language) {
        this.dictionaryLanguage = language;
    }

    public MultilingualDictionary addTranslation(String word, Language language, String traduction){
        if(language.equals(dictionaryLanguage)){
            throw new IllegalArgumentException("Cannot add %s translations".formatted(language));
        }
        dictionary.putIfAbsent(language, new HashMap<>());
        dictionary.get(language).putIfAbsent(word, traduction);
        return this;
    }


    public String getTranslation(String word, Language language){
        if(!dictionary.containsKey(language) || !dictionary.get(language).containsKey(word)){
            throw new IllegalArgumentException("No %s traduction for %s".formatted(language, word));
        }
        return dictionary.get(language).get(word);
    }

    public int translationsCount(Language language){
        if(!dictionary.containsKey(language)){
            return 0;
        }
        return dictionary.get(language).size();
    }
    public int removeTranslations(Language language){
        int toReturn = translationsCount(language);
        dictionary.remove(language);
        return toReturn;
    }


}
