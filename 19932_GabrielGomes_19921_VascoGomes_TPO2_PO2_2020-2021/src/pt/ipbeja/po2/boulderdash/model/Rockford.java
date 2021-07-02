package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Rockford extends MovableObjects {
    private static Rockford instance = null;
    AbstractPosition abstractPosition;
    MovableObjects movableObjects;
    private GameModel gameModel;
    private int score = 0;

    public Rockford(int line, int col) {
        super(line, col);
        this.score = 0;
    }


    public void moveObjectPositionGrid(int line, int col, AbstractPosition[][] grid, GameModel gameModel) {
        //Checks if it is inside of bouderies
        if (line <= gameModel.getNumLines() && col <= gameModel.getNumCol()) {
            if (grid[line][col].isMovable()) {
                if(grid[line][col].hasScore()){
                    addsScore(grid, line, col);
                }
                //Gets the rockford position before moving
                //Updates the grid positions and the freeTunnel positions
                grid[this.getLine()][this.getCol()] = new FreeTunnel(this.getLine(), this.getCol());
                grid[line][col] = this;

                this.setLine(line);
                this.setCol(col);
            }
        } else {
            System.out.println("Posição nao existe");
        }
    }

    private void addsScore(AbstractPosition[][] grid, int line, int col) {
        System.out.println("Object in position = " + grid[line][col] + " score = " + grid[line][col].getScore());
        this.score += grid[line][col].getScore();
    }

    @Override
    protected boolean isMovable() {
        return true;
    }

    @Override
    protected boolean hasScore() {
        return true;
    }

    public static Rockford getInstance(int line, int col) {
        if (instance == null) {
            instance = new Rockford(line, col);
        }
        return instance;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rockford)) return false;
        return false;
    }

    public int getScore() {
        return this.score;
    }
}
