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
public class Item {
    protected String name, style, demographic;
    protected int cost, popularityRating;
    
    protected ArrayList<Item> items = new ArrayList<Item>();
    protected ArrayList<Item> rewards = new ArrayList<Item>();
    
    public Item(String n, int c, String s, String d) {
        name = n;
        cost = c;
        style = s;
        demographic = d;
        popularityRating = 0;
    }
}
