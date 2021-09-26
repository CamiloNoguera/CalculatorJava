import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
//import javafx.fxml.Initializable;

public class Oper_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEjecutar;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField result;

    @FXML
    private RadioButton rdbsuma;

    @FXML
    private RadioButton rdbresta;

    @FXML
    private RadioButton rdbmult;

    @FXML
    private RadioButton rdbdiv;

    @FXML
    private Button clear;

    @FXML
    void HacerOperacion(ActionEvent event) {
        int op1 = Integer.parseInt(num1.getText());
        int op2 = Integer.parseInt(num2.getText());
        Operaciones operacion = new Operaciones(op1, op2);
        if (this.rdbsuma.isSelected()) {
            this.result.setText(operacion.rdbsuma() + " ");
        } else if (this.rdbresta.isSelected()) {
            this.result.setText(operacion.rdbresta() + " ");
        } else if (this.rdbmult.isSelected()) {
            this.result.setText(operacion.rdbmult() + " ");
        } else if (this.rdbdiv.isSelected()) {
            if (op2 == 0) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setContentText("El operando 2, no puede ser 0");
                alerta.showAndWait();
            } else {
                this.result.setText(operacion.rdbdiv() + " ");
            }
        }
    }

    @FXML
    void limpiar(ActionEvent event) {
        num1.setText("");
        num2.setText("");
        result.setText("");
        num1.requestFocus();

    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        this.rdbsuma.setToggleGroup(tg);
        this.rdbresta.setToggleGroup(tg);
        this.rdbmult.setToggleGroup(tg);
        this.rdbdiv.setToggleGroup(tg);
        
        
     }
}
