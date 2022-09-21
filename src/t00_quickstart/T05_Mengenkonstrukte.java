package t00_quickstart;

import java.util.ArrayList;

public class T05_Mengenkonstrukte {
  public static void main(String[] args) {
    System.out.println("################################################");
//    arrayTest1();
//    arrayTest2();
    listTest();
    System.out.println("################################################");
  }

  public static void arrayTest1() {
    //              0   1  2  3    4
    int[] zahlen = {12, 3, 5, 67, 89};
    System.out.println("zahlen: " + zahlen);       // [I@330bedb4
    System.out.println("zahlen[0]: " + zahlen[0]); // 12
    System.out.println("zahlen[1]: " + zahlen[1]); // 3
  }

  public static void arrayTest2() {
    //                   0        1        2
    String[] names = {"Peter", "Hans", "Thomas"};
    System.out.println("names[0]: " + names[0]); // Peter
    System.out.println("names[2]: " + names[2]); // Thomas
  }


  public static void listTest() {
    ArrayList names = new ArrayList();                // Elemente beliebiger Typen
// ArrayList<String> names = new ArrayList<String>(); // Elemente vom Typ "String"
    names.add("Peter");  // index = 0
    names.add("Hans");   // index = 1
    names.add("Thomas"); // index = 2
    System.out.println("names: " + names);  // [Peter, Hans, Thomas]
    System.out.println("names.get(0): " + names.get(0)); // Peter
    System.out.println("names.get(2): " + names.get(2)); // Thomas
    String x = (String) names.get(1);
  }
}
