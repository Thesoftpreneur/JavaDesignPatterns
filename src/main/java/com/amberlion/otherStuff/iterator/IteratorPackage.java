package com.amberlion.otherStuff.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPackage {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bolek", "Lolek", "Kudłaty");
        Iterator<String> iter = names.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

}
