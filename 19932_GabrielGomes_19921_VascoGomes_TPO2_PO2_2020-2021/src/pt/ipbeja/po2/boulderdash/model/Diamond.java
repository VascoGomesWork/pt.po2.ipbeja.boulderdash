package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Diamond extends MovableObjects {

    private GameModel gameModel;
    private int time;
    private int fallDirection;
    private int gravitySpeed;


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(! (o instanceof Diamond)) return false;
        return false;
    }

    @Override
    public void moveObjectPositionGrid(int line, int col, Object obj) {
        //Checks if it does not have another object already there
        if (gameModel.checkObjectPositionGrid(line, col, obj) || checkMovableObjects(line, col, obj)) {
            //If it is free then moves
            gameModel.insertObjectPositionGrid(line, col, obj);
        }
    }

    @Override
    public boolean checkMovableObjects(int line, int col, Object obj) {
        return false;
    }
}
