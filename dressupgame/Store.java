package dressupgame;
import java.util.*;

public class Store {
    private String name;
    private ArrayList<ClothingItem> availableItems;

    public Store(String n) {
        this.availableItems = new ArrayList<>();
        this.name = n;
        // Initialize available items and their prices
    }

    public void purchaseItem(Person player, ClothingItem item) {
        // Implement the purchase logic
    }

    private void addItemtoStore() {
        availableItems.add(new ClothingItem("Pink wings", "Fairy", "Accessories", 150));
        availableItems.add(new ClothingItem("Brown boots", "Coat", "Shoes", 150));
        availableItems.add(new ClothingItem("White dress", "Wedding", "Dress", 200));
    }

    public void displayAvailableItems() {
        System.out.println("Available items in the store:");
        for (ClothingItem item : availableItems) {
            System.out.println(item.getStyle() + " - Price: " + item.getPrice() + " Pesos");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<ClothingItem> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(ArrayList<ClothingItem> availableItems) {
        this.availableItems = availableItems;
    }
}
