package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution(int val) {}
    Solution(int val, String name) {}
    Solution(String name, int val) {}

    protected Solution(String name, String val) {}
    protected Solution(String name, String val, String val1) {}
    protected Solution(String name, String val, String val1, String val2) {}

    public Solution() {}
    public Solution(int val, int val1) {}
    public Solution(int val, int val1, int val2) {}

    private Solution(int val, int val1, String name) {}
    private Solution(String name, int val, int val1) {}
    private Solution(int val, int val1, int val2, String name) {}
}

