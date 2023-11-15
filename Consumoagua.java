/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumoagua;

public class Consumoagua {

    public static void consumoPorCasa(int[][] casa) {

        for (int i = 0; i < casa.length; i++) {
            int suma = 0;
            for (int j = 0; j < casa[i].length; j++) {
                suma += casa[i][j];

            }
            System.out.println(suma);
               
        }

    }

    public static void aguaDia(int[][] agua) {
        for (int i = 0; i < agua[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < agua.length; j++) {
                suma += agua[j][i];

            }
            System.out.println("consumo por dia " + suma );
            
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] consumoagua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {6, 110, 72, 33, 40},};
          System.out.println("consumo por casa" );
       
        Consumoagua.consumoPorCasa(consumoagua);
        
        Consumoagua.aguaDia(consumoagua);
    }
    
    // TODO code application logic here
}
