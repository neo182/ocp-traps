package no.satyam.ocp.chap3;

import java.util.*;
import java.io.*;

public class GenericsDemo {
    public static void main(String... arg) {
        List<Integer> keywords = new ArrayList<>();
        keywords.add(1);
        keywords.add(2);
      //  printList(keywords);
        
        // the notion of 'super' in <? super Exception> applies for the instance the ref is referring to. not the element it stores.
        
        // For that the rule is just opposite because the object of
        // sub-class can be casted into the object of superclass without casting, the element it can store must be instance of same class or its subclass
        // here in the context instance of FileNotFoundEx can be casted to the object instance w/o casting
        // the highest class that it can refer to is RuntimeException
        List<? super RuntimeException> myList = new ArrayList<Object>();
        // edge case 1 : the lowest class
        myList.add(new RuntimeException());
        // case 2 : A higher sub-class of RuntimeException
        myList.add(new ArrayIndexOutOfBoundsException());
        
        List<? extends Exception> listTest = new ArrayList<RuntimeException>();
        
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("999", "B");
        treeMap.put("zzz", "A");
        treeMap.put("afasd", "C");
        treeMap.put("AFASD", "B");
        
        for(String key : treeMap.keySet()) {
            System.out.println(key);//
        }
        

    }
    
    public static void printList(List list) {
        for(Object x : list)
            System.out.println(x);
    }
}