package t03_deklarationen.p08_enums.p02_example2;

import java.util.Arrays;

public class ColorTest {
  public static void main(String[] args) {
    Color[] colorValues = Color.values();
    System.out.println(Arrays.toString(colorValues));
  }
}
