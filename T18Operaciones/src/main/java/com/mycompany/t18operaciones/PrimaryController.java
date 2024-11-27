package com.mycompany.t18operaciones;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PrimaryController {
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private Label lblR;
    
    @FXML
    public void Suma(ActionEvent event) {
        double n1=Double.parseDouble(txtN1.getText());
        double n2=Double.parseDouble(txtN2.getText());
        lblR.setText(n1+n2+"");
    }
    @FXML
    public void Rest(ActionEvent event) {
        double n1=Double.parseDouble(txtN1.getText());
        double n2=Double.parseDouble(txtN2.getText());
        lblR.setText(n1-n2+"");
    }
    @FXML
    public void Mult(ActionEvent event) {
        double n1=Double.parseDouble(txtN1.getText());
        double n2=Double.parseDouble(txtN2.getText());
        lblR.setText(n1*n2+"");
    }
    @FXML
    public void Divi(ActionEvent event) {
        double n1=Double.parseDouble(txtN1.getText());
        double n2=Double.parseDouble(txtN2.getText());
        lblR.setText(n1/n2+"");
    }
}
