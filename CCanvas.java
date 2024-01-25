/**
 * @(#)CCanvas.java
 *
 *
 * @Saleena Farrukh 
 * @version 1.00 2024/1/24
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class representing a Canvas that has a list of shapes
 */
public class CCanvas {
    private List<CShape> shapes;

    /**
     * Constructor for a Canvas
     */
    public CCanvas() {
        shapes = new ArrayList<>();
        randomShapes();
    }

    /**
     * Method generates 10 random shapes and adds them to the canvas
     */
    private void randomShapes() {
        Random random = new Random();

        while (shapes.size() < 10) {
            int randS = random.nextInt(4); // 0 - Oval, 1 - Circle, 2 - Rectangle, 3 - Square
            CShape newShape;

            switch (randS) {
                case 0:
                    newShape = new COval(random.nextInt(100)+1, random.nextInt(100)+1);
                    break;
                case 1:
                    newShape = new CCircle(random.nextInt(100)+1);
                    break;
                case 2:
                    newShape = new CRectangle(random.nextInt(100)+1, random.nextInt(100)+1);
                    break;
                case 3:
                    newShape = new CSquare(random.nextInt(100)+1);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + randS);
            }

            if (!shapes.contains(newShape)) {
                shapes.add(newShape);
            }
        }
    }

    /**
     * Method displays details about all shapes in the canvas
     */
    public void displayShapes() {
        System.out.println("Canvas has the following random shapes:");
        for (CShape shape : shapes) {
            System.out.println(shape.displayInfo());
        }
    }
}
