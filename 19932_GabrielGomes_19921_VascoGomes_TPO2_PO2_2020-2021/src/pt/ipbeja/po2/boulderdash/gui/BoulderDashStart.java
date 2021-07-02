package pt.ipbeja.po2.boulderdash.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Vasco Gomes 19921
 * @date 02/07/2021
 */
public class BoulderDashStart extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Board board = new Board();
        Scene scene = new Scene(board);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
