/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahaprojectjavafx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author arthas
 */
public class SousQuestionController implements Initializable {

 
        
    
    @FXML
    private TableView<Reponse> table;
    @FXML
    private TableColumn<Reponse,String> dateColumn;
    @FXML
    private TableColumn<Reponse,String> usernameColumn;
    @FXML
    private TableColumn<Reponse,String> contenuColumn;
    @FXML
    private TableColumn<Reponse,Integer> idColumn;
    @FXML
    private TableColumn<Reponse,Integer> likesColumn;
    @FXML
    private TableColumn<Reponse,Integer> unlikesColumn;
    @FXML
    private TextField date;
    @FXML
    private TextField titre;
    @FXML
    private TextArea contenu;
    @FXML
    private Button btn1;
        @FXML
    private Button btn11;
            @FXML
    private Button btn22;
                @FXML
    private Button btn33;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
        @FXML
    private AnchorPane home;
    @FXML
    private ScrollPane scrollHomePage;
    @FXML
    private AnchorPane mainAP;
    @FXML
    private JFXDrawer menu;
    @FXML
    private AnchorPane menuBar;
    @FXML
    private AnchorPane loginRegisterProfie;
    @FXML
    private HBox profileHB;
    @FXML
    private Circle photoProfilMenu;
    @FXML
    private HBox menuHB;
    @FXML
    private VBox profileVB;
    @FXML
    private JFXButton profilMenu;
    @FXML
    private JFXButton settingsProfile;
    @FXML
    private Label nameUserMenu;
    @FXML
    private Label labelLastLoginMenu;
    @FXML
    private Label LastLoginMenu;
    @FXML
    private JFXButton logoutMenu;
    @FXML
    private JFXButton admin;
    @FXML
    private AnchorPane barreRecherche;
    @FXML
    private VBox menuVB;
    @FXML
    private VBox accueilVB;
    @FXML
    private VBox catVB;
    @FXML
    private VBox sousMenuCat;
    @FXML
    private VBox eventVB;
    @FXML
    private JFXButton eventButton;
    @FXML
    private VBox sousMenuEvent;
    @FXML
    private VBox blogVB;
    @FXML
    private JFXButton blogButton;
    @FXML
    private VBox sousMenuBlog;
    @FXML
    private JFXButton ajoutArticleB;
    @FXML
    private JFXButton listArticleB;
    @FXML
    private VBox dealVB;
    @FXML
    private JFXButton dealButton;
    @FXML
    private VBox sousMenuDeal;
    @FXML
    private JFXButton catButton;
    @FXML
    private AnchorPane addArticle;
    @FXML
    private JFXButton eventButton1;
    @FXML
    private JFXButton eventButton11;
    
    
    @FXML
    private void AddArticle(MouseEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("/vue/AddArticle.fxml"));
     ajoutArticleB.getScene().setRoot(root);
    }

    @FXML
    private void ShowListArticle(MouseEvent event) 
        throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("/vue/ListArticles.fxml"));
     listArticleB.getScene().setRoot(root);
    }
    
    
    @FXML
private void AcceuilButtonAction(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}




@FXML
private void PublierQuestionButtonAction(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PublierQuestion.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}




@FXML
private void MesQuestionButtonAction(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("MesQuestions.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
} 
    
        @FXML
private void RetourMesQuestionButtonAction(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("MesQuestions.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}




 @FXML
private void ModifierQuestion(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("ModifierQuestion.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}


@FXML
private void AjouterReponse(ActionEvent event) throws IOException
{
    try {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("AjouterReponse.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}



@FXML
private void ConsulterReponse(ActionEvent event) throws IOException
{
    try {
        Reponse reponse= table.getSelectionModel().getSelectedItem();
        
       UtiliseObjetService obs=new UtiliseObjetService();
       obs.setidreponsedb(reponse.getId_reponse());
       
       
        if(reponse.getId()==obs.getiduserdb().get(0).getId_userdb())
      { Parent home_page_parent = FXMLLoader.load(getClass().getResource("ModifierReponse.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
      }
      
      else {
          Parent home_page_parent = FXMLLoader.load(getClass().getResource("SousReponse.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
      
      }

        
    } catch (IOException ex) {
        Logger.getLogger(MesQuestionsController.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (SQLException ex) {
            Logger.getLogger(SousQuestionController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      try {
           // UtileObjets UO= new UtileObjets();
            QuestionService qs = new QuestionService();
           // ArrayList<Question> questions;
           UtiliseObjetService obs=new UtiliseObjetService();
           
            
            
            Question q=  qs.afficherQuestionParId(obs.getidquestiondb().get(0).getId_questiondb());
           // System.out.println(obs.getidquestiondb().get(0).getId_questiondb());
            titre.setText(q.getTitre_question());
            titre.setEditable(false);
            date.setText(q.getDate_question());;
            date.setEditable(false);
           contenu.setText(q.getContenu_question());
           contenu.setEditable(false);
           
           //affichage des reponses pour la question à consulter
           
           ReponseService rs = new ReponseService();
           ArrayList<Reponse> reponses;
             
          
         
 
  //System.out.println(rs.Calculunrate(2));
           
           
        reponses = (ArrayList<Reponse>) rs.AfficherReponsesAvecTriRate(obs.getidquestiondb().get(0).getId_questiondb());
        ObservableList obss = FXCollections.observableArrayList(reponses);
           table.setItems(obss);
           dateColumn.setCellValueFactory(new PropertyValueFactory<>("date_reponse"));
           usernameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
           contenuColumn.setCellValueFactory(new PropertyValueFactory<>("contenu_reponse"));
           likesColumn.setCellValueFactory(new PropertyValueFactory<>("rate"));
           unlikesColumn.setCellValueFactory(new PropertyValueFactory<>("unrate"));
           idColumn.setCellValueFactory(new PropertyValueFactory<>("id_reponse"));
           
          // System.out.println(reponses.get(0).get);
           
           
        } catch (SQLException ex) {
            Logger.getLogger(SousQuestionController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }    
    
}
