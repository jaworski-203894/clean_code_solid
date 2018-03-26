package pl.ttpsc.solid.ocp.usa.solution;

public class TexasSpeedLimit extends AmericanStateSpeedLimit {
    @Override
    public double maxSpeed() {
        return 60.0;
    }

    @Override
    public double calculateFineValue(double overSpeed) {
        return overSpeed * 15.52;
    }
}
