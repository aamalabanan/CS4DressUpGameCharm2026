package dressupgame;

public class Theme {
    private String tag;
    private String hint;

    public Theme(String tag, String hint) {
        this.tag = tag;
        this.hint = hint;
    }

    public boolean matchTheme(ClothingItem item) {
        return this.theme.equalsIgnoreCase(theme);
    }

    public String getTag() {
        return tag;
    }

    public String getHint() {
        return hint;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
