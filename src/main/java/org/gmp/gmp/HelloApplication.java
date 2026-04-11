package org.gmp.gmp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("/org/gmp/gmp/view/MarbleMasterDashboard.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 1220, 960);
        stage.setTitle("MarbleMaster - Engraving Systems");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}