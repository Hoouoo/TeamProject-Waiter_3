/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DTO;
import DB.LoginDTO;
import static Controller.IntroViewController.okWindow;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author 박성호, 허세진
 */
public class StoreManagerMainViewController implements Initializable{
    
    @FXML
    private Button btn_storemanage;
    @FXML
    private Button btn_servemanage;
    @FXML
    private Button btn_logout;
    @FXML
    private AnchorPane main_stage;
    @FXML
    private AnchorPane sub_stage;
    @FXML
    private AnchorPane third_stage;
    @FXML
    private Label label_name;
    
    LoginDTO db = new LoginDTO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            label_name.setText(db.getname(IntroViewController.getField));
        } catch (SQLException ex) {
            Logger.getLogger(StoreManagerMainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    
        btn_storemanage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
//                System.out.println("OK");
//                Stage stage = (Stage) Smain_stage.getScene().getWindow();
//                Parent sub = null;
                sub_stage.getChildren().remove(third_stage);
               
                
                
                try {
                    
                    third_stage = FXMLLoader.load(getClass().getResource("/fxml/StoreManagerMenuManageView.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(StoreManagerMenuManageViewController.class.getName()).log(Level.SEVERE, null, ex);
                }

                sub_stage.getChildren().add(third_stage);
                // 메인화면에 출력
            }
        });
         
         btn_servemanage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
//                System.out.println("OK");
//                Stage stage = (Stage) Smain_stage.getScene().getWindow();
//                Parent sub = null;
                sub_stage.getChildren().remove(third_stage);
                try {
                    third_stage = FXMLLoader.load(getClass().getResource("/fxml/StoreOrderCheckView.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(StoreOrderCheckViewController.class.getName()).log(Level.SEVERE, null, ex);
                }

                sub_stage.getChildren().add(third_stage);
                // 메인화면에 출력
            }
        });
         
        btn_logout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
                Stage stage = (Stage) btn_logout.getScene().getWindow();
                Parent main = null;
                
                try {
                    main = FXMLLoader.load(getClass().getResource("/fxml/IntroView.fxml"));
                } catch (IOException ex) {
                Logger.getLogger(IntroViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Scene scene = new Scene(main);
                stage.setScene(scene);
                stage.show();

            }
        }
        );
    }
}
