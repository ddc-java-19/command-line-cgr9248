package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    for (String arg : args) {
      double c = Double.parseDouble(arg);
      double f = convertC2F(c);
      System.out.println(f);
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

}
