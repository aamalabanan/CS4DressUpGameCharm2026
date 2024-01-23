/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dressupgame;
import java.util.*;

/**
 *
 * @author macbookair
 */
public class Person {
    protected String name, style;
    protected int age;
    protected int money = 10000;
    protected double size;
    protected ArrayList<Item> inventory = new ArrayList<Item>();
    
    public Person(String n, int a, int m, double s, ArrayList<Item> i) {
        name = n;
        age = a;
        style = null;
        money = m;
        size = s;
        inventory = i;
    }
    
}
