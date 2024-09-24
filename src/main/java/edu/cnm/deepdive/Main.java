package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    boolean convertingFromCelsius = true;
    System.out.println("Converting from Celsius");
    TemperatureConverter converter = new TemperatureConverter();
    for (String arg : args) {
      switch (arg.toLowerCase().charAt(0)) {
        case 'c':
          convertingFromCelsius = true;
          System.out.println("Switching to convert from Celsius");
          break;
        case 'f':
          convertingFromCelsius = false;
          System.out.println("Switching to convert from Fahrenheit");
          break;
        default:
          double input = Double.parseDouble(arg);
          double output =
              convertingFromCelsius ? converter.convertC2F(input) : converter.convertF2C(input);
          System.out.println(output);
          break;
      }
    }
  }
}
