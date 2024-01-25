/**
 * @(#)CSquare.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */

/**
 * Class representing a Square, a type of Rectangle
 */
public class CSquare extends CRectangle {
    /**
     * Constructor for a Square
     * @param side: Length of the square's sides
     */
    public CSquare(int side) {
        super(side, side);
    }

    @Override
    public String getShape() {
        return "SQUARE";
    }
}
