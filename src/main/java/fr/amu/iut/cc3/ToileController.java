package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;
    @FXML
    private TextField com1 = new TextField();
    @FXML
    private Circle com1Circle = new Circle();
    @FXML
    private TextField com2 = new TextField();
    @FXML
    private Circle com2Circle = new Circle();
    @FXML
    private TextField com3 = new TextField();
    @FXML
    private Circle com3Circle = new Circle();
    @FXML
    private TextField com4 = new TextField();
    @FXML
    private Circle com4Circle = new Circle();
    @FXML
    private TextField com5 = new TextField();
    @FXML
    private Circle com5Circle = new Circle();
    @FXML
    private TextField com6 = new TextField();
    @FXML
    private Circle com6Circle = new Circle();
    @FXML
    private Label err1 = new Label();
    @FXML
    private Label err2 = new Label();
    @FXML
    private Line line1 = new Line();

    private int com1CircleCenterX;

    @FXML
    private void ActionTextField() {
        int com1Int = Integer.parseInt(com1.getText());
        if (com1Int >= 0 && com1Int <= 20) {
            com1Circle.setCenterX(getXRadarChart(com1Int, 1));
            com1Circle.setCenterY(getYRadarChart(com1Int, 1));
            com1Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
        int com2Int = Integer.parseInt(com2.getText());
        if (com2Int >= 0 && com2Int <= 20) {
            com2Circle.setCenterX(getXRadarChart(com1Int, 2));
            com2Circle.setCenterY(getYRadarChart(com1Int, 2));
            com2Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
        int com3Int = Integer.parseInt(com3.getText());
        if (com3Int >= 0 && com3Int <= 20) {
            com3Circle.setCenterX(getXRadarChart(com3Int, 3));
            com3Circle.setCenterY(getYRadarChart(com3Int, 3));
            com3Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
        int com4Int = Integer.parseInt(com4.getText());
        if (com4Int >= 0 && com4Int <= 20) {
            com4Circle.setCenterX(getXRadarChart(com4Int, 4));
            com4Circle.setCenterY(getYRadarChart(com4Int, 4));
            com4Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
        int com5Int = Integer.parseInt(com5.getText());
        if (com5Int >= 0 && com5Int <= 20) {
            com5Circle.setCenterX(getXRadarChart(com5Int, 5));
            com5Circle.setCenterY(getYRadarChart(com5Int, 5));
            com5Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
        int com6Int = Integer.parseInt(com6.getText());
        if (com6Int >= 0 && com6Int <= 20) {
            com6Circle.setCenterX(getXRadarChart(com6Int, 6));
            com6Circle.setCenterY(getYRadarChart(com6Int, 6));
            com6Circle.setVisible(true);
        }
        else {
            err1.setVisible(true);
            err2.setVisible(true);
        }
    }
    @FXML
    private void ClickVider(){
        com1.setText("");
        com2.setText("");
        com3.setText("");
        com4.setText("");
        com5.setText("");
        com6.setText("");
        err1.setVisible(false);
        err2.setVisible(false);
    }

    @FXML
    private void ClickTracer(){
        Circle [] TabPoint = {com1Circle, com2Circle, com3Circle, com4Circle, com5Circle, com6Circle};
        for(int i = 0; i<4; ++i){
            //line1.setStartX(TabPoint[i+1].getCenterX());
            //line1.setStartY(TabPoint[i].getCenterY());
            //line1.setEndX(TabPoint[i].getCenterX());
            //line1.setEndY(TabPoint[i].getCenterY());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

}
