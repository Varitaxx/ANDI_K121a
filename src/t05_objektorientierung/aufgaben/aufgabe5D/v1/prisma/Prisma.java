package t05_objektorientierung.aufgaben.aufgabe5D.v1.prisma;

import t05_objektorientierung.aufgaben.aufgabe5D.v1.Form;

// abstract => new Prisma()

public abstract class Prisma implements Form {
  
  private double höhe;
  
  public Prisma( double höhe ) {
    this.höhe = höhe;
  }
  
  public double getHöhe() {
    return höhe;
  }
  
  public void setHöhe( double höhe ) {
    this.höhe = höhe;
  }
  
  // abstrakte Methoden: Erzwingen die Unterklassen, diese Methoden zu überschreiben
  abstract double getGrundfläche();
  
  abstract double getUmfang();
  
  @Override
  public double getOberfläche() {
    return 2 * getGrundfläche() + getUmfang() * höhe;
  }
  
  @Override
  public double getVolumen() {
    return getGrundfläche() * höhe;
  }
  
  
}
