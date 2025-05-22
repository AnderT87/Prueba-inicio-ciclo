/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.anderayovi20250522;

/**
 *
 * @author SO-LAB-PC6
 */
public class consultaVeterinaria {
  
    String nombre;
    int edad;
    String fecha;
    String Motivo;
     public consultaVeterinaria(String nombre,int edad,String fecha){
         this.nombre = nombre;
         this.edad = edad;
         this.fecha = fecha;
     }
    public String Motivo(){
        Motivo = "Viene a consulta por que se quebro la dentadura";
    }return "Motivo;
     public void Registro (){
         System.out.println("Se atendio el dia "+ fecha);
         System.out.println("El motivo de la consulta es: "+ Motivo);
     }
}
