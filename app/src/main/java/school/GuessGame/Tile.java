package school.GuessGame;

public class Tile {
    private boolean isGolden = false;
    private boolean isBroken = false;

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
        if(isGolden&&isBroken) 
        return " ★";
        if(isBroken) 
        return " ✘";
        return " #";
    }
}
