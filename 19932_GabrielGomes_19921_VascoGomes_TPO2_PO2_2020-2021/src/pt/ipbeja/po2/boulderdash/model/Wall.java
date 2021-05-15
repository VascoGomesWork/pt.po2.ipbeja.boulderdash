package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Wall extends ImovableObjects {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof Wall)) return false;
        //Wall wall = (Wall) o;
        return false;
    }

    @Override
    public boolean checkImmovableObjects(int line, int col, Object obj) {
        return true;
    }

    @Override
    public void moveObjectPositionGrid(int line, int col, Object obj) {

    }
}
