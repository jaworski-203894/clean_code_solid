package pl.ttpsc.solid.lsp.shape;

public class Circle implements Shape {
    double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.PI * radious;
    }

    @Override
    public double calculateCircuit() {
        return Math.PI * radious * radious;
    }
}
