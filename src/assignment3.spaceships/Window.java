package assignment3.spaceships;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * To draw two windows of commander ship and troops.
 * @author Ashutosh Vyas
 */

public class Window {
    private double wSize;
    private double xCoordinate;
    private double yCoordinate;

    /**
     * @param wSize
     * @param x
     * @param y
     */
    Window(double wSize, double x, double y){
        this.wSize=wSize;
        this.xCoordinate=x;
        this.yCoordinate=y;
    }

    /**
     * @param gc this method draws a window
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillOval(xCoordinate, yCoordinate, wSize, wSize);
        gc.setStroke(Color.WHITE);
        gc.strokeOval(xCoordinate, yCoordinate, wSize, wSize);
    }
}
