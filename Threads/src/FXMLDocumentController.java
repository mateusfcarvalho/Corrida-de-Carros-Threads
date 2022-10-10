/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author java
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button buttonIniciar;
    @FXML
    private Button buttonCarro1;
    @FXML
    private Button buttonCarro2;
    @FXML
    private Button buttonCarro3;
    @FXML
    private Button buttonCarro4;
    @FXML
    private Button buttonCarro5;
    @FXML
    private Label labelLinhaChegada;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    public void handleButtonIniciar() {
        //Instanciando as Runnables
        RunnableCarro runnableCarro1 = new RunnableCarro(buttonCarro1, "Modely");
        RunnableCarro runnableCarro2 = new RunnableCarro(buttonCarro2, "Modelx");
        RunnableCarro runnableCarro3 = new RunnableCarro(buttonCarro3, "Model Truck");
        RunnableCarro runnableCarro4 = new RunnableCarro(buttonCarro4, "Models");
        RunnableCarro runnableCarro5 = new RunnableCarro(buttonCarro5, "Model3");
        
        //Alterando as prioridades de algumas Threads (apenas para observar o resultado)
        runnableCarro1.prioridade = 10; //Carro 1
        runnableCarro2.prioridade = 7;  //Carro 2

        //Instanciando as Threads
        Thread threadCarro1 = new Thread(runnableCarro1, "Modely");
        Thread threadCarro2 = new Thread(runnableCarro2, "Modelx");
        Thread threadCarro3 = new Thread(runnableCarro3, "Model Truck");
        Thread threadCarro4 = new Thread(runnableCarro4, "Models");
        Thread threadCarro5 = new Thread(runnableCarro5, "Model3");
        
        threadCarro1.start();
        threadCarro2.start();
        threadCarro3.start();
        threadCarro4.start();
        threadCarro5.start();
        
    }


}
