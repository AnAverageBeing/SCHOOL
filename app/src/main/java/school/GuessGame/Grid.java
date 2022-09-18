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
        for (Tile[] tiles : girdOfTiles) {
            for (Tile tile : tiles) {
                sb.append(tile.getChar());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
