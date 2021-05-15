package pt.ipbeja.po2.boulderdash.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gabriel Gomes
 * @version 15/05/2021
 */
public class GameModelTest {

    @Test
    void checkIsEmpty() {
        AbstractPosition [][] grid = new AbstractPosition[10][10];
        GameModel gameModel = new GameModel(grid);
        FreeTunnel freeTunnel = new FreeTunnel();

        //Inserts in the position 0, 0 a freeTunnel
        gameModel.insertObjectPositionGrid(0, 0, freeTunnel);

        //Checks if method returns null or true or false
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, freeTunnel));
    }

    @Test
    void testeObjectType() {
        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[10][10];
        GameModel gameModel = new GameModel(grid);

        //Crates the objects to be inserted in the grid
        Wall wall = new Wall();
        Rockford rockford = new Rockford();

        gameModel.insertObjectPositionGrid(0, 1, wall);
        gameModel.insertObjectPositionGrid(0, 2, rockford);

        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, rockford));

        if(wall.getObjectType() == 1){
            System.out.println("Objeto Imovel");
        } else
              System.out.println("Objeto Movel");


        if(rockford.getObjectType() == 1){
            System.out.println("Objeto Imovel");
        } else
            System.out.println("Objeto Movel");
    }

    @Test
    void testMovingPositionFree() {
        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[10][10];
        GameModel gameModel = new GameModel(grid);

        //Crates the objects to be inserted in the grid
        Wall wall = new Wall();
        Rockford rockford = new Rockford();
        FreeTunnel freeTunnel = new FreeTunnel();

        //Inserts 2, a rockford, and an emptySpot
        gameModel.insertObjectPositionGrid(0, 0, wall);
        gameModel.insertObjectPositionGrid(0, 1, wall);
        gameModel.insertObjectPositionGrid(0, 2, rockford);
        gameModel.insertObjectPositionGrid(0, 3, freeTunnel);
        gameModel.insertObjectPositionGrid(0, 4, wall);

        //Check if those are correct
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, freeTunnel));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 4, wall));

        //Moves Rockford to the Free Tunnel and the space where Rockford was becomes a Free Tunnel
        //If both objects are movable then they will move
        gameModel.moveObjectPositionGrid(0, 3, rockford);
        gameModel.moveObjectPositionGrid(0, 2, freeTunnel);

        //System.out.println("Super Equals = " + super.equals(rockford));

        //Check if the movement has been done
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, freeTunnel));
    }

    @Test
    void testTryMovingRockfordToOccuppiedPosition() {

        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[10][10];
        GameModel gameModel = new GameModel(grid);

        //Creates the objects wall and rockford
        Wall wall = new Wall();
        Rockford rockford = new Rockford();

        //Inserts the 2 objects in the grid
        gameModel.insertObjectPositionGrid(0, 0, rockford);
        gameModel.insertObjectPositionGrid(0, 1, wall);

        //Checks if the 2 objects are inserted
        assertEquals(true, gameModel.checkObjectPositionGrid(0,0, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));

        //Tries to move the rockford to the wall position
        gameModel.moveObjectPositionGrid(0,1,rockford);

        //Checks that that rockford haven't been moved
        assertEquals(true, gameModel.checkObjectPositionGrid(0,0, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
    }
}
