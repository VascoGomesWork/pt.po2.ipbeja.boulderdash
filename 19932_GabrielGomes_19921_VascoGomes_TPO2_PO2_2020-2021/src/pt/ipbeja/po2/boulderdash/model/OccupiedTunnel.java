package pt.ipbeja.po2.boulderdash.model;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class OccupiedTunnel extends ImovableObjects {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof OccupiedTunnel)) return false;
        return false;
    }

    @Override
    public boolean checkImmovableObjects(int line, int col, Object obj) {
        return false;
    }

    @Override
    public void moveObjectPositionGrid(int line, int col, Object obj) {

    }

}
