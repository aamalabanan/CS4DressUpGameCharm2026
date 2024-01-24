package dressupgame;
import java.util.*;

public class RoundManager {
    private int numRoundsPlayed;
    private int starRating;
    private ArrayList<ClothingItem> rewardItems;

    public RoundManager() {
        this.numRoundsPlayed = 0;
        this.rewardItems = new ArrayList<>();
        // Initialize reward items
    }

    public ClothingItem reward(Person player) {
        if (starRating == 5) {
            ClothingItem rewardItem= getRandomReward();
            player.receiveReward(player.newReward);
            return player.newReward;
        }
        return null;
    }

    private ClothingItem getRandomReward() {
        // This could be a predefined list of possible items
        ClothingItem[] possibleRewards = {
            new ClothingItem("Pink wings", "Fairy", "Accessories", 150),
            new ClothingItem("Brown boots", "Coat", "Shoes", 150),
            new ClothingItem("Denim shorts", "Summer", "Bottoms", 200)
        };

        int randomIndex = new Random().nextInt(possibleRewards.length);

        return possibleRewards[randomIndex];
    }
    
    public int getRating() {
        return starRating;
    }

    public int getNumRoundsPlayed() {
        return numRoundsPlayed;
    }

    public void setNumRoundsPlayed(int numRoundsPlayed) {
        this.numRoundsPlayed = numRoundsPlayed;
    }

    public ArrayList<ClothingItem> getRewardItems() {
        return rewardItems;
    }

    public void setRewardItems(ArrayList<ClothingItem> rewardItems) {
        this.rewardItems = rewardItems;
    }
}
