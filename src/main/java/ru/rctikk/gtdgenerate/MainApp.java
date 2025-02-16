package ru.rctikk.gtdgenerate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private BorderPane boarderPane;

    public void initRootLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("root-layout.fxml"));
        boarderPane = (BorderPane) loader.load();
        Scene scene = new Scene(boarderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AddressApp");

        // Даём контроллеру доступ к главному прилодению.
        RootLayoutController controller = loader.getController();
        controller.setMainApp(this);

        primaryStage.show();

//         Пытается загрузить последний открытый файл с адресатами.
//        File file = getPersonFilePath();
//        if (file != null) {
//            loadPersonDataFromFile(file);
//        }
    }
}