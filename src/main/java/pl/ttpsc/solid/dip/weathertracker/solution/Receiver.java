package pl.ttpsc.solid.dip.weathertracker.solution;

public interface Receiver {
    void receive(WeatherInformation weatherInformation);
    void show();
}
