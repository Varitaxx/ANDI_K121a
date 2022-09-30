package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example01.p02_schwach;

public class Client {

  public void test() {
    EMailService emailService = new EMailService();
//    emailService.step1(); // Fehler, da "private"
//    emailService.step2();
//    emailService.step3();
    emailService.send();
  }
  
}
