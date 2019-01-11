package DoubledCharInString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        checkForDoubbledChar("Anna");
        checkForDoubbledChar("Xyx");
        checkForDoubbledChar("Xyz");
        printDoubledCharAndQuantity("Anna");
    }

    private static void checkForDoubbledChar(String s) {
        String[] chars = s.toLowerCase().replace(" ", "").split("");
        Set<String> charsSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            charsSet.add(chars[i]);
        }
        if (chars.length == charsSet.size()) {
            System.out.println("String: " + s + " dont have doubled chars");
        } else {
            System.out.println("String: " + s + " have doubled chars");
        }
    }

    private static void printDoubledCharAndQuantity(String s) {
        char[] chars = s.toLowerCase().replace(" ", "").toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int counter = map.get(chars[i]) + 1;
                map.put(chars[i], counter);
            } else{
            map.put(chars[i], 1);
            }
        }
        map.forEach((k, v) -> {
            
            if(v>1){
                System.out.println(k+"="+v);
            }
        });

    }
}
