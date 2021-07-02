package pt.ipbeja.po2.boulderdash.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gabriel Gomes
 * @version 15/05/2021
 */
public class GameModelTest {

    @Test
    void test1MovingPositionFree() {
        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[1][4];
        GameModel gameModel = new GameModel(grid);

        //Creates the objects to be inserted in the grid
        Wall wall = new Wall(0, 0);
        Rockford rockford = new Rockford(0, 1);
        FreeTunnel freeTunnel = new FreeTunnel(0, 2);
        Wall wall1 = new Wall(0, 3);

        //Inserts the objects in the grid
        gameModel.insertObjectPositionGrid(0,0, wall);
        gameModel.insertObjectPositionGrid(0,1, rockford);
        gameModel.insertObjectPositionGrid(0,2, freeTunnel);
        gameModel.insertObjectPositionGrid(0,3, wall1);

        //Check if those are correct
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, freeTunnel));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, wall1));

        //Moves Rockford to the Free Tunnel and the space where Rockford was becomes a Free Tunnel
        rockford.moveObjectPositionGrid(0, 2, grid, gameModel);

        //Check if the movement has been done
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, rockford));
    }

    @Test
    void test2TryMovingRockfordToOccuppiedPosition() {

        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[1][4];
        GameModel gameModel = new GameModel(grid);

        //Creates the objects to be inserted in the grid
        Wall wall = new Wall(0, 0);
        Rockford rockford = new Rockford(0, 1);
        FreeTunnel freeTunnel = new FreeTunnel(0, 2);
        Wall wall1 = new Wall(0, 3);

        //Inserts the objects in the grid
        gameModel.insertObjectPositionGrid(0,0, wall);
        gameModel.insertObjectPositionGrid(0,1, rockford);
        gameModel.insertObjectPositionGrid(0,2, freeTunnel);
        gameModel.insertObjectPositionGrid(0,3, wall1);

        //Check if those are correct
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, freeTunnel));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, wall1));

        //Moves Rockford to the Free Tunnel and the space where Rockford was becomes a Free Tunnel
        rockford.moveObjectPositionGrid(0, 0, grid, gameModel);

        //Check if the movement has been done
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
    }

    @Test
    void test3TryMovingRockfordToRock(){
        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[1][4];
        GameModel gameModel = new GameModel(grid);

        //Creates the objects to be inserted in the grid
        Wall wall = new Wall(0, 0);
        Rockford rockford = new Rockford(0, 1);
        FreeTunnel freeTunnel = new FreeTunnel(0, 2);
        Rock rock = new Rock(0, 3);

        //Inserts the objects in the grid
        gameModel.insertObjectPositionGrid(0,0, wall);
        gameModel.insertObjectPositionGrid(0,1, rockford);
        gameModel.insertObjectPositionGrid(0,2, freeTunnel);
        gameModel.insertObjectPositionGrid(0,3, rock);

        //Check if those are correct
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, freeTunnel));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, rock));

        //Moves Rockford to the Free Tunnel and the space where Rockford was becomes a Free Tunnel
        rockford.moveObjectPositionGrid(0, 3, grid, gameModel);

        //Check if the movement has been done
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, rock));
    }

    @Test
    void test4MakeRockfordCatchDiamond() {
        //Array de Array de Objetos da classe AbstractPosition
        AbstractPosition [][] grid = new AbstractPosition[1][4];
        GameModel gameModel = new GameModel(grid);

        //Creates the objects to be inserted in the grid
        Wall wall = new Wall(0, 0);
        Rockford rockford = new Rockford(0, 1);
        Diamond diamond = new Diamond(0, 2, 10);
        Rock rock = new Rock(0, 3);

        //Inserts the objects in the grid
        gameModel.insertObjectPositionGrid(0,0, wall);
        gameModel.insertObjectPositionGrid(0,1, rockford);
        gameModel.insertObjectPositionGrid(0,2, diamond);
        gameModel.insertObjectPositionGrid(0,3, rock);

        //Check if those are correct
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 0, wall));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 1, rockford));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, diamond));
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 3, rock));

        //Moves Rockford to the Free Tunnel and the space where Rockford was becomes a Free Tunnel
        rockford.moveObjectPositionGrid(0, 2, grid, gameModel);

        //Check if the movement has been done
        assertEquals(true, gameModel.checkObjectPositionGrid(0, 2, rockford));
        //Check if the score has rised
        assertEquals(10, rockford.getScore());
    }

    @Test
    void test5RockfordDiamond() {
        
    }

    @Test
    void test6RockfordPassesGate() {
        System.out.println();
    }
}
