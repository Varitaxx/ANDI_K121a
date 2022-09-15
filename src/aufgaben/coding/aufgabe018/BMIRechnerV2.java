package aufgaben.coding.aufgabe018;

import javax.swing.JOptionPane;

public class BMIRechnerV2 {

  public static void main(String[] args) {
    // ===========================================================================================
    //                                    Benutzereingabe (mit JOptionPane)
    // ===========================================================================================
    String gewichtEingabe = JOptionPane.showInputDialog("Geben Sie Ihr Gewicht in kg ein: ");
    String größeEingabe  =  JOptionPane.showInputDialog("Geben Sie Ihre Körpergröße in cm ein: ");
    // String -> int
    int gewicht = Integer.parseInt(gewichtEingabe);
    int größe = Integer.parseInt(größeEingabe);
    // ===========================================================================================
    //    int gewicht = 120; // in kg
    //    int größe = 180;   // in cm
    // ===========================================================================================
    
    double bmi = gewicht * 10_000.0 / (größe * größe);
    String msg = "Ihre BMI ist: " + bmi + "\n";

    // Fallunterscheidung und passender medizinischer Ratschlag
    if (bmi >= 40)  
      msg += "Adipositas Grad III";
    else if (bmi >= 35)      
      msg += "Adipositas Grad II";
    else if (bmi >= 30)      
      msg += "Adipositas Grad I";
    else if (bmi >= 25)      
      msg += "Übergewicht";
    else if (bmi >= 20)      
      msg += "Normalgewicht";
    else    
      msg += "Untergewicht";
    // Ausgabe mit JOptionPane
    JOptionPane.showMessageDialog(null, msg);
  }

}
