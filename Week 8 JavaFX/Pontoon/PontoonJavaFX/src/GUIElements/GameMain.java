/*
 *  This class was adopted from a tutorial on creating BlackJack in JavaFX.
 *  Elements of this game has been changed to fit the requirements of the Pontoon game.
 *  Tutorial can be found here:
 *  https://www.youtube.com/watch?v=I2EVF50V-84&list=WL&index=1&t=7s
 *  Author: Peter Pasieka
 *  Since: 05/11/2020
 */

 // A stupid amount of imports
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/* 
 * Main class, handles the title screen and game screen
 * Also has startGame() and endGame() methods, which handles different game states
 * Screens are created and styled here and then set as the primaryStage 
 */
public class GameMain extends Application // Class start
{
    // Variable initialisation
    Scene title, game;

    private Deck deck = new Deck();
    private Hand dealer, player;
    private Text message = new Text();

    private SimpleBooleanProperty playable = new SimpleBooleanProperty(false);

    private HBox dealerCards = new HBox(20);
    private HBox playerCards = new HBox(20);

    private Button startGame;
    private Button quitGame;

    // Creates the title screen assets
    private Parent titleScreen()
    {
        Text gameName = new Text("Welcome to Pontoon, JavaFX edition!");
        gameName.setFont((Font.font(null, FontWeight.BOLD, 35)));
        startGame = new Button("Start Game");
        quitGame = new Button("Please let me leave");


        // Pane initisaliation
        Pane root = new Pane();
        root.setPrefSize(800, 800);

        // Title layout
        VBox layout = new VBox(100);
        layout.setLayoutX(100);
        layout.setLayoutY(100);
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(gameName, startGame, quitGame);
        title = new Scene(layout, 800, 800);

        // Buttons
        quitGame.setOnAction(e -> 
        {
            System.out.println("-----------------------------------");
            System.out.println("| The user has exited the program |");
            System.out.println("-----------------------------------");

            System.exit(0);
        });

        // CSS styling
        root.getStylesheets().add(GameMain.class.getResource("Style.css").toExternalForm());

        // Root assembly
        root.getChildren().addAll(layout);

        return root;
    }

    // Creates the game screen assets
    private Parent createContent()
    {
        dealer = new Hand(dealerCards.getChildren());
        player = new Hand(playerCards.getChildren());

        Pane root = new Pane();
        root.setPrefSize(800,800);

        Region background = new Region();
        background.setPrefSize(800, 800);

        HBox rootLayout = new HBox(5);
        rootLayout.setPadding(new Insets(5,5,5,5));
        Rectangle left = new Rectangle(550, 535);
        left.setArcWidth(50);
        left.setArcHeight(50);
        left.setStroke(Color.BLACK);
        left.setStrokeWidth(5);
        left.setFill(Color.DARKGREEN);

        Rectangle right = new Rectangle(230, 545);
        right.setArcWidth(50);
        right.setArcHeight(50);
        right.setStroke(Color.BLACK);
        right.setStrokeWidth(5);
        right.setFill(Color.PERU);

        // Left side of window

        VBox leftVBox = new VBox(60);
        leftVBox.setAlignment(Pos.TOP_CENTER);

        Text dealerScore = new Text("Dealer: ");
        Text playerScore = new Text("Player: ");
        dealerScore.setFont((Font.font(null, FontWeight.BOLD, 24)));
        playerScore.setFont((Font.font(null, FontWeight.BOLD, 24)));

        leftVBox.getChildren().addAll(dealerScore, dealerCards, message, playerCards, playerScore);

        // Right side of window

        VBox rightVBox = new VBox(20);
        rightVBox.setAlignment(Pos.CENTER);

        ImageView cardDeck = new ImageView(new Image(getClass().getResourceAsStream("deckOfCards.jpg")));
        cardDeck.setOnMouseClicked(e ->
        {
            System.out.println("Bababooey");
        });

        Button btnPlay = new Button("New Game");
        Button btnHit = new Button("Hit");
        Button btnStand = new Button("Stand");

        HBox buttonsHBox = new HBox(15);
        buttonsHBox.setAlignment(Pos.CENTER);
        btnHit.setDisable(true);
        btnStand.setDisable(true);
        buttonsHBox.getChildren().addAll(btnHit, btnStand);
        rightVBox.getChildren().addAll(cardDeck, btnPlay, buttonsHBox, quitGame);

        // Add both stacks to root layout

        rootLayout.getChildren().addAll(new StackPane(left, leftVBox), new StackPane(right, rightVBox));
        root.getChildren().addAll(background, rootLayout);

        // CSS styling
        root.getStylesheets().add(GameMain.class.getResource("Style.css").toExternalForm());

        // Bindings 

        btnPlay.disableProperty().bind(playable);
        btnHit.disableProperty().bind(playable.not());
        btnStand.disableProperty().bind(playable.not());

        //

        player.valueProperty().addListener((obs, old, newValue) -> 
        {
            if (newValue.intValue() >= 21)
            {
                endGame();
            }
        });

        dealer.valueProperty().addListener((obs, old, newValue) ->
        {
            if (newValue.intValue() >= 21)
            {
                endGame();
            }
        });

        // Buttons

        btnPlay.setOnAction(event ->
        {
            startNewGame();
        });

        btnHit.setOnAction(event ->
        {
            player.takeCard(deck.drawCard());
        });

        btnStand.setOnAction(event ->
        {
            while (dealer.valueProperty().get() < 17)
            {
                dealer.takeCard(deck.drawCard());
            };

            endGame();
        });

        return root;
    }

    // Is called whenever the "Start Game" button is pressed, resets the data from the previous game back to sqaure one
    private void startNewGame()
    {
        playable.set(true);
        message.setText("");

        deck.refill();

        dealer.reset();
        player.reset();

        dealer.takeCard(deck.drawCard());
        dealer.takeCard(deck.drawCard());
        player.takeCard(deck.drawCard());
        player.takeCard(deck.drawCard());
    }

    // Is called whenever the dealer or the player wins the game, has win statements for the winner
    private void endGame()
    {
        playable.set(false);

        int dealerValue = dealer.valueProperty().get();
        int playerValue = player.valueProperty().get();

        String winner = "Wow! You both tied! Dealer had: " + dealerValue + " and the Player had: " + playerValue;

        // ORDER IS IMPORTANT

        if (dealerValue == 21 || playerValue > 21 || dealerValue == playerValue || (dealerValue < 21 && dealerValue > playerValue))
        {
            winner = "Shame, the dealer won.";
        } else if (playerValue == 21 || dealerValue > 21 || playerValue > dealerValue)
            {
                winner = "Congratulations, you won a completely luck based game!";
            }

            message.setText(winner);
            message.setFont((Font.font(null, FontWeight.BOLD, 20)));
    }

    // Main stage, assembles the game window using the titleScreen() and createContent() methods
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("Pontoon againnnnnnnnnnnnnnnn");
        primaryStage.setScene(new Scene(titleScreen()));
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setResizable(false);
        primaryStage.show();   
        
        startGame.setOnAction(e -> 
        {
            primaryStage.setScene(new Scene(createContent()));
        }); 
    }

    // Main, runs the program
    public static void main(String[] args)
    {
        launch(args);
    }
    
} // Class end
