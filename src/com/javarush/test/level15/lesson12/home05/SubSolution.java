package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Alex on 07.05.2016.
 */
public class SubSolution extends Solution {
    SubSolution(int val) {
        super(val);
    }
    SubSolution(int val, String name) {
        super(val, name);
    }
    SubSolution(String name, int val) {
        super(name, val);
    }

    protected SubSolution(String name, String val) {
        super(name, val);
    }
    protected SubSolution(String name, String val, String val1) {
        super(name, val, val1);
    }
    protected SubSolution(String name, String val, String val1, String val2) {
        super(name, val, val1, val2);
    }

    public SubSolution() {
    }
    public SubSolution(int val, int val1) {
        super(val, val1);
    }
    public SubSolution(int val, int val1, int val2) {
        super(val, val1, val2);
    }

    private SubSolution(int val, int val1, String name) {}
    private SubSolution(String name, int val, int val1) {}
    private SubSolution(int val, int val1, int val2, String name) {}
}
