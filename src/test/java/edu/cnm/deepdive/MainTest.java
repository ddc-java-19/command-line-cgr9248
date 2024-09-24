package edu.cnm.deepdive;

public class MainTest {

  private static final double[] celsiusTemperatures = {-40, 0, 10, 20, 30, 50, 100};
  private static final double [] fahrenheitTemperatures = {-40, 32, 50, 68, 86, 122, 212};
  private static final double TOLERANCE = 0.000_000_000_1;

  public static void main(String[] args) {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double fahrenheit = fahrenheitTemperatures[i];
      double diff = Math.abs(fahrenheit - Main.convertC2F(celsius));
      assert diff <= TOLERANCE;
      diff = Math.abs(celsius - Main.convertF2C(fahrenheit));
      assert diff <= TOLERANCE;
    }
  }
}
