import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class MainController {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField peso_input;
    @FXML
    private TextField altura_input;

    public double calcularIMC(double peso_pessoa, double altura_pessoa){
        double alturaEmMetros = altura_pessoa/100.0;
        return peso_pessoa / (alturaEmMetros*alturaEmMetros);

    }

    @FXML
    private void onButtonClick() {
        double peso = Double.parseDouble(peso_input.getText().replace(",","."));
        double altura = Double.parseDouble(altura_input.getText().replace(",","."));
        double imc = calcularIMC(peso, altura);
        label1.setText(String.format("Seu imc esta em %.2f", imc));
        if (imc < 18.5) {
            label2.setText("Abaixo do peso");
            label2.setTextFill(Color.BLACK);
        } else if (imc >= 18.5 && imc < 25) {
            label2.setText("Peso normal");
            label2.setTextFill(Color.GREEN);
        } else if (imc >= 25 && imc < 30) {
            label2.setText("Sobrepeso");
            label2.setTextFill(Color.BLACK);
        } else if (imc >= 30 && imc < 35) {
            label2.setText("Obesidade grau I");
            label2.setTextFill(Color.RED);
        } else if (imc >= 35 && imc < 40) {
            label2.setText("Obesidade grau II");
            label2.setTextFill(Color.RED);
        } else {
            label2.setText("Obesidade grau III");
            label2.setTextFill(Color.BLUE);
        }
    }
}
