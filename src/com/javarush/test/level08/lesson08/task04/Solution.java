package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for (Map.Entry<String, Date> pair: map.entrySet()) {
            System.out.println(pair);
        }
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("MAY 1 1980"));
        map.put("Stallone2", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("MAY 1 1980"));
        map.put("Stallone8", new Date("MAY 1 1980"));
        map.put("Stallone9", new Date("MAY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        /*----- first method --------*/
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        for (; iterator.hasNext();) {
            int month = iterator.next().getValue().getMonth();

            if (month > 4 && month < 8) {
                iterator.remove();
            }
        }
        /*----- /first method --------*/


        /*----- second method --------*/
//        HashMap<String, Date> newMap = new HashMap<>();
//
//        for (Map.Entry<String, Date> pair: map.entrySet()) {
//            Date value = pair.getValue();
//            String key = pair.getKey();
//            int month = value.getMonth();
//
//            if (month < 5 || month > 7) {
//                newMap.put(key, value);
//            }
//        }
//
//        map.clear();
//
//        for (Map.Entry<String, Date> pair: newMap.entrySet()) {
//            Date value = pair.getValue();
//            String key = pair.getKey();
//
//            map.put(key, value);
//        }
        /*----- /second method --------*/
    }
}
