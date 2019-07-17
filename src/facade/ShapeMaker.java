package facade;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/17 16:43
 */
public class ShapeMaker {
    private Shape rectangle = new Rectangle();
    private Shape square = new Square();
    private Shape circle = new Circle();

    public void DrawShape(){
        System.out.println("Now let's draw some shape...");
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
