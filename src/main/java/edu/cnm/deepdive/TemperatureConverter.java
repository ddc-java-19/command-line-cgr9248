package edu.cnm.deepdive;

public class TemperatureConverter {

  public double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }
}
