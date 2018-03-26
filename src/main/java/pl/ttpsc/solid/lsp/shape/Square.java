package pl.ttpsc.solid.lsp.shape;

public class Square implements Shape {

    double sideLenght;

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public Square(double sideLenght) {

        this.sideLenght = sideLenght;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideLenght * sideLenght;
    }

    @Override
    public double calculateCircuit() {
        return 4 * sideLenght;
    }
}
