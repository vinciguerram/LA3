package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockP extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int hour = 22;
        int minute = 44;
        int second = 37;

        Stage clockStage = dualClock(hour, minute, second);
        clockStage.show();
    }

    public Stage dualClock(int hour, int minute, int second) {
        Stage stage = new Stage();
        stage.setTitle("Dual Clock");

        LocalTime initialTime = LocalTime.of(hour, minute, second);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        Label digitalClock = new Label(initialTime.format(formatter));
        digitalClock.setFont(new Font("Arial", 24));

        VBox layout = new VBox(digitalClock);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);

        return stage;
    }
}
