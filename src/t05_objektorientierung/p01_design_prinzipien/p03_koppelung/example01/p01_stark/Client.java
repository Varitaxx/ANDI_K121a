package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example01.p01_stark;

public class Client {

  public void test() {
    EMailService emailService = new EMailService();
    emailService.step1();
    emailService.step2();
    emailService.step3();
  }

}
