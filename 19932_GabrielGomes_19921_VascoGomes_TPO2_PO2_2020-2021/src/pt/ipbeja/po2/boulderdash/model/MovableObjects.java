package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public abstract class MovableObjects extends AbstractPosition{

    //private final static int objectType = 0;

    public MovableObjects(int line, int col) {
        super(line, col);
    }

    /*public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof MovableObjects)) return false;
        return false;
    }*/
}