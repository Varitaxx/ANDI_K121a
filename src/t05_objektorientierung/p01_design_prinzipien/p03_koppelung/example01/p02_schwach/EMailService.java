package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example01.p02_schwach;

public class EMailService {

  public void send() {
    step1();
    step2();
    // Eine Änderung im send()-Algorithmus bewirkt keine Änderung beim Client-Code
    // abc();
    step3();
  }

  private void abc() { }

  private void step1() {}
  private void step2() {}
  private void step3() {}
}
