package dressupgame;
import java.util.*;

public class Store {
    private ArrayList<ClothingItem> availableItems;

    public Store() {
        this.availableItems = new ArrayList<>();
        // Initialize available items and their prices
    }

    public void purchaseItem(Person player, ClothingItem item) {
        // Implement the purchase logic
    }

    private void additemtoStore() {
        availableItems.add(new ClothingItem("Pink wings", "Fairy", 150));
        availableItems.add(new ClothingItem("Brown boots", "Coat", 150));
        availableItems.add(new ClothingItem("White dress", "Wedding", 200));
    }

    public void displayAvailableItems() {
        System.out.println("Available items in the store:");
        for (ClothingItem item : availableItems) {
            System.out.println(item.getStyle() + " - Price: " + item.getPrice() + " Pesos");
        }
    }

    public ArrayList<ClothingItem> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(ArrayList<ClothingItem> availableItems) {
        this.availableItems = availableItems;
    }
}
