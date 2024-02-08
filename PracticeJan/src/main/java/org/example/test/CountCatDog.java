package org.example.test;

import java.util.HashMap;
import java.util.Map;

public class CountCatDog {


    public static void main(String[] args) {

        String str = "catdogcatdogdog12ca9dog";

        System.out.println(str.contains("cat"));

        Map<String, Integer> mapCount = new HashMap<>();

        for(int i =0; i<str.length()-2; i++) {

            String temp =  str.substring(i, i+3);
            if(temp.equals("cat")) {
                if(mapCount.containsKey("cat")) {
                    mapCount.put("cat", mapCount.get("cat")+1);
                } else mapCount.put("cat", 1);
            }
            if(temp.equals("dog")) {
                if(mapCount.containsKey("dog")) {
                    mapCount.put("dog", mapCount.get("dog")+1);
                } else mapCount.put("dog", 1);
            }
        }

        System.out.println(mapCount.get("cat"));
        System.out.println(mapCount.get("dog"));




    }

   /* public void countWord(Map<String, Integer> map, String word) {
        if(temp.equals("dog")) {
            if(mapCount.containsKey("dog")) {
                mapCount.put("dog", mapCount.get("dog")+1);
            } else mapCount.put("dog", 1);

        }
    }*/
}
