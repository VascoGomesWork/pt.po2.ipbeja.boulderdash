package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class GameModel {

    private AbstractPosition[][] grid;
    private MovableObjects movableObjects;
    private ImovableObjects imovableObjects;
    private Rockford rockford;
    private int nLine;
    private int nCol;

    public GameModel(AbstractPosition[][] grid) {
        this.grid = grid;
        this.nLine = grid.length; //Gets the number lines
        System.out.println("N Lines = " + this.nLine);
        this.nCol = grid[0].length; //Gets the number of cols
        System.out.println("N Col = " + this.nCol);
    }

    /**
     * Resume : Function that inserts in the grid an object
     * Par1 : line
     * Par2 : col
     * Par3 : obj
     */
    public void insertObjectPositionGrid(int line, int col, Object obj){
        this.grid[line][col] = (AbstractPosition) obj;
    }

    public Rockford getRockford() {
        return rockford;
    }

    public Boolean checkObjectPositionGrid(int line, int col, Object obj){
        if (this.grid[line][col].equals(obj)) {
                return true;
        }
        return false;
    }

    public int getNumLines() {
        System.out.println("Num Lines Function = " + this.nLine);
        return this.nLine;
    }

    public int getNumCol(){
        System.out.println("Num cols Function = " + this.nCol);
        return this.nCol;
    }
}
