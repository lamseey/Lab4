package main.java.recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        //
        return 0.0;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        //
        return "";
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       //
        return null;
    }

    public static void main(String[] args) {

    }
}
