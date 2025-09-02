package assignment3.spaceships;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

/**
 * To draw the Ship
 * @author Ashutosh Vyas
 */
public class Ship  {
    private int numberTroops;
    private double xCoordinate;
    private double yCoordinate;
    private Color shipColor;
    private boolean isCommander;

    private Window[] windows;
    private LandingGear landingGear;

    /**
     * @param x
     * @param y
     * @param shipColor this constructor is called for troops. other than commander.
     */
    public Ship(double x, double y, Color shipColor) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.shipColor = shipColor;
        this.isCommander = false;

        Random rand = new Random();
        this.numberTroops = rand.nextInt(10) + 2;

        initComponents();
    }

    /**
     * @param x
     * @param y
     * @param shipColor
     * @param isCommander this constructor is for troops.
     */
    public Ship(double x, double y, Color shipColor, boolean isCommander) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.shipColor = shipColor;
        this.isCommander = isCommander;

        this.numberTroops = 1;

        initComponents();
    }

    /**
     * this method creates an array of object of class window with coordinates as parameteres. In addition, it also calls LandingGeear's constructor.
     */
    private void initComponents() {
        double width = isCommander ? 120 : 30;
        double height = isCommander ? 160 : 40;

        windows = new Window[2];
        double windowSize = width / 8;
        windows[0] = new Window(windowSize, xCoordinate + width/4, yCoordinate + height/3);
        windows[1] = new Window(windowSize, xCoordinate + 3*width/4 - windowSize/2, yCoordinate + height/3);

        landingGear = new LandingGear(height/5, xCoordinate + width/4, yCoordinate + height*0.8);
    }

    /**
     * @return total number of troops.
     */
    public int getNumberTroops() {
        return numberTroops;
    }

    /**
     * @param gc this mehtod take GraphicsContext gc as parameter. draws the ship and calls window's draw method. also checks if isCommader is true or false.
     */
    public void draw(GraphicsContext gc) {
        double width = isCommander ? 120 : 30;
        double height = isCommander ? 160 : 40;

        gc.setFill(shipColor);
        gc.fillOval(xCoordinate, yCoordinate, width, height*0.8);

        for (Window window : windows) {
            window.draw(gc);
        }
        landingGear.draw(gc);
        if (isCommander) {
            gc.setFill(Color.GOLD);
            double starSize = width / 10;
            gc.fillOval(xCoordinate + width/2 - starSize/2, yCoordinate + height/10, starSize, starSize);
        }
    }
}

