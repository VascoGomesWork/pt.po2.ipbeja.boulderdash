package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class GameModel {

    private AbstractPosition[][] grid;
    private MovableObjects movableObjects;
    private ImovableObjects imovableObjects;

    public GameModel(AbstractPosition[][] grid) {
        this.grid = grid;
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

    public Boolean checkObjectPositionGrid(int line, int col, Object obj){
        if (this.grid[line][col].equals(obj)) {
                return true;
        }
        return false;
    }

    //Perguntar se os movimentos do rockford devem estar na class rockford
    public void moveObjectPositionGrid(int line, int col, Object obj){

        //Checks if there is a movable object in the position
        if(obj.equals(movableObjects)){
            //If it is free then moves
            insertObjectPositionGrid(line, col, obj);
        }

        System.out.println(obj.equals(movableObjects));
    }

}
