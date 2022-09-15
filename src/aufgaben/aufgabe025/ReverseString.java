package aufgaben.aufgabe025;

public class ReverseString {
  
  public static void main( String[] args ) {
    // for( int i = 0 ; i < 10 ; i++ ) {
    //   System.out.println(i);
    // }
    String str = "Heute ist ein schöner Tag"; // 25 Zeichen: 0..24
    String result = reverse(str);
    // Alternative mit StringBuilder: eine Klasse in der JDK
    //String result = new StringBuilder(str).reverse().toString();
    System.out.println("Original String: " + str);
    System.out.println("Reverse String : " + result);
  }
  
  public static String reverse( String input ) {
    String output = "";
    // i              : 24 23 22  .. 0
    // input.charAt(i): g  a  T   .. H
    for( int i = input.length() - 1 ; i >= 0 ; i = i - 1 ) {
      output = output + input.charAt(i);
    }
    return output;
  }
  
}
