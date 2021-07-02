package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Rock extends ImovableObjects {

    public Rock(int line, int col) {
        super(line, col);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(! (o instanceof Rock)) return false;
        return false;
    }

    @Override
    protected boolean isMovable() {
        return false;
    }

    @Override
    protected boolean hasScore() {
        return false;
    }

    @Override
    protected int getScore() {
        return 0;
    }

}
