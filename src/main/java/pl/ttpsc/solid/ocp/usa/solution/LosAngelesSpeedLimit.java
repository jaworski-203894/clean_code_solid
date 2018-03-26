package pl.ttpsc.solid.ocp.usa.solution;

public class LosAngelesSpeedLimit extends AmericanStateSpeedLimit {

    @Override
    public double maxSpeed() {
        return 50.0;
    }

    @Override
    public double calculateFineValue(double overSpeed) {
        return overSpeed * 100.0;
    }
}
