/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dressupgame;

/**
 *
 * @author macbookair
 */
public class DressUpGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person self = new Person("Self");
        ClothingItem item1 = new ClothingItem("Blue ball gown", "Wedding", "Dress", 200);
        Store s = new Store("Store");
        
        ScoreOutfit so = new ScoreOutfit();
        RatingSystem rs = new RatingSystem();
        RoundManager rm = new RoundManager();
        
        self.design();
        self.buy(item1, s);
        self.receiveRate(so, rs);
        self.earn(3);
    }
    
}
