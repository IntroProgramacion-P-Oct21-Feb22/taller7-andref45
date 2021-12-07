/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    
    String nombre;
    String posicion;
    String cad_edad = "";
    String cad_est = "";
    int edad;
    double prom_edad = 0;
    double estatura;
    double prom_est = 0;
    int contador = 0;
    String cadena = "";
    String salida;
    boolean bandera = true;
    double suma = 0; 
    double suma2 = 0;
    String cadena2 ="";
    do{
       System.out.println ("Ingrese su nombre y apellido");
       nombre = entrada.nextLine();
       
       System.out.println ("Ingrese su posición");
       posicion = entrada.nextLine();
       
       System.out.println ("Ingrese su edad");
       edad = entrada.nextInt();
       
       System.out.println ("Ingrese su estatura");
       estatura = entrada.nextDouble();
       
       entrada.nextLine();
       
       System.out.println("Ingrese si para salir del proceso");
       salida = entrada.nextLine();
       
       contador = contador + 1; 
       cadena = String.format("%s%s.%s -%s-, Edad %s, estatura %s\n", 
               cadena, 
               contador,
               nombre,
               posicion,
               edad,
               estatura);
        suma = suma + edad;
        suma2 = suma2 + estatura;
        prom_edad = suma/contador;
        prom_est = suma2/contador;
        cad_edad = String.format("%s %s",cad_edad, edad);
        cad_est = String.format("%s %s",cad_est, estatura);
       if("si".equals(salida)){
           bandera = false;
       }
       cadena2 = String.format("Listado de Edades %s Promedio de edades: %s "
                + "Promedio de estaturas: %.2f\n", cad_edad, 
                prom_edad, prom_est);
    }
    while(bandera);
        
    System.out.printf("%s", cadena);
    System.out.printf("%s", cadena2);
    }
    
}
