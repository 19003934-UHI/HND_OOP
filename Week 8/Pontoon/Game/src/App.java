import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        // Sets program name
        primaryStage.setTitle("Pontoon (again)");

        // Starts the game
        Button start = new Button();
        start.setText("Start Game");

        start.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                DriverClass.main(null);
            }
        });

        // Exits the game
        Button exit = new Button();
        exit.setText("Exit Program");

        exit.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.exit(0);
            }
        });

        StackPane root = new StackPane();
       
        start.setLayoutX(100);
        start.setLayoutY(400);
       
        exit.setLayoutX(700);
        exit.setLayoutY(400);

        root.getChildren().addAll(start, exit);
        
        Scene scene = new Scene(root,800,800);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}