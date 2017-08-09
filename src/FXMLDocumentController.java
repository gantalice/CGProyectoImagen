/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author jose.manrique
 */
public class FXMLDocumentController implements Initializable {

    LinkedList<String> Image_LOCS;

    @FXML
    private Label label;

    private int cont;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Image_LOCS = new LinkedList<>();
        CargarImagenes();

        Image image = new Image(Main.class.getResourceAsStream("/imagen/Hinanawi.Tenshi.jpg"));

        label.setGraphic(new ImageView(image));
        ImageView imageview = new ImageView();
        Iterator<String> ImIterator = Image_LOCS.iterator();
        tranImagen();

    }

    

    public void CargarImagenes() {
        Image_LOCS.add("/imagen/Hinanawi.Tenshi.jpg");
        Image_LOCS.add("/imagen/CatGirl.png");
        Image_LOCS.add("/imagen/Lalafell.png");
        Image_LOCS.add("/imagen/Remilia.jpg");
        Image_LOCS.add("/imagen/Kobayashi.jpg");
        Image_LOCS.add("/imagen/Arale.jpg");
        Image_LOCS.add("/imagen/Witch.jpg");
    }
    
    public void tranImagen() {

        Timeline time = new Timeline(new KeyFrame(Duration.seconds(2),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(0)))
        ));
        time.play();

        Timeline time2 = new Timeline(new KeyFrame(
                Duration.seconds(2),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(1)))));

        time2.play();

        Timeline time3 = new Timeline(new KeyFrame(Duration.seconds(6),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(2)))
        ));
        time3.play();

        Timeline time4 = new Timeline(new KeyFrame(Duration.seconds(10),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(3)))));

        time4.play();
        
        Timeline time5 = new Timeline(new KeyFrame(Duration.seconds(15),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(4)))));

        time5.play();
        
        Timeline time6 = new Timeline(new KeyFrame(Duration.seconds(20),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(5)))));

        time6.play();
        
        Timeline time7 = new Timeline(new KeyFrame(Duration.seconds(25),
                ae
                -> label.setGraphic(new ImageView(Image_LOCS.get(6)))));

        time7.play();

    }

}
