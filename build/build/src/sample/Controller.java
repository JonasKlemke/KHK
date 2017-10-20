package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Controller {

    @FXML Label titleLbl;
    @FXML Label attDoc;
    @FXML TextArea textTa;
    @FXML Button yesBtn;
    @FXML Button noBtn;
    @FXML Button nextBtn;
    @FXML Button backBtn;
    @FXML Button resetBtn;
    private Content content;

    public Controller() {
    }


    @FXML
    private void initialize() {
        Roadmap roadmap = new Roadmap();
        content = roadmap.getNextElement();
        updateDisplay();
    }

    @FXML
    private void nextElement(){
        content = content.getNextContent();
        updateDisplay();
    }

    @FXML
    private void backElement(){
        if(content.getPrevContent() != null) {
            content = content.getPrevContent();
            updateDisplay();
        }
    }

    @FXML
    private void yesElement(){
        content = content.getYesContent();
        updateDisplay();
    }

    @FXML
    private void noElement(){
        content = content.getNoContent();
        updateDisplay();
    }

    @FXML
    private void resetElement(){
        initialize();
    }

    private void updateDisplay(){
        if(content.info == true){
            nextBtn.setVisible(true);
            backBtn.setVisible(true);

            yesBtn.setVisible(false);
            noBtn.setVisible(false);
        }else {
            yesBtn.setVisible(true);
            noBtn.setVisible(true);

            nextBtn.setVisible(false);
//            backBtn.setVisible(false);
        }

        if(content.endpoint == false){
            resetBtn.setVisible(false);
        }else {
            resetBtn.setVisible(true);
            nextBtn.setVisible(false);

        }

        textTa.textProperty().setValue(content.textContent);
        attDoc.textProperty().setValue(content.attendingDoc.toString());
    }

}
