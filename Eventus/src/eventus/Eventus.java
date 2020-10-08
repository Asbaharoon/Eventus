
package eventus;

import static eventus.DBconnect.resultSet;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;
import javafx.stage.StageStyle;
/**
 *
 * @author Hussein Lenovo
 */
public class Eventus extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        try{
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene scene = new Scene(root);  
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        }catch(IOException e){
            System.err.print(e);
        }
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* DBconnect db = new DBconnect();
        
        DBconnect.connect("eventos");
        */
        launch(args);
    }
    
}
