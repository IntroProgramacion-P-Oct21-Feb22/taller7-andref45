/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


/**
 *
 * @author andreflores
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //2 6 12 20 30 42 56 72 90 110
    int n = 2;
    int contador = 1;
    String cadena = ""; 
    int var = 2;
    System.out.printf("%s ", n);
    while (contador <=9){
        var = var + 2;
        n = n + var; 
        contador = contador + 1;
        
        cadena = String.format("%s%s ", cadena,n);
        
    }
    System.out.println(cadena);
            
    }
    
}
