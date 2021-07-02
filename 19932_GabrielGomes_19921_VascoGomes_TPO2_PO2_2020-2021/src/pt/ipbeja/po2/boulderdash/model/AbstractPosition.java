package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public abstract class AbstractPosition {

    private int line;
    private int col;

    public AbstractPosition(int line, int col) {
        this.line = line;
        this.col = col;
    }

    public void setLine(int line){ this.line = line; }

    public void setCol(int col) {this.col = col; }

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

    protected abstract boolean isMovable();

    protected abstract boolean hasScore();

    protected abstract int getScore();

    protected abstract boolean isGate(AbstractPosition[][] grid, int line, int col);
}
