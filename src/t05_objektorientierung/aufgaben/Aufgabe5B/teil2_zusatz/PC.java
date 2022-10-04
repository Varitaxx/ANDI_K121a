package t05_objektorientierung.aufgaben.Aufgabe5B.teil2_zusatz;

public class PC {

  private String bezeichnung;
  private double prozessorGeschwindigkeit; // 2.5 GHz
  private int ram; // 16 GB (Arbeitsspeicher)
  private int festplattengröße; // 500 GB
  // Jeder PC hat einen Zustand => HAS Relationship => Instanzvariable
  // Wertebereich ist übersichtlich: NUR 3 mögliche Werte => enum !!!
  private Zustand zustand = Zustand.AUS; // AN, AUS, SCHLAFMODUS

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

  public Zustand getZustand() {
    return zustand;
  }

  // Setter-Methode nicht passend, da der Zustand des PCs über start(), runterfahren() und inSchlafModus() gesetzt wird.
//  public void setZustand(Zustand zustand) {
//    this.zustand = zustand;
//  }

  public String toString() {
    return String.format("%s - %f - %d - %d", bezeichnung, prozessorGeschwindigkeit, ram, festplattengröße);
  }

  public void starten() {
    System.out.println("[" + bezeichnung + "] wird gestartet ...");
    zustand = Zustand.AN;
  }

  public void runterfahren() {
    System.out.println("[" + bezeichnung + "] wird runtergefahren ...");
    zustand = Zustand.AUS;
  }

  public void inSchlafModusGehen() {
    System.out.println("[" + bezeichnung + "] geht in den Schlafmodus über ...");
    zustand = Zustand.SCHLAFMODUS;
  }

  public void printData() {
    System.out.println("===============================================================");
    System.out.println("                     " + bezeichnung);
    System.out.println("===============================================================");
    System.out.println("Prozessor       : " + prozessorGeschwindigkeit + " GHz");
    System.out.println("Arbeitspeicher  : " + ram + " GB");
    System.out.println("Festplattengröße: " + festplattengröße + " GB");
    System.out.println("Zustand         : " + zustand);
  }

}
