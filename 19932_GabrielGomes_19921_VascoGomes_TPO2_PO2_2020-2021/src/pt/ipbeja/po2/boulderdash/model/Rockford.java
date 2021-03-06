package pt.ipbeja.po2.boulderdash.model;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Rockford extends AbstractPosition {
    private static Rockford instance = null;
    AbstractPosition abstractPosition;
    MovableObjects movableObjects;
    private GameModel gameModel;
    private int score = 0;

    public Rockford(int line, int col) {
        super(line, col);
        this.score = 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }


    public void moveObjectPositionGrid(int line, int col, AbstractPosition[][] grid, GameModel gameModel) {
        //Checks if it is inside of bouderies
        if (line <= gameModel.getNumLines() && col <= gameModel.getNumCol()) {
            if (grid[line][col].isRockfordMovableTo() || grid[line][col].isMovable()) {

                //Check if the Rockford moved to the gate
                if(grid[line][col].hasScore()){
                    addsScore(grid, line, col);
                }

                //Check if position is a gate
                if (grid[line][col].isGate(grid, line, col)){
                    System.out.println("Rockford passed the gate! Game finished!");
                }

                System.out.println("Line = " + (line - 1));
                System.out.println("Col = " + col);

                //Check if the position (line - 1) exists
                //It only matters to verify the lines because the objects only fall on the vertical
                if((gameModel.positionExists((line - 1), col)) || gameModel.positionExists((line + 1), col)) {
                    //Check if Rockford moved to the position under the diamond
                    if((grid[(line - 1)][col].isMovable()) || (grid[(line + 1)][col].isMovable())) {
                        System.out.println("Move the diamond");
                        //TODO: Call diamond method make it fall
                        grid[line - 1][col].moveObjectUnder(line, col);
                    }
                }

                //Gets the rockford position before moving
                //Updates the grid positions and the freeTunnel positions
                grid[this.getLine()][this.getCol()] = new FreeTunnel(this.getLine(), this.getCol());
                grid[line][col] = this;

                this.setLine(line);
                this.setCol(col);
            }
        } else {
            System.out.println("Posi????o nao existe");
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
    protected boolean isDiamond() {
        return false;
    }

    @Override
    protected boolean isRockfordMovableTo() {
        return false;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rockford)) return false;
        return false;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    protected boolean isGate(AbstractPosition[][] grid, int line, int col) {
        return false;
    }

    @Override
    protected void moveObjectUnder(int line, int col) {

    }
}
