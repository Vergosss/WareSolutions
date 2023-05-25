import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StartMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a menu
        Menu fileMenu = new Menu("File");

        // Create menu items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add menu items to the menu
        fileMenu.getItems().addAll(newItem, openItem, saveItem, exitItem);

        // Add the menu to the menu bar
        menuBar.getMenus().add(fileMenu);

        // Create a layout pane
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Create a scene with the layout pane
        Scene scene = new Scene(root, 400, 300);

        // Set the scene on the primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("WareSolutions");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}