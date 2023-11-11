/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author Hogar
 */
public class Metodos {
public static int sumar(int a, int b){
    return a+b;
}
public static int resta(int c, int e){
    return c-e;
}
public static int divicion(int f, int g){
    return f/g;
}
public static int multiplicacion(int h, int i){
    return h*i;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado =Metodos.sumar(5,2);
        System.out.println("suma es:"+ resultado);
         int resul =Metodos.resta(5,2);
        System.out.println("resta es:" + resul);
         int resultadoos =Metodos.divicion(5,2);
        System.out.println("divicion es:"+ resultadoos);
         int resultadoss =Metodos.multiplicacion(5,2);
        System.out.println("multiplicacion  es:"+ resultadoss);
        
        // TODO code application logic here
    }
    
}
