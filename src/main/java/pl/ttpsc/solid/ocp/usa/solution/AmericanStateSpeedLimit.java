package pl.ttpsc.solid.ocp.usa.solution;

public abstract class AmericanStateSpeedLimit  {
    public abstract double maxSpeed();
    public abstract double calculateFineValue(double overSpeed);

    double calculateSpeedLimitFine(double speed) {
        if (speed > maxSpeed()) {
            return calculateFineValue(speed - maxSpeed());
        } else {
            return 0.0;
        }
    }
}
