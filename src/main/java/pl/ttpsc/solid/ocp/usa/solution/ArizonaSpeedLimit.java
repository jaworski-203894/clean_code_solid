package pl.ttpsc.solid.ocp.usa.solution;

public class ArizonaSpeedLimit extends AmericanStateSpeedLimit {
    @Override
    public double maxSpeed() {
        return 40.0;
    }

    @Override
    public double calculateFineValue(double overSpeed) {
        return overSpeed * 12.55;
    }
}
