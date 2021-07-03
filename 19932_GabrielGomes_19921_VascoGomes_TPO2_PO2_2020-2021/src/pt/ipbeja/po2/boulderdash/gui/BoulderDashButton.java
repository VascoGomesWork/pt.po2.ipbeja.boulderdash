package pt.ipbeja.po2.boulderdash.gui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * @author Vasco Gomes 19921
 * @date 02/07/2021
 */
public class BoulderDashButton extends Button {

    private ImageView imageView;

    public BoulderDashButton() {
        this.imageView = new ImageView(new Image("/res/wall.JPG"));
        this.setGraphic(this.imageView);
    }
}
