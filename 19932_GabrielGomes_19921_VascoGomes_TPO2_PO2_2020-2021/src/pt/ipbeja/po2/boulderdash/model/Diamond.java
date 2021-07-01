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

    public Diamond(int line, int col) {
        super(line, col);
    }


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
    protected boolean isMovable() {
        return true;
    }

}
