package dressupgame;
import java.util.*;

public class Person {
    private String name;
    private int money;
    private ArrayList<ClothingItem> ownedItems = new ArrayList<>();
    private int currentRound;
    private int totalRoundsPlayed;
    private String newReward, reward;

    public Person(String name) {
        this.name = name;
        this.money = 1000;
        this.ownedItems = new ArrayList<>();
        this.currentRound = 1;
        this.totalRoundsPlayed = 0;
        this.newReward = reward;
    }

    public void design() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Design your outfit by choosing items (Enter 'done' when finished):");

        while (true) {
            System.out.print("Enter the style of the item: ");
            String style = scanner.nextLine();

            if (style.equalsIgnoreCase("done")) {
                break;
            }

            // Find the item with the entered style
            ClothingItem selectedItem = findItemByStyle(style);

            if (selectedItem != null) {
                designedOutfit.add(selectedItem);
                System.out.println("Added " + selectedItem.getStyle() + " to the outfit.");
            } else {
                System.out.println("Item not found. Please choose a valid style.");
            }
        }
    }
    public void buy(ClothingItem item, Store store) {
        if (!item.isOwned() && money >= item.getPrice()) {
            money -= item.getPrice();
            ownedItems.add(item);
            item.setOwned(true);
            System.out.println("You bought a new item: " + item.getStyle());
        }
    }
    public void receiveRate(ScoreOutfit scoreOutfit, RatingSystem ratingSystem) {
        scoreOutfit = new ScoreOutfit(outfit, theme);
        int score = scoreOutfit.calculateScore();
        int stars = RatingSystem.determineStarRating(score);

        System.out.println("Outfit Score: " + score);
        System.out.println("Rating: " + stars + " stars");

        earnMoney(stars);
    }
    public void earn(int stars) {
        switch (stars) {
            case 5:
                money += 500;
                break;
            case 4:
                money += 400;
                break;
            case 3:
                money += 300;
                break;
            case 2:
                money += 200;
                break;
            case 1:
                money += 100;
                break;
        }
        System.out.println("Earned Money: " + money + " Pesos");
    }

    public void getreward(RoundManager roundManager) {
        if (roundManager.getRating() == 5) {
            ClothingItem newReward = roundManager.reward(this);
            if (newReward != null) {
                System.out.println("Congratulations! You received a new item: " + newReward.getStyle());
                ownedItems.add(newReward);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<ClothingItem> getOwnedItems() {
        return ownedItems;
    }

    public void setOwnedItems(ArrayList<ClothingItem> ownedItems) {
        this.ownedItems = ownedItems;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public int getTotalRoundsPlayed() {
        return totalRoundsPlayed;
    }

    public void setTotalRoundsPlayed(int totalRoundsPlayed) {
        this.totalRoundsPlayed = totalRoundsPlayed;
    }
}
