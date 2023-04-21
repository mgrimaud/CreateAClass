public class Face {
    //#region variables
    private int numHairs;
    private boolean hasFreckles;
    private boolean hasWrinkles;
    private boolean hasDimples;
    private boolean hasWidowsPeak;
    private boolean hasCleftChin;
    //#endregion

    //#region constructors
    public Face() {}
    
    public Face(int n) {
        numHairs = n;
    }
    //#endregion

    //#region getters & setters
    public void setNumHairs(int x) {
        numHairs = x;
    }
    public void setFreckles(boolean x) {
        hasFreckles = x;
    }

    public void setWrinkles(boolean x) {
        hasWrinkles = x;
    }

    public void setDimples(boolean x) {
        hasDimples = x;
    }

    public void setWidowsPeak(boolean x) {
        hasWidowsPeak = x;
    }

    public void setCleftChin(boolean x) {
        hasCleftChin = x;
    }

    public int getNumhairs() {
        return numHairs;
    }
    
    public boolean getFreckles() {
        return hasFreckles;
    }

    public boolean getWrinkles() {
        return hasWrinkles;
    }

    public boolean getDimples() {
        return hasDimples;
    }

    public boolean getWidowsPeak() {
        return hasWidowsPeak;
    }

    public boolean getCleftChin() {
        return hasCleftChin;
    }
    //#endregion

}