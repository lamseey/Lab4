package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        // Convert Celsius to Fahrenheit
        return temperatureCelsius * 9 / 5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        // Return formatted summary
        return String.format("Current weather: %.1fºC (%.1fºF) and %s",
                             temperatureCelsius,
                             temperatureFahrenheit(),
                             conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        // Convert Fahrenheit to Celsius
        double tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        // Create WeatherData instance using Celsius
        WeatherData todayWeather = new WeatherData(25.0, "Sunny");
        System.out.println("Today's weather: " + todayWeather.getSummary());
        WeatherData yesterdayWeather = WeatherData.fromFahrenheit(50.0, "Cloudy");
        System.out.println("Yesterday's weather: " + yesterdayWeather.getSummary());

    }
}
