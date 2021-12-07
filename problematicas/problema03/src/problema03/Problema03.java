/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author andreflores
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //2 5 10 17 26 37
    int n = 2;
    int contador = 1;
    String cadena = ""; 
    int contador2 = 3;
    System.out.printf("%s ",n);
    do { 
        n = n + contador2;
        contador2 = contador2 + 2;
        contador = contador + 1;
        
        cadena = String.format("%s%s ", cadena, n);        
    } while (contador <=5);
    System.out.println(cadena);
    }
    
}
