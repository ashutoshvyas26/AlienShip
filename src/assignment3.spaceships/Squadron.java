package assignment3.spaceships;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


/**
 * For drawing out Squadron by calling different classes in different methods.
 * @author Ashutosh Vyas
 */


public class Squadron {
    private double xCoordinate;
    private double yCoordinate;
    private String homePlanetName;

    private Ship commander;
    private Ship[] troopShips;


    /**
     * @param x
     * @param y
     * @param homeName
     * @param color this constructor is called if it is not a commander ship.
     */
    public Squadron(double x, double y, String homeName, Color color) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.homePlanetName = homeName;

        commander = new Ship(x, y, color, true);


        troopShips = new Ship[3]; // 3 troop ships stored in array

        double commanderWidth = 120;
        double commanderHeight = 160;

        // Position troop ships below commander
        double troopSpacing = 40;
        double troopY = y + commanderHeight + 20;

        for (int i = 0; i < 3; i++) {
            troopShips[i] = new Ship(x + i * troopSpacing, troopY, color);
        }
    }


    /**
     * Calculates the total troops
     * @return the total number of troops
     */
    public int getTotalTroops() {
        int total = commander.getNumberTroops();
        for (Ship ship : troopShips) {
            total += ship.getNumberTroops();
        }
        return total;
    }


    /**
     *
     * @param gc The GraphicContext object to draw on ship and text above the ship
     *           this method also calls ship's draw method.
     */
    public void draw(GraphicsContext gc) {
        // Draw all ships
        commander.draw(gc);
        for (Ship ship : troopShips) {
            ship.draw(gc);
        }

        gc.setFill(Color.WHITE);
        gc.fillText(homePlanetName + " - " + getTotalTroops() + " troops",
                xCoordinate + 30, yCoordinate - 10);
    }
}
