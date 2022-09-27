package t03_deklarationen.p07_interfaces;

public class Test {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Waschmaschine wm = new Waschmaschine();
    wm.start();
    System.out.println("============================================================");
    PC pc = new PC();
    pc.start();
    System.out.println("============================================================");
    Startable st;  // Variable vom Interface-Typ
    // Ein Interface kann nicht instanziiert werden
    //st = new Startable(); // COMPILER-FEHLER
    st = new Waschmaschine(); // Eine Waschmaschine "IST" Startable (implements Startable)
    st.start();
    System.out.println("============================================================");
    st = new PC();            // Ein PC "IST" Startable (implements Startable)
    st.start();
    System.out.println("============================================================");
  }
  
  
  
}
