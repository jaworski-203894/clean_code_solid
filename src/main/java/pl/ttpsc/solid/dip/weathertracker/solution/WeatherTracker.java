package pl.ttpsc.solid.dip.weathertracker.solution;

import java.util.LinkedList;
import java.util.List;

public class WeatherTracker {
    List<Receiver> receivers = new LinkedList<>();
    public boolean addReceiver(Receiver receiver) {
        return receivers.add(receiver);
    }
    public boolean removeReceiver(Receiver receiver) {
        return receivers.remove(receiver);
    }

    public void SendWheaterInformation(WeatherInformation weatherInformation) {
        receivers.forEach((receiver -> receiver.receive(weatherInformation)));
    }

}
