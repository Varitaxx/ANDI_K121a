package t05_objektorientierung.p06_abstract_final.p01_abstract;

public abstract class Tier {
  public abstract void sound(); // No Body (No Implementation for this method)
}
// => new Tier() nicht möglich
// #############################################

class Katze extends Tier {
  @Override
  public void sound() {
    System.out.println("Miao");
  }
}
