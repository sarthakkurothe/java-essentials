package tech.zeta.a;

import java.util.HashMap;

public class CountryMap {
    public static void main(String[] args) {

        HashMap<String, String> countryMap = new HashMap<>();

        countryMap.put("IN", "India");
        countryMap.put("US", "United States");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("JP", "Japan");
        countryMap.put("AU", "Australia");

        System.out.println("Country Codes and Names (Direct Print):");
        System.out.println(countryMap);

        System.out.println("\nCountry Codes and Names (Formatted):");
        for (String code : countryMap.keySet()) {
            System.out.println(code + " -> " + countryMap.get(code));
        }
    }
}
