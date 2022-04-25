/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Metodos {
    public static void mostrarMenu(){
   System.out.println("--------------------------"
                        + "\nOperació? (Indica el signe)");
                System.out.println("+ = sumar \n- = restar \n"
                        + "x = multiplicar \n/ = dividir \n = elevar primer num al segon num."
                        + "\n% = residu");

    }
    public static String pedirPrimerNumero(){
                Scanner sc = new Scanner(System.in);

        String numero1 ;       
        do {
                System.out.println("Calculadora Java"
                        + "\n-----------------------"
                        + "\nIntrodueix el primer numero. ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);
            return numero1;
    }
}
