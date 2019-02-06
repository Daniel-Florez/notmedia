/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notamedia;
Scanner sc = new Scanner(System.in);

import java.util.Scanner;

/*
 * @author Usuario DAM 1
 */
public class Notamedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int notas;
        int suma = 0;
        int prom = 0;

        System.out.print("Ingrese la nota del primer examen:");
        notas = leer.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("ingrese nota" + " " + i + " " + "de" + " " + notas + ":");
            int notasegundo = leer.nextInt();
            suma = suma + nota;
        }
        prom = suma / notas;
        System.out.println("promedio de las notas:" + prom);
    }

}
