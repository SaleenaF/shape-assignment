/**
 * @(#)CShape.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */


/**
 * Abstract class representing a Shape
 */
public abstract class CShape {
    private static int sCounter = 0;
    protected int sID;

    /**
     * Constructor for a shape.
     */
    public CShape() {
        sCounter++;
        sID = sCounter;
    }

    /**
     * Abstract method to get the dimensions of the shape
     * @return String representation of the dimensions
     */
    public abstract String getInfo();

    /**
     * Method to get the type of the shape
     * @return String representing the type of the shape
     */
    public abstract String getShape();

    /**
     * Method to display information about the shape
     * @return String representation of the shape information
     */
    public String displayInfo() {
        return "Shape " + sID + ": " + getShape() + " " + getInfo();
    }
}
