package _test;
class Test {
  
  public static void main( String[] args ) {
    //Tier meinTier = new Tier(); // COMPILER-FEHLER, da Tier "abstract" ist
    System.out.println("============================================================");
    Tier meinTier;
    meinTier = new Katze(); // meinTier => Katze-Objekt
    meinTier.sound();
    System.out.println("============================================================");
    meinTier = new Hund();  // meinTier => Hund-Objekt
    meinTier.sound();
    System.out.println("============================================================");
  }
}

// ===============================================================================
public abstract class Tier {
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
class Hund extends Tier {
  @Override
  public void sound() {
    System.out.println("Bao");
  }
}
// ===============================================================================
