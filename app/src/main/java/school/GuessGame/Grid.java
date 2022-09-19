package school.GuessGame;

public class Grid {
    public int size;
    public Tile[][] girdOfTiles;

    public Grid(int size) {
        this.size = size;
        girdOfTiles = new Tile[size][size];
    }

    public void printGrid() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for(int i = 0 ; i < size ; i++){
            sb.append(" "+i);
        }
        sb.append("\n");
        int i = 0;
        for (Tile[] tiles : girdOfTiles) {
            sb.append(i);
            for (Tile tile : tiles) {
                sb.append(tile.getChar());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
