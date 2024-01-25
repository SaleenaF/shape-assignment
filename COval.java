/**
 * @(#)COval.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */

/**
 * Class representing an Oval, a type of Shape
 */
public class COval extends CShape {
    protected int hRad; // So Circle can usu it as well
    private int vRad;

    /**
     * Constructor for an Oval
     * @param hRad: Horizontal radius of the oval
     * @param vRad: Vertical radius of the oval
     */
    public COval(int hRad, int vRad) {
        super();
        this.hRad = hRad;
        this.vRad = vRad;
    }

    @Override
    public String getInfo() {
        return hRad + "x" + vRad;
    }

    @Override
    public String getShape() {
        return "OVAL";
    }
}
