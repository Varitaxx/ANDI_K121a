package t01_grundlagen.p10_konstanten;

public class Konstanten {

  public static final int MWST = 19;

  public static void main(String[] args) {
    System.out.println("brutto(1000): " + brutto(1000));
    System.out.println("calculateArea(50): " + calculateArea(50));
  }

  public static double brutto(double netto) {
    return netto * (100 + MWST) / 100;
  }

  public static double calculateArea(double radius) {
    return Math.PI * (radius * radius);
  }



}
