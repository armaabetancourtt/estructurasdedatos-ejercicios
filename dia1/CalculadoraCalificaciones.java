/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracalificaciones;

import java.util.Scanner;

/**
 *
 * @author abeta
 */
public class CalculadoraCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calif;
        
        do{
        System.out.println("Ingresa tu calificacion del (0 a 100):");
        calif = scanner.nextInt();
        
       
        if (calif >= 90 && calif <= 100) {
        System.out.println("Calificacion numerica: A");
        }else if (calif >= 80 && calif < 90) {
        System.out.println("Calificacion numerica: B");
        }else if (calif >= 70 && calif < 80) {
        System.out.println("Calificacion numerica: C");
         }else if (calif >= 60 && calif < 70) {
        System.out.println("Calificacion numerica: D");
        } else {
        System.out.println("Calificacion numerica: F");
        }
       
        } while (true);
    }
}
