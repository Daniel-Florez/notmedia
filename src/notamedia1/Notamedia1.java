/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notamedia1;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Notamedia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double primnota;
        double segnota;
        double finalnota;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota del primer examen: ");
        primnota = sc.nextDouble();
        System.out.println("¿Qué nota desea? ");
        finalnota = sc.nextDouble();
        
        segnota = (finalnota - (primnota*0.4)) / 0.6;
        
        System.out.println("Para obtener un " +finalnota+ " necesita un " +segnota+ " en el segundo examen");
        
    }
    
}
