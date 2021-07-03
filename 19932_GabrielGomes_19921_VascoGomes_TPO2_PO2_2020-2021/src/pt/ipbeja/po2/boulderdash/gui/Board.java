package pt.ipbeja.po2.boulderdash.gui;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pt.ipbeja.po2.boulderdash.model.AbstractPosition;
import pt.ipbeja.po2.boulderdash.model.GameModel;

import java.io.File;
import java.io.IOException;

/**
 * @author Vasco Gomes 19921
 * @date 15/05/2021
 */
public class Board extends VBox {

    private static final int SIZE = 10;
    private Button exitButton;
    private BoulderDashButton[][] boardButtons;
    Menu fileMenu = new Menu("File");
    MenuItem openItem = new MenuItem("Open");
    //Array de Array de Objetos da classe AbstractPosition
    AbstractPosition [][] grid = new AbstractPosition[SIZE][SIZE];
    GameModel model;

    public Board() {
        this.model = new GameModel(this.grid);

        this.exitButton = new Button("Exit");

        this.exitButton.setOnMouseClicked(event -> {
            System.out.println("O jogo terminou a execução");
            //this.model.exit();
        });

        //this.openItem.setOnAction(event -> readFile(primaryStage));

        this.boardButtons = new BoulderDashButton[SIZE][SIZE];
        GridPane gridPane = this.createBoard();
        this.getChildren().addAll(gridPane, exitButton);
    }

    private void readFile(Stage primaryStage){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escolha um ficheiro de texto");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectFile = fileChooser.showOpenDialog(primaryStage);
        if(selectFile != null){
            try{
                System.out.println("File Readed");
                //model.readFile(selectedFile)
            }
            catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Error Reading File!");
                alert.showAndWait();
            }
        }
    }

    private GridPane createBoard() {
        GridPane gridPane = new GridPane();
        for (int line = 0; line < SIZE; line++) {
            for (int col = 0; col < SIZE; col++) {
                BoulderDashButton boulderDashButton = new BoulderDashButton();
                gridPane.add(boulderDashButton, col, line);
                boardButtons[line][col] = boulderDashButton;
            }
        }
        return gridPane;
    }
}
