package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    boolean convertingFromCelsius = true;
    System.out.println("Converting from Celsius");
    for (String arg : args) {
      char selector = arg.toLowerCase().charAt(0);
      if (selector == 'c') {
        convertingFromCelsius = true;
        System.out.println("Switching to convert from Celsius");
      } else if (selector == 'f') {
        convertingFromCelsius = false;
        System.out.println("Switching to convert from Fahrenheit");
      } else {
        double input = Double.parseDouble(arg);
        double output;
        if (convertingFromCelsius) {
          output = convertC2F(input);
        } else {
          output = convertF2C(input);
        }
        System.out.println(output);
      }
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
}
