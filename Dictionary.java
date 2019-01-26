package SDA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Dictionary {

    private Map<String, String> dictionary = new HashMap<>();

    public void addTranslation(String pl, String trans) {

        if (dictionary.containsKey(pl)) {
            System.out.println("słowo juz istnieje");

        } else dictionary.put(pl, trans);
    }

    public void edit(String pl, String trans) {

        if (dictionary.containsKey(pl)) {
            dictionary.put(pl, trans);
        } else {
            System.out.println("nie mozesz edytowac");
        }
    }

    public void remove (String pl){

    }

    public String getTranslation(String pl) {
        return dictionary.get(pl);
    }

}

