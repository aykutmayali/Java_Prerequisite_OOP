package oop_lecture29;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        HashMap<String,String> dictionary=new HashMap<String,String>();
       // TreeMap<String,String> dictionary=new HashMap<String,String>();
        dictionary.put("1","bir");
        dictionary.put("2","iki");
        dictionary.put("3","üç");
        dictionary.put("4","dört");
        dictionary.put("2","binbeş");

        for (String word:dictionary.keySet()) {
            System.out.println(dictionary.get(word));
        }

        for (String word:dictionary.values()) {
            System.out.println(dictionary.get(word));
        }

        for (Map.Entry<String,String> entry: dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
