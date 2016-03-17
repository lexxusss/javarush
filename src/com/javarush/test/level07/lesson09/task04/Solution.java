package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list = fix(list);

        for (String s : list)
            System.out.println(s);
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        /*--- first method ---*/
//        ArrayList<String> fixList = new ArrayList<>();
//
//        for (String s : list)
//            if (s.contains("р") ^ s.contains("л"))
//                for (int i = 0; i < 2 && s.contains("л"); i++)
//                    fixList.add(s);
//            else
//                fixList.add(s);
//
//        return fixList;
        /*--- /first method ---*/

        /*--- second method ---*/
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            for (int j = 0; s.contains("л") && !s.contains("р") && j++ < 1;)
                list.add(++i, s);
            for (int j = 0; s.contains("р") && !s.contains("л") && j++ < 1;)
                list.remove(i--);
        }

        return list;
        /*--- /second method ---*/
    }
}
