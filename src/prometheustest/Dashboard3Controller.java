/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prometheustest;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author josiah
 */
public class Dashboard3Controller extends ParentDashboardController {

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        
        //Assigns Drag and Drop functionality to trimester containers
        super.establishHandlers();
        super.dashboard2Handlers();
        super.dashboard3Handlers();
        establishToolTip();
        establishToolTip2();
        establishToolTip3();
        progressionWheelArrays();
    }
    
    @Override
    public void initData(UserProfile profile) throws ClassNotFoundException, SQLException{
        currentUser = profile;
        courseTitle.setText(currentUser.getCourse());
        startYear.setText(Integer.toString(currentUser.getStartingYear()));
        secondYear.setText(Integer.toString(currentUser.getStartingYear()+1));
        thirdYear.setText(Integer.toString(currentUser.getStartingYear()+2));
        fourthYear.setText(Integer.toString(currentUser.getStartingYear()+3));
        fifthYear.setText(Integer.toString(currentUser.getStartingYear()+4));
        super.establishList();
    }
    
    @FXML
    @Override
    public void clearTrimesters() throws ClassNotFoundException, SQLException {
       subjectList.getItems().clear();
       trimester1.getItems().clear();
       trimester2.getItems().clear();
       trimester3.getItems().clear();
       trimester4.getItems().clear();
       trimester5.getItems().clear();
       trimester6.getItems().clear();
       trimester7.getItems().clear();
       trimester8.getItems().clear();
       trimester9.getItems().clear();
       trimester10.getItems().clear();
       trimester11.getItems().clear();
       trimester12.getItems().clear();
       trimester13.getItems().clear();
       trimester14.getItems().clear();
       trimester15.getItems().clear();
       temporaryList.clear();
       clearUnitProgress();
       super.establishList();
   }
   
}
