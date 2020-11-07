/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rakin
 */
public class Word3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField f1;
    @FXML
    private TextField f2;
    @FXML
    private TextField f3;
    @FXML
    private TextField f4;
    @FXML
    private TextField f5;
    @FXML
    private TextField f6;
    @FXML
    private TextField f7;
    @FXML
    private TextField f8;
    @FXML
    private Label l1;
    public void changeScreen1(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void back1(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("word_level.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void submit1(ActionEvent event) throws IOException
    {
        if(f1.getText().equals("S")&&f2.getText().equals("S")&&f3.getText().equals("K")&&f4.getText().equals("S")&&f5.getText().equals("R")&&f6.getText().equals("C")&&f7.getText().equals("V")&&f8.getText().equals("R")){
        Parent menuView = FXMLLoader.load(getClass().getResource("math1congo.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
        }
        else 
            l1.setText("TRY AGAIN !!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
