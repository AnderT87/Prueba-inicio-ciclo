/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.anderayovi20250522;

import java.util.Scanner;
public class AnderAyovi20250522 {

    public static void main(String[] args) {
        consultaVeterinaria objConsulta = new consultaVeterinaria("Diablo",6,"2025/02/01");
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Su mascota es:");
         System.out.println("1.Un Perro");
         System.out.println("2.Un Gato");
         System.out.println("3.Un Ave");
         opcion = sc.nextInt();
    }
}
