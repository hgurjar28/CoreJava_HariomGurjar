package Q4_DrawingApp;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        for(Shape draws : shapes){
            draws.draw();
        }
    }
}
