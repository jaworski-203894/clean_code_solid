package pl.ttpsc.solid.lsp.shape;

public class Rectangle implements Shape {
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double height;
    double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateSurfaceArea() {
        return width * height;
    }

    @Override
    public double calculateCircuit() {
        return 2 * (width + height);
    }
}
