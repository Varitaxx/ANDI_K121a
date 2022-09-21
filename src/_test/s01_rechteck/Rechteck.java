package _test.s01_rechteck;

public class Rechteck {
  
  double länge;
  double breite;
  
  
  double umfang() {
    double erg = (länge + breite) * 2;
    return erg;
  }
  
  double fläche() {
    double erg = länge * breite;
    return erg;
  }
}
