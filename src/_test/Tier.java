package _test;

// ===============================================================================
class Test {
  
  public static void main( String[] args ) {
    //new Tier(); // Fehler, wenn Tier abstrakt ist.
    Tier var = new Katze();
    //Katze var = new Katze();
    var.sound();
  }
}
// ===============================================================================
// abstract = nicht vollst. => Vervollständigung in Unterklassen erwartet
// final = keine Unterklassen möglich / Methode darf nicht überschrieben werden (in Unterklassen)
abstract class Tier {
  public abstract void sound();
}
// ===============================================================================
class Katze extends Tier {
  
  @Override
  public void sound() {
    System.out.println("Miao");
  }
  
}
// ===============================================================================
