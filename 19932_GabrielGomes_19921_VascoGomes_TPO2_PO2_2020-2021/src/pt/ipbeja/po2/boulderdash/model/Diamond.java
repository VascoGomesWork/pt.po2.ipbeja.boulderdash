package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Diamond extends MovableObjects {

    private GameModel gameModel;
    private int time;
    private int score;
    private int fallDirection;
    private int gravitySpeed;

    public Diamond(int line, int col, int score) {
        super(line, col);
        this.score = score;
    }

    @Override
    protected boolean hasScore() {
        return true;
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

    @Override
    protected boolean isDiamond() {
        return true;
    }

    @Override
    protected boolean isRockfordMovableTo() {
        return true;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    protected boolean isGate(AbstractPosition[][] grid, int line, int col) {
        return false;
    }

    protected void moveObjectUnder(int diamondAtualLine, int diamondAtualCol) {
        FreeTunnel freeTunnel = new FreeTunnel(diamondAtualLine, diamondAtualCol);

        gameModel.insertObjectPositionGrid(diamondAtualLine + 1,1, this);
        gameModel.insertObjectPositionGrid(diamondAtualLine, diamondAtualCol, freeTunnel);
    }

}
