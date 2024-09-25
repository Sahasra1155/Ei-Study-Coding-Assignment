import java.util.logging.Logger;

class Satellite {
    private String orientation;
    private String solarPanels;
    private int dataCollected;
    protected static final Logger logger = Logger.getLogger(Satellite.class.getName());

    public Satellite() {
        this.orientation = "North";
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
        logger.info("Satellite initialized with default state.");
    }

    public void rotate(String direction) {
        if (direction.equals("North") || direction.equals("South") || direction.equals("East") || direction.equals("West")) {
            this.orientation = direction;
            logger.info("Satellite rotated to " + direction + ".");
        } else {
            logger.severe("Invalid rotation direction: " + direction + ". Must be North, South, East, or West.");
            throw new IllegalArgumentException("Invalid direction. Use North, South, East, or West.");
        }
    }

    public void activatePanels() {
        this.solarPanels = "Active";
        logger.info("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanels = "Inactive";
        logger.info("Solar panels deactivated.");
    }

    public void collectData() {
        if (this.solarPanels.equals("Active")) {
            this.dataCollected += 10;
            logger.info("Data collected. Total data collected: " + this.dataCollected);
        } else {
            logger.severe("Data collection failed. Solar panels are inactive.");
            throw new IllegalStateException("Cannot collect data. Solar panels are inactive.");
        }
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation + "\n" +
               "Solar Panels: " + solarPanels + "\n" +
               "Data Collected: " + dataCollected;
    }
}
