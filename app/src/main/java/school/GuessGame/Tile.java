package school.GuessGame;

public class Tile {
    private boolean isGolden = false;
    private boolean isBroken = false;
    private String displayChar = " #";

    public void setGolden(boolean x) {
        isGolden = x;
    }
    
    public void setBroken(boolean x) {
        isBroken = x;
    }

    public boolean isGolden() {
        return isGolden;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public String getChar(){
        return displayChar;
    }

    public void setChat(int x) {
        if(x == 0) {
            displayChar = " #";
        }
        if(x == 1) {
            displayChar = " ✘";
        }
        if(x == 2) {
            displayChar = " ★";
        }
    }
}
