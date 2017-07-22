/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Ervin
 */
public class FXMLDocumentController implements Initializable {
    
   
    
    @FXML
    private TextField txt_denda;
    @FXML
    private TextField txt_lama;
    @FXML
    private TextField txt_batas;
    @FXML
    private TextField txt_hari;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String tlama,tbatas;
        int lama,batas,hasil,denda;
        
        //nilai ditampung sementara di variabel string
        tlama = txt_lama.getText();
        tbatas = txt_batas.getText();
        
        //konversi string ke integer
        lama = Integer.parseInt(tlama);
        batas = Integer.parseInt(tbatas);
        
        hasil = lama - batas;
        denda = hasil*1000;
        
        
        txt_hari.setText(Integer.toString(hasil));
        txt_denda.setText(Integer.toString(denda));
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class txt_hari {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txt_hari() {
        }
    }
    
}
