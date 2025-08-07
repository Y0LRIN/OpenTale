package org.opentale.studio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.quilia.engine.EngineMain;

/**
 * Main application class for OpenTale Studio.
 * A GUI application for designing visual novels using the Quilia Engine.
 */
public class AppMain extends Application {
    
    private EngineMain engine;
    
    @Override
    public void start(Stage primaryStage) {
        // Initialize the Quilia Engine
        engine = new EngineMain();
        engine.initialize();
        
        // Create the main UI
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(50));
        
        // Title label
        Label titleLabel = new Label("OpenTale Studio");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        
        // Subtitle label
        Label subtitleLabel = new Label("Visual Novel Development Platform");
        subtitleLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: gray;");
        
        // Engine info label
        Label engineLabel = new Label("Powered by Quilia Engine " + engine.getVersion());
        engineLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: darkblue;");
        
        // Action buttons
        Button newProjectButton = new Button("New Project");
        newProjectButton.setStyle("-fx-font-size: 14px; -fx-min-width: 150px;");
        newProjectButton.setOnAction(e -> showDialog("New Project", "Project creation feature coming soon!"));
        
        Button openProjectButton = new Button("Open Project");
        openProjectButton.setStyle("-fx-font-size: 14px; -fx-min-width: 150px;");
        openProjectButton.setOnAction(e -> showDialog("Open Project", "Project opening feature coming soon!"));
        
        Button aboutButton = new Button("About");
        aboutButton.setStyle("-fx-font-size: 14px; -fx-min-width: 150px;");
        aboutButton.setOnAction(e -> showDialog("About", 
            "OpenTale Studio v1.0.0\\n\\n" +
            "A powerful visual novel development platform\\n" +
            "Built with JavaFX and powered by Quilia Engine"));
        
        // Add all components to the layout
        root.getChildren().addAll(
            titleLabel,
            subtitleLabel,
            engineLabel,
            newProjectButton,
            openProjectButton,
            aboutButton
        );
        
        // Create and configure the scene
        Scene scene = new Scene(root, 400, 300);
        
        // Configure the primary stage
        primaryStage.setTitle("OpenTale Studio");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.setMinWidth(350);
        primaryStage.setMinHeight(250);
        
        // Show the application
        primaryStage.show();
        
        System.out.println("OpenTale Studio launched successfully!");
    }
    
    /**
     * Show a simple dialog with a message.
     * @param title dialog title
     * @param message dialog message
     */
    private void showDialog(String title, String message) {
        Stage dialog = new Stage();
        dialog.setTitle(title);
        
        VBox dialogVbox = new VBox(20);
        dialogVbox.setAlignment(Pos.CENTER);
        dialogVbox.setPadding(new Insets(20));
        
        Label messageLabel = new Label(message);
        messageLabel.setWrapText(true);
        
        Button okButton = new Button("OK");
        okButton.setOnAction(e -> dialog.close());
        
        dialogVbox.getChildren().addAll(messageLabel, okButton);
        
        Scene dialogScene = new Scene(dialogVbox, 300, 150);
        dialog.setScene(dialogScene);
        dialog.show();
    }
    
    /**
     * Main method to launch the JavaFX application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting OpenTale Studio...");
        launch(args);
    }
}
