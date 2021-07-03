package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class FreeTunnel extends RockfordMovableObject {


    public FreeTunnel(int line, int col) {
        super(line, col);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(! (o instanceof FreeTunnel)) return false;
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
        return true;
    }

    @Override
    protected boolean hasScore() {
        return false;
    }

    @Override
    protected int getScore() {
        return 0;
    }

    @Override
    protected boolean isGate(AbstractPosition[][] grid, int line, int col) {
        return false;
    }

    @Override
    protected void moveObjectUnder(int line, int col) {

    }

}
