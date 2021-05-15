package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public abstract class ImovableObjects extends AbstractPosition implements ObjectType{

    private final static int objectType = 1;

    public ImovableObjects() {
        super();
    }

    public abstract boolean checkImmovableObjects(int line, int col, Object obj);

    public abstract void moveObjectPositionGrid(int line, int col, Object obj);

    public int getObjectType() {
        return this.objectType;
    }
}
