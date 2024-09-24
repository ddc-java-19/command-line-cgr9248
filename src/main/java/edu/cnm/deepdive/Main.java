package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    boolean convertingFromCelsius = true;
    System.out.println("Converting from Celsius");
    TemperatureConverter converter = new TemperatureConverter();
    int i = 0;
    while (i < args.length) {
      String arg = args[i];
      switch (arg.toLowerCase().charAt(0)) {
        case 'c' -> {
          convertingFromCelsius = true;
          System.out.println("Switching to convert from Celsius");
        }
        case 'f' -> {
          convertingFromCelsius = false;
          System.out.println("Switching to convert from Fahrenheit");
        }
        default -> {
          double input = Double.parseDouble(arg);
          double output =
              convertingFromCelsius ? converter.convertC2F(input) : converter.convertF2C(input);
          System.out.println(output);
        }
      }
      i++;
    }
  }
}
