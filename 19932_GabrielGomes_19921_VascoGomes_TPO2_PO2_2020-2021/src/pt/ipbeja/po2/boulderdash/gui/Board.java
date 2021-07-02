package pt.ipbeja.po2.boulderdash.gui;

import pt.ipbeja.po2.boulderdash.model.AbstractPosition;
import pt.ipbeja.po2.boulderdash.model.GameModel;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Board {
    //UM TESTE



    //Array de Array de Objetos da classe AbstractPosition
    AbstractPosition [][] grid = new AbstractPosition[10][10];
    GameModel model;

    public Board(GameModel model) {
        this.model = new GameModel(this.grid);

    }
}
