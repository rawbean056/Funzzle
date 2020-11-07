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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author merin
 */
public class Math_levelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public void changeScreen1(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("math1.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void changeScreen2(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("math2.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void changeScreen3(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("math3.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    public void changeScreenHome(ActionEvent event) throws IOException
    {
        Parent menuView = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuViewScene = new Scene(menuView);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(menuViewScene);
         window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
