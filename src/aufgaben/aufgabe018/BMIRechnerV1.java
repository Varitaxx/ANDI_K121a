package aufgaben.aufgabe018;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BMIRechnerV1 {

  public static void main(String[] args) {
    // ===========================================================================================
    //                                    Benutzereingabe (mit Scanner)
    // ===========================================================================================
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Geben Sie Ihr Gewicht in kg ein: ");
    int gewicht = myScanner.nextInt();
    System.out.println("Geben Sie Ihre Körpergröße in cm ein: ");
    int größe = myScanner.nextInt();
    // ===========================================================================================
    //    int gewicht = 120; // in kg
    //    int größe = 180;   // in cm
    // ===========================================================================================
    
    double bmi = gewicht * 10_000.0 / (größe * größe);
    System.out.println("BMI:  " + bmi);

    // Fallunterscheidung und passender medizinischer Ratschlag
    
    if (bmi >= 40)  
      System.out.println("Adipositas Grad III");
    else if (bmi >= 35)      
      System.out.println("Adipositas Grad II");
    else if (bmi >= 30)      
      System.out.println("Adipositas Grad I");
    else if (bmi >= 25)      
      System.out.println("Übergewicht");
    else if (bmi >= 20)      
      System.out.println("Normalgewicht");
    else    
      System.out.println("Untergewicht");
  }

}
