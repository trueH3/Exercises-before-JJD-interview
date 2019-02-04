/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingUsingComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author szymon
 */
public class Main {

    public static void main(String[] args) {
        String s = "hahaha";
        Person p1 = new Person("Szymon", "Truszczyński", "trueH");
        Person p2 = new Person("Krzysztof", "Syska", "Prezydium");
        Person p3 = new Person("Wojciech", "Truszczyński", "Confidant");
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.sort((Person pe1, Person pe2) -> {
            return pe1.getNick().compareTo(pe2.getNick())
            ;});
        System.out.println(list);
    }
}
