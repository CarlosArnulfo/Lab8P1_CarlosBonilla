/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lospe
 */
public class Mynecraft {

    ArrayList<Pico> picos = new ArrayList();
    ArrayList<String> bloques = new ArrayList();
    Scanner kobeni = new Scanner(System.in);
    int lingoteHierro=0;
    int palos=0;
    int diamante=0;
    int vida=0;
    
    public void play() {
        Scanner makima = new Scanner(System.in);
        System.out.println("Bienvenido/a a Mynecraft");
        System.out.println("0: Salir");
        System.out.println("1: Sumar 1 lingote de hierro");
        System.out.println("2: Sumar 1 diamante");
        System.out.println("3: Sumar 1 Palo");
        int menu = makima.nextInt();
        do {
            switch (menu) {
                case (0):
                    
                    break;
                case (1):
                    lingoteHierro+=1;
                    break;
                case (2):
                    diamante +=1;
                    break;
                case (3):
                    palos +=1;
                    break;
                case (4):
                    vida=8;
                    Pico picoHierro=new Pico("hierro",vida);
                    picos.add(picoHierro);
                    break;
                case (5):
                    vida=14;
                    Pico picoDiamante=new Pico("diamante",vida);
                    picos.add(picoDiamante);
                    break;
                case (6):

                    break;
                case (7):

                    break;
                case (8):

                    break;
                case (9):

                    break;
                case (10):

                    break;
                default:
            }
            System.out.println("REINICIANDO");
            System.out.println("1: Ejercicio 1");
            System.out.println("2: Ejercicio 2");
            System.out.println("3: Ejercicio 3");
            System.out.println("4: Salir");
            menu = makima.nextInt();
        } while (menu != 4);
        System.out.println("Saliendo del programa");
    }
}
