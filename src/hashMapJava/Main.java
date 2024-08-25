package hashMapJava;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Hashmap implements the Map interface (need import)
        // similar to ArrayList, but with key-value pairs
        // stores object, need to use Wrapper Class

        // create a hashmap
        //  HashMap<dataTypes>
        HashMap<String, String> countries = new HashMap<>();

        //add  a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        System.out.println(" ");

        // System.out.println(countries);

        // remove items
        countries.remove("USA");

        System.out.println(countries.get("Russia"));

        // clear everything
        // countries.clear();

        // get size
        System.out.println(countries.size());

        // replace
        countries.replace("USA", "Detroit");

        // look for a certain key
        System.out.println(countries.containsKey("England"));
        
        // look for a certain key
        System.out.println(countries.containsValue("Beijing"));

        System.out.println(countries);

        // show hashmap values in a biutifull way
        for(String i : countries.keySet()){
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }

    }
}
