package t03_datentypen.p06_string.p04_constant_pool;


public class PoolTest {

  public static void main(String[] args) {
    String s1 = "abc"; // Wird im Konstanten-Pool angelegt
    String s2 = "abc"; // Das vorhandene Literal im Kontanten-Pool wird benutzt
  
    System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1)); // Speicheradresse von s1
    System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2)); // Speicheradresse von s2
  
    //                  ======================>
    System.out.println("s1 == s2: " +   ( s1 == s2 )  ); // true
  }

}
