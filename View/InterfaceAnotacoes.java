package View;

import java.net.URL;
import java.util.ResourceBundle;

import dados.IRepositorioAnotacoes;
import dados.RepositorioAnotacoesArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import negocio.Quadro;

public class InterfaceAnotacoes {
    
    IRepositorioAnotacoes anotacoes = new RepositorioAnotacoesArray(10);
    Quadro quadro1 = new Quadro(anotacoes);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tituloDigitado;

    @FXML
    private TextField textoDigitado;

    @FXML
    private Button botaoSalvar;

    @FXML
    void acaoDoBotao(ActionEvent event) {
        quadro1.criaAnotacao(tituloDigitado.getText(), textoDigitado.getText());
        quadro1.listarAnotacoes();
    }


    @FXML
    void initialize() {
        assert tituloDigitado != null : "fx:id=\"tituloDigitado\" was not injected: check your FXML file 'interfaceAnotacoes.fxml'.";
        assert textoDigitado != null : "fx:id=\"textoDigitado\" was not injected: check your FXML file 'interfaceAnotacoes.fxml'.";
        assert botaoSalvar != null : "fx:id=\"botaoSalvar\" was not injected: check your FXML file 'interfaceAnotacoes.fxml'.";

    }
}
