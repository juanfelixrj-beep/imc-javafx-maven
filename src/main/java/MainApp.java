import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.*;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("main.fxml")
        );

        stage.setScene(new Scene(root));
        stage.setTitle("Calculadora de IMC");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

