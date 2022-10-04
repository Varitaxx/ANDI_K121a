package t05_objektorientierung.aufgaben.aufgabe5D.v1.pyramide;

import OCA.aufgaben.aufgabe05d_3d_forms.v1.Form;

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

}
