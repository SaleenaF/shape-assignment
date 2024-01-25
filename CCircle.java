/**
 * @(#)CCircle.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */

/**
 * Class representing a Circle, a type of Oval
 */
public class CCircle extends COval {
    /**
     * Constructor for a Circle
     * @param rad: Radius of the circle
     */
    public CCircle(int rad) {
        super(rad, rad);
    }

    @Override
    public String getInfo() {
        return String.valueOf(hRad); // Display only a single value
    }

    @Override
    public String getShape() {
        return "CIRCLE";
    }
}
