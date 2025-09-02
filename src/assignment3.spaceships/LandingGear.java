package assignment3.spaceships;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * To draw Landing gears.
 * @author Ashutosh Vyas
 */
public class LandingGear {
    private double gSize;
    private double xCoordinate;
    private double yCoordinate;

    /**
     * @param gSize
     * @param x
     * @param y
     */
    LandingGear(double gSize, double x, double y){
        this.gSize=gSize;
        this.xCoordinate=x;
        this.yCoordinate=y;
    }

    /**
     * @param gc draws the landinggear of the squadron.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.DARKGRAY);
        double legWidth = gSize / 5;
        gc.fillRect(xCoordinate, yCoordinate, legWidth, gSize);
        gc.fillRect(xCoordinate + gSize - legWidth, yCoordinate, legWidth, gSize);
        gc.fillOval(xCoordinate - legWidth/2, yCoordinate + gSize - legWidth, legWidth*2, legWidth);
        gc.fillOval(xCoordinate + gSize - legWidth/2, yCoordinate + gSize - legWidth, legWidth*2, legWidth);
    }
}
