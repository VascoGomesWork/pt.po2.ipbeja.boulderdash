package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public abstract class MovableObjects extends AbstractPosition implements ObjectType{

    private final static int objectType = 0;

    public MovableObjects() {
        super();
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof MovableObjects)) return false;
        return false;
    }

    //Perguntar se os movimentos do rockford devem estar na class rockford
    public abstract void moveObjectPositionGrid(int line, int col, Object obj);

    public abstract boolean checkMovableObjects(int line, int col, Object obj);

    public int getObjectType() {
        return this.objectType;
    }
}