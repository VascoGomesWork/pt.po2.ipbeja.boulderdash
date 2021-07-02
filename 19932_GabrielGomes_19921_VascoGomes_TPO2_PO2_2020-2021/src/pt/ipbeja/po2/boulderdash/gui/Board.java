package pt.ipbeja.po2.boulderdash.gui;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import pt.ipbeja.po2.boulderdash.model.AbstractPosition;
import pt.ipbeja.po2.boulderdash.model.GameModel;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Board extends VBox {

    private static final int SIZE = 3;
    private Button exitButton;
    private BoulderDashButton[][] boardButtons;
    //Array de Array de Objetos da classe AbstractPosition
    AbstractPosition [][] grid = new AbstractPosition[10][10];
    GameModel model;

    public Board() {
        this.model = new GameModel(this.grid);

        this.exitButton = new Button("Exit");

        this.exitButton.setOnMouseClicked(event -> {
            System.out.println("O jogo terminou a execução");
            //this.model.exit();
        });

        this.boardButtons = new BoulderDashButton[SIZE][SIZE];
        GridPane gridPane = this.createBoard();
        this.getChildren().addAll(exitButton);
    }

    private GridPane createBoard() {
        GridPane gridPane = new GridPane();
        for (int line = 0; line < SIZE; line++) {
            for (int col = 0; col < SIZE; col++) {

            }
        }
        return null;
    }
}
