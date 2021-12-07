/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author andreflores
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int numerador = 1;
    int denominador = 3;
    String cadena = "";
    int contador = 1;
    String signo1 = "+";
    String signo2 = "-";
    String signo = "";
    System.out.printf("%s ", numerador);
    do{
        //numerador = numerador * -1;
        contador = contador + 1;
        if (denominador == 5 || denominador == 9 || denominador == 13){
            signo = signo1;
        }else{ 
            signo = signo2;
        }
        cadena = String.format("%s%s%s/%s ", cadena, signo, numerador, 
                denominador);
        denominador = denominador + 2;
    } while (contador <=7);
    System.out.println(cadena);
    }        
    }
    

