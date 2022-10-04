package t05_objektorientierung.aufgaben.aufgabe5D.v2.pyramide;

import t05_objektorientierung.aufgaben.aufgabe5D.v2.Form;

public abstract class Pyramide implements Form {

  private double höhe;
  
  public Pyramide(double höhe) {
    super();
    this.höhe = höhe;
  }

	public double getHöhe() {
    return höhe;
  }
  public void setHöhe(double höhe) {
    this.höhe = höhe;
  }

  public abstract double getGrundfläche();
  public abstract double getMantelfläche();

  @Override
  public double getOberfläche() {
		return getMantelfläche() + getGrundfläche();
	}

  @Override
	public double getVolumen() {
		return getGrundfläche() * höhe / 3;
	}

  @Override
  public void printSuperFormInfo() {
    System.out.println("Grundfläche    : " + getGrundfläche());
    System.out.println("Mantelfläche   : " + getMantelfläche()); // Einziger Unterschied zu Quader
  }
}
