package dressupgame;

public class RatingSystem {
    private int starRating;

    public int determineStarRating(int score) {
        if (score <= 100 && score >= 81) {
            return 5;
        } else if (score <= 80 && score >= 61) {
            return 4;
        } else if (score <= 60 && score >= 41) {
            return 3;
        } else if (score <= 40 && score >= 21) {
            return 2;
        } else if (score <= 20 && score >= 1) {
            return 1;
        }
        return 0;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }
}
