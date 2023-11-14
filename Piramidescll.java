/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramides;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Piramides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cll = new Scanner(System.in);
        System.out.println("Eliga la opcion");
        System.out.println("Opc 1: de Asteriscos");
        System.out.println("Opc 2:  de Letras");
        int piramide = cll.nextInt();

        System.out.println("ingrese las filas que desea ver");
        int filas = cll.nextInt();

        int letra = 55;
        int numero = 0;

        switch (piramide) {
            case 1:

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                break;
            case 2:

                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            System.out.print((char) letra + " ");
                            letra++;
                            if (letra > 9) {
                                numero = 1;
                            }
                        } else {
                            System.out.print(numero + " ");
                            numero++;
                        }

                    }
                    System.out.println();
                }
                break;
                
                default:
                System.out.println("opcion invalida");
                
        }
        }

    }
