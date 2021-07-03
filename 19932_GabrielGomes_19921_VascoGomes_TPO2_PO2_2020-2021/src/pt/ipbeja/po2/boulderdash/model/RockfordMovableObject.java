package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 03/07/2021
 */
public abstract class RockfordMovableObject extends AbstractPosition{

    //Objects to where the Rockford can move to
    public RockfordMovableObject(int line, int col) {
        super(line, col);
    }
}
