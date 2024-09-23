package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      double c = Double.parseDouble(arg);
      double f = convertC2F(c);
      System.out.println(f);
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

}
