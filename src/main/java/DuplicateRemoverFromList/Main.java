/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateRemoverFromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("ślimak", "ślimak", "kasza", "Zraz"));
        List<String> noDuplicatesList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicatesList);
    }
    
    //another way is to throw all elements to set and then again to list
}
