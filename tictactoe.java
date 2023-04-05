package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class tictactoe extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String[][] board = {
                {"O", "X", "O"},
                {"X", null, "X"},
                {"X", null, null},
        };

        Stage boardStage = tictacBoard(board);
        boardStage.show();
    }

    public Stage tictacBoard(String[][] board) {
        Stage stage = new Stage();
        stage.setTitle("Tic-Tac-Toe Board");

        String xImageUrl = "file:///Users/maxwellvinciguerra/eclipse-workspace/trial2error/src/application/png-transparent-x-mark-computer-icons-wrongcross-angle-symmetry-monochrome.png"; 
        String oImageUrl = "file:///Users/maxwellvinciguerra/eclipse-workspace/trial2error/src/application/png-transparent-letter-case-o-alphabet-o-miscellaneous-monochrome-black.png";
        Image xImage = new Image(xImageUrl);
        Image oImage = new Image(oImageUrl);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != null) {
                    ImageView imageView = new ImageView(board[row][col].equals("X") ? xImage : oImage);
                    imageView.setFitWidth(50);
                    imageView.setFitHeight(50);
                    gridPane.add(imageView, col, row);
                }
            }
        }

        Scene scene = new Scene(gridPane, 300, 300);
        stage.setScene(scene);

        return stage;
    }
}
