package t05_objektorientierung.aufgaben.Aufgabe5B.teil1;

public class PC {
  private String bezeichnung;
  private double prozessorGeschwindigkeit; // 2.5 GHz
  private int ram; // 16 GB (Arbeitsspeicher)
  private int festplattengröße; // 500 GB

  public PC() {

  }

  public PC(String bezeichnung, double prozessorGeschwindigkeit, int ram, int festplattengröße) {
    this.bezeichnung = bezeichnung;
    this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
    this.ram = ram;
    this.festplattengröße = festplattengröße;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public double getProzessorGeschwindigkeit() {
    return prozessorGeschwindigkeit;
  }

  public void setProzessorGeschwindigkeit(double prozessorGeschwindigkeit) {
    this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getFestplattengröße() {
    return festplattengröße;
  }

  public void setFestplattengröße(int festplattengröße) {
    this.festplattengröße = festplattengröße;
  }

  public String toString() {
    return String.format("%s - %f - %d - %d", bezeichnung, prozessorGeschwindigkeit, ram, festplattengröße);
  }
  
  // ===============================================================================
  public void starten() {
    System.out.println("[" + bezeichnung + "] wird gestartet ...");
  }

  public void runterfahren() {
    System.out.println("[" + bezeichnung + "] wird runtergefahren ...");
  }

  public void inSchlafModusGehen() {
    System.out.println("[" + bezeichnung + "] geht in den Schlafmodus über ...");
  }
  // ===============================================================================

  public void printData() {
    System.out.println("===============================================================");
    System.out.println("                     " + bezeichnung);
    System.out.println("===============================================================");
    System.out.println("Prozessor       : " + prozessorGeschwindigkeit + " GHz");
    System.out.println("Arbeitspeicher  : " + ram + " GB");
    System.out.println("Festplattengröße: " + festplattengröße + " GB");
  }

}
