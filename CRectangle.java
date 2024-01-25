/**
 * @(#)CRectangle.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */

/**
 * Class representing a Rectangle, a type of Shape
 */
public class CRectangle extends CShape {
    private int length;
    private int width;

    /**
     * Constructor for a Rectangle
     * @param length: Length of the rectangle
     * @param width:  Width of the rectangle
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public String getInfo() {
        return length + "x" + width;
    }

    @Override
    public String getShape() {
        return "RECTANGLE";
    }
}
