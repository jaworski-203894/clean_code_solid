package pl.ttpsc.solid.dip.weathertracker.solution;

public class WeatherInformation {
    private double temperature;
    private double cloudy;
    private double windSpeed;

    public WeatherInformation(double temperature, double cloudy, double windSpeed) {
        this.temperature = temperature;
        this.cloudy = cloudy;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCloudy() {
        return cloudy;
    }

    public void setCloudy(double cloudy) {
        this.cloudy = cloudy;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
