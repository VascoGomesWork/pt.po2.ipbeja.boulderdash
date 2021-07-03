package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Gate extends RockfordMovableObject {

    private GameModel gameModel;

    public Gate(int line, int col) {
        super(line, col);
    }

    @Override
    protected boolean hasScore() {
        return true;
    }

    @Override
    protected int getScore() {
        return 0;
    }

    @Override
    protected boolean isGate(AbstractPosition[][] grid, int line, int col) {
        return true;
    }

    @Override
    protected void moveObjectUnder(int line, int col) {

    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof Gate)) return false;
        return false;
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

}
