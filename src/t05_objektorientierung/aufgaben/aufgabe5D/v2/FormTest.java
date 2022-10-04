package t05_objektorientierung.aufgaben.aufgabe5D.v2;

import OCA.aufgaben.aufgabe05d_3d_forms.v2.prisma.Quader;
import OCA.aufgaben.aufgabe05d_3d_forms.v2.prisma.Würfel;
import OCA.aufgaben.aufgabe05d_3d_forms.v2.prisma.Zylinder;
import OCA.aufgaben.aufgabe05d_3d_forms.v2.pyramide.Kegel;
import OCA.aufgaben.aufgabe05d_3d_forms.v2.pyramide.QuadratischePyramide;
import OCA.aufgaben.aufgabe05d_3d_forms.v2.pyramide.ViereckPyramide;

public class FormTest {

  public static void main(String[] args) {

    // ========== Prismen ==========
    Form form = new Zylinder(45, 7);  // meter: m
    form.printInfo();

    form = new Quader(20, 10, 3);
    form.printInfo();

    form = new Würfel(5);
    form.printInfo();

    // ========== Pyramiden ==========

    form = new Kegel(5, 3);
    form.printInfo();

    form = new ViereckPyramide(10, 5, 3);
    form.printInfo();

    form = new QuadratischePyramide(5, 3);
    form.printInfo();




  }

}
