package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Rockford  extends MovableObjects {
    private static Rockford instance = null;
    private GameModel gameModel;
    private int score = 0;

    public static Rockford getInstance(){
        if(instance == null){
            instance = new Rockford();
        }
        return instance;
    }

    //Perguntar se os movimentos do rockford devem estar na class rockford
    /*public void moveObjectPositionGrid(int line, int col, Object obj){
        //Checks if it does not have another object already there
        if(gameModel.checkObjectPositionGrid(line, col, obj) /*&& movableObjects.equals(obj)){
            //If it is free then moves
            //gameModel.insertObjectPositionGrid(line, col, obj);
        //}
    }*/

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(! (o instanceof Rockford)) return false;
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
        return true;
    }
}
