package school.GuessGame;

import java.util.Random;

public class Game {
    private int rewardTries;
    public Grid grid;
    public int triesLeft;
    public int goldenTiles;
    public int guessesMade = 0;
    public int starsFound = 0;
    
    public Game(Grid grid,int goldenTiles) {
        this.grid = grid;
        this.goldenTiles = goldenTiles;
        init();
    }

    public void init() {
        for (int row = 0; row < grid.girdOfTiles.length; row++) {
            for (int col = 0; col < grid.girdOfTiles[row].length; col++) {
               grid.girdOfTiles[row][col] = new Tile();
            }
         }
        int count = 0;
        while(count<goldenTiles) {
            Random random = new Random();
            int x = random.nextInt(grid.size-1);
            int y = random.nextInt(grid.size-1);
            if(!(grid.girdOfTiles[x][y].isGolden())) {
                grid.girdOfTiles[x][y].setGolden(true);
                System.out.println("x:"+x+" y:"+y); //DEBUG
                count++;
            }
        }
        triesLeft = (int) (Math.pow(grid.size, 2))/((int)Math.sqrt(grid.size));
        rewardTries = triesLeft/4;
        if(rewardTries < 1) {
            rewardTries = 1;
        }
    }

    public int tryToHit(int x, int y) {
        if(x<grid.size && y<grid.size && y>0 && x>0){
            if(!(grid.girdOfTiles[x][y].isBroken())){
                if(grid.girdOfTiles[x][y].isGolden()){
                    starsFound++;
                    triesLeft += rewardTries;
                }
                else {
                    triesLeft--;
                }
                guessesMade++;
                return 0;
            }
            return 1;
        }
        return 2;
    }
}
