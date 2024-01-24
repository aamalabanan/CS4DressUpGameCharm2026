package dressupgame;
import java.util.*;

public class ScoreOutfit {
    private ArrayList<ClothingItem> selectedClothes;
    private int score;

    public ScoreOutfit() {
        this.selectedClothes = new ArrayList<>();
        this.score = 0;
    }

    public int calculateScore(Theme theme) {
        int score = 0;
        for (ClothingItem item : outfit.getClothes()) {
            if (theme.matchTheme(item)) {
                score += 15;
            } else {
                score -= 5;
            }
        }
        return Math.max(score, 0);
    }

    public ArrayList<ClothingItem> getSelectedClothes() {
        return selectedClothes;
    }

    public void setSelectedClothes(ArrayList<ClothingItem> selectedClothes) {
        this.selectedClothes = selectedClothes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
