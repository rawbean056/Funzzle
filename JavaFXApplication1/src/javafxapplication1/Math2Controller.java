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
public class Math2Controller implements Initializable {

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
    private Label l2;
    public void changeScreen2(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void back2(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("math_level.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void submit2(ActionEvent event) throws IOException
    {
        if(f1.getText().equals("16")&&f2.getText().equals("16")&&f3.getText().equals("32")&&f4.getText().equals("18")&&f5.getText().equals("14")){
        Parent menuView = FXMLLoader.load(getClass().getResource("math1congo.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
        }
        else 
            l2.setText("TRY AGAIN !!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
