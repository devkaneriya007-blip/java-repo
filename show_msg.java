import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class show_msg extends Application {

    public void start(Stage stage) {

        // Labels
        Label l1 = new Label("Enter Name:");
        Label l2 = new Label("Enter Age:");

        // TextFields
        TextField t1 = new TextField();
        TextField t2 = new TextField();

        // Button
        Button btn = new Button("Show");

        // Button action
        btn.setOnAction(e -> {
            String name = t1.getText();
            String age = t2.getText();

            // Print in DOS/console
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(l1, t1, l2, t2, btn);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("User Input Example");
        stage.setScene(scene);
        stage.show();
    }
}