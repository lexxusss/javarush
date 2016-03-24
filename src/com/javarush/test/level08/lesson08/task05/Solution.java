package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;


/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        System.out.println(map);
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Stallone", "Alex");
        map.put("Stallone1", "Alex1");
        map.put("Stallone2", "Alex2");
        map.put("Stallone3", "Alex444");
        map.put("Stallone4", "Alex444");
        map.put("Stallone5", "Alex555");
        map.put("Stallone6", "Alex555");
        map.put("Stallone7", "Alex444");
        map.put("Stallone8", "Alex444");
        map.put("Stallone9", "Alex7");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> map2 = new HashMap<>(map);
        HashMap<String, String> map3 = new HashMap<>(map);

        for (Map.Entry<String, String> pair : map2.entrySet()) {
            map3.remove(pair.getKey());

            if (map3.containsValue(pair.getValue()))
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet())
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
    }
}
