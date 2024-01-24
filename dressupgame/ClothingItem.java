package dressupgame;
public class ClothingItem {
    private String name, style, type;
    private int price;
    private boolean owned;

    public ClothingItem(String n, String s, String t, int p) {
        this.name = n;
        this.style = s;
        this.type = t;
        this.price = p;
        this.owned = false;
    }
    
    public String getName() {
        return name;
    }
    public String getStyle() {
        return style;
    }   
    public String getType() {
        return type;
    }
    public int getPrice() {
        return price;
    }
    
    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }
    
}
