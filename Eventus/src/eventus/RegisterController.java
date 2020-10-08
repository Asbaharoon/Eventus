/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import models.User;

/**
 * FXML Controller class
 *
 * @author Hussein Basha
 */
public class RegisterController implements Initializable {

    /*
    *   variables declare
    **/
    String Username;
    String FirstName;
    String LastName;
    String Nationality;
    String Password;
    String DateOfBirth;
    String eMail;
    String Gender;
    
    
    
    @FXML
    private PasswordField cpassword;

    @FXML
    private Button registerbutton;

    @FXML
    private TextField username;

    @FXML
    private TextField lastname;
    
    @FXML
    private DatePicker dateofbirth;

    @FXML
    private PasswordField password;

    @FXML
    private TextField firstname;

    @FXML
    private TextField Email;

    @FXML
    private ComboBox<?> nationality;
    @FXML
     AnchorPane anchor;
    //X and Y are variables used in draggable fuction as Offset
    double x =0 , y =0 ;
    @FXML
    private ChoiceBox nat;
    
    @FXML
    private ImageView backIcon;
    
    @FXML
    ImageView closeIcon;
    @FXML
    ToggleGroup tg;
    @FXML
    Label closeLabel;
    @FXML
    Button close_btn;
    @FXML
    RadioButton male;
    @FXML
    RadioButton female;
    @FXML
    Label testlabel;
   
    
    // closing the window properly
    @FXML
     private void close(ActionEvent event)
    {
       Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
       s.close();
       System.out.print("WINDOW CLOSED");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //adding options to the dropbox 
        nat.getItems().addAll("Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe");
        nat.setValue("Yemen");
        
        //make radio buttons toggable 
        tg = new ToggleGroup();
        this.male.setToggleGroup(tg);
        this.female.setToggleGroup(tg);
        //print the selected radiobutton outputs null in this case
        System.out.print(tg.getSelectedToggle());
        
        //functions called here
        closeWindowHandler();
        draggable();
        registerButtonHandler();
    }  
    
    int xx = 0; 
    
    /*
        1. in this f(x) all the required fields are filled and not empty
        2. if all condtioins is true the data is inserted to the database into 
            user table using registerd function defined in DBconnect class 
    */
    void registerButtonHandler()
    {
        
        registerbutton.setOnMousePressed((e -> {
        String un = username.getText();
        if(un.length() == 0)
        {
            xx++;
          System.out.print("error");
        }
        else
        { 
            
            Username = un;
        }
        Password = password.getText();
        String Cpass = cpassword.getText();
        boolean tf = Cpass.equals(Password);
        if(password.getText().length() == 0)
        {
            xx++;
            System.out.print("Password dosent match");
        } else {
            Password = password.getText();
            }
        if(Email.getText().length() == 0){
            xx++;
            System.out.print("Fill Email Form");}
        else{
            eMail = Email.getText();}
        if (firstname.getText().length() == 0 && lastname.getText().length() == 0)
        {
            xx++;
            System.err.println("First name or Last name is empty");
        }else{
            FirstName = firstname.getText();
            LastName = lastname.getText();
        }
        if(male.isSelected())
        {Gender = "male";}
        else
        {Gender = "female";}
        System.out.print(Gender);
        Nationality = nat.getValue().toString();
        DateOfBirth = dateofbirth.getValue().toString();
        System.out.print("Sucess");
        User newUser = new User(0, Username, Password, eMail, FirstName, LastName, DateOfBirth, Gender, Nationality);
        System.out.print(newUser.getDateOfBirth());
        
            //database insertion
            DBconnect.connect();
            DBconnect.registerd(0, Username, Password, eMail, FirstName, LastName, DateOfBirth, Gender, Nationality);
        
        }));
      
        
         }
    //make the window draggable 
    void draggable(){
      anchor.setOnMousePressed((e -> {
          x = e.getSceneX();
          y = e.getSceneY();
      }));
      anchor.setOnMouseDragged((e -> {
          Stage s  = (Stage) ((Node)e.getSource()).getScene().getWindow();
          s.setX(e.getScreenX()- x);
          s.setY(e.getScreenY()-y);
      }));
   
    } 
   //make the images clickable and close window 
   void closeWindowHandler(){
      backIcon.setOnMousePressed((e -> {
        Stage s = (Stage) ((Node)e.getSource()).getScene().getWindow();
        s.close();
        
    }));
      closeIcon.setOnMousePressed((e -> {
        Stage s = (Stage) ((Node)e.getSource()).getScene().getWindow();
        s.close();
        
    }));
   }
   //still not finished 
   @FXML
   private void resize(ActionEvent event)
   {
       registerbutton.setStyle("-fx-background-color: #00DEEE");
       
   }
  }
