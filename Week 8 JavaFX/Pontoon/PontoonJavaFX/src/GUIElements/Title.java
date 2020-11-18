import PontoonJavaFX.src.GameFiles.DriverClass;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.*; 

public class Title extends Application
{

    Stage window;
    Scene title;
	static Scene game;

    // PrimaryStage start
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        window = primaryStage;

    //Elements

        //                      MASTER                    \\
        // EVERYTHING RELATED TO GRIDPANE WILL BE SHIFTED \\
        //                                                \\

        GridPane grid = new GridPane();
        grid.setHgap(8);
        grid.setVgap(8);
        grid.setPadding(new Insets(10, 10, 10, 10));
        //-------------------------------------------------//
                                                //X, Y, W, H
        Rectangle titleBackground = new Rectangle(4,4,359,191);
        titleBackground.setStroke(Color.GREEN);
        titleBackground.setStrokeWidth(5);
        titleBackground.setFill(Color.GREENYELLOW);
        grid.add(titleBackground, 10, 10);



        // Set text elements
        Text mainTitle = new Text("Welcome to Pontoon!");
        mainTitle.setFont(Font.font("Arial", FontWeight.BOLD, 33));
        grid.add(mainTitle, 10, 10);
       
        

        BorderPane pane = new BorderPane();

        pane.setCenter(grid);
        pane.setBottom(addVBox());

        // Creates the text elements, set at 800 x 800
        title = new Scene(pane, 600, 400);
        primaryStage.setScene(title);
        primaryStage.show();
        

        // Sets program name
        primaryStage.setTitle("Pontoon (again)");

        // Style referencing
        title.getStylesheets().add(Title.class.getResource("Style.css").toExternalForm());

        
        // button event end       
    } // PrimaryStage end

    public VBox addVBox()
    {
        VBox buttonPlacement = new VBox();
        buttonPlacement.setPadding(new Insets(10,10,10,10));
        buttonPlacement.setSpacing(15);

        Button startB = new Button("Start Game");
        startB.setPrefSize(100, 20);
        
        // land expression
        startB.setOnAction(event -> window.setScene(game));
        game = new Scene(buttonPlacement, 700, 500);

        Button exitB = new Button("Exit Game");
        exitB.setPrefSize(100, 20);

        exitB.setOnAction(event ->
        {
            System.out.println("-----------------------------------");
            System.out.println("| The user has exited the program |");
            System.out.println("-----------------------------------");

            System.exit(0);
        });

        buttonPlacement.getChildren().addAll(startB, exitB);
        buttonPlacement.setAlignment(Pos.CENTER);
        return buttonPlacement;
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}