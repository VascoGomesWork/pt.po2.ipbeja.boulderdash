package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public abstract class AbstractPosition {

    private int line;
    private int col;

    public int getLine() {
        return this.line;
    }

    public int getCol() {
        return this.col;
    }

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object o);
}
