package assignment3.spaceships;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author ASHUTOSH VYAS
 */
public class FXGraphicsTemplate extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 600); // Set canvas Size in Pixels
        stage.setTitle("Alien Armada"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 800, 600);
        Squadron squadron1 = new Squadron(100, 50, "Bismark", Color.RED);
        Squadron squadron2 = new Squadron(300, 50, "American Queen", Color.GREEN);
        Squadron squadron3 = new Squadron(500, 50, "Arthur Foss", Color.BLUE);

        squadron1.draw(gc);
        squadron2.draw(gc);
        squadron3.draw(gc);

        // YOUR CODE STOPS HERE
        stage.show();

    }



    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
