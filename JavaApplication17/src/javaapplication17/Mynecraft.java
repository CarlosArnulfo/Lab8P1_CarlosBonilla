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
    int lingoteHierro = 0;
    int palos = 0;
    int diamante = 0;
    int vida = 0;

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0: Salir");
        System.out.println("1: Sumar 1 lingote de hierro");
        System.out.println("2: Sumar 1 diamante");
        System.out.println("3: Sumar 1 Palo");
        System.out.println("4. agregar 1 pico de hierro");
        System.out.println("5. agregar 1 pico de diamante");
        System.out.println("6. mejorar pico de hierro");
        System.out.println("7. Listar picos");
        System.out.println("8. Agregar bloques");
        System.out.println("9. Romper bloques");
        int menu = sc.nextInt();
        do {
            switch (menu) {
                case (0):
                    System.out.println("Saliendo del juego");
                    break;
                case (1):
                    lingoteHierro += 1;
                    System.out.println("tiene " + lingoteHierro + " lingotes de hierro");
                    break;
                case (2):
                    diamante += 1;
                    System.out.println("tiene " + diamante + " diamantes");
                    break;
                case (3):
                    palos += 1;
                    System.out.println("tiene " + palos + " palos");
                    break;
                case (4):
                    if ((lingoteHierro >= 3) && (palos >= 2)) {
                        vida = 8;
                        Pico picoHierro = new Pico("hierro", vida);
                        picos.add(picoHierro);
                    } else {
                        if (lingoteHierro < 3) {
                            System.out.println("te hacen falta(n) " + (3 - diamante) + " lingotes de hierro");
                        }
                        if (palos < 2) {
                            System.out.println("te falta(n) " + (2 - palos) + " palos");
                        }
                    }
                    break;
                case (5):
                    vida = 14;
                    if ((diamante >= 3) && (palos >= 2)) {
                        diamante = (diamante - 3);
                        palos = (palos - 2);
                        Pico picoDiamante = new Pico("diamante", vida);
                        picos.add(picoDiamante);
                    } else {
                        if (diamante < 3) {
                            System.out.println("te hacen falta(n) " + (3 - diamante) + " diamantes");
                        }
                        if (palos < 2) {
                            System.out.println("te falta(n) " + (2 - palos) + " palos");
                        }
                    }
                    break;
                case (6):
                    int tamanoListaPicos = picos.size();
                    boolean hayPicos = false;
                    if ((lingoteHierro >= 1) && (diamante >= 3)) {
                        for (int i = 0; i < tamanoListaPicos; i++) {
                            if (picos.get(i).tipo.equals("hierro")) {
                                hayPicos = true;
                                lingoteHierro = (lingoteHierro - 1);
                                diamante = (diamante - 3);
                                picos.get(i).changeTipo("diamante");
                                picos.get(i).changeVida(14);
                                break;
                            }
                            if (hayPicos = false) {
                                System.out.println("no hay picos de hierro para mejorar");
                            }
                        }
                    } else {
                        break;
                    }
                case (7):
                    int tamanoLista = picos.size();
                    for (int i = 0; i < tamanoLista; i++) {
                        System.out.println(i + ". Pico de " + picos.get(i).tipo + ", " + picos.get(i).vida + " de vida");
                    }
                    break;
                case (8):
                    int menuPicos = 0;
                    System.out.println("¿que tipo de bloque desea agregar?");
                    System.out.println("0: Agregar bloque de obsidiana");
                    System.out.println("1: Agregar bloque de oro");
                    System.out.println("2: Agregar bloque de carbon");
                    menuPicos = sc.nextInt();
                    do {
                        switch (menuPicos) {

                            case 0:
                                bloques.add("obsidiana");
                                System.out.println("se a añadido un bloque de obsidiana al inventario");
                                break;
                            case 1:
                                bloques.add("oro");
                                System.out.println("se a añadido un bloque de oro al inventario");
                                break;
                            case 2:
                                bloques.add("carbon");
                                System.out.println("se a añadido un bloque de carbon al inventario");
                                break;
                            default:
                                System.out.println("ese numero no pertenece a ningun bloque");

                        }
                    } while ((menuPicos < 0) && (menuPicos > 2));

                    break;
                case (9):
                    int picoAUsar = 0;
                    int bloqueARomper = 0;
                    int vidaRestada = 0;
                    int bloquesLista = bloques.size();
                    int picosLista = picos.size();
                    if ((picosLista >= 1) && (bloquesLista >= 1)) {
                        System.out.println("elija su bloque para romper");
                        for (int i = 0; i < bloquesLista; i++) {
                            System.out.println(i + ". bloque de " + bloques.get(i));
                        }
                        bloqueARomper=sc.nextInt();
                        for (int i = 0; i < picosLista; i++) {
                            System.out.println(i + ". pico de " + picos.get(i));
                        }
                        picoAUsar=sc.nextInt();
                        if (bloques.get(bloqueARomper).equals("obsidiana"));
                        
                        
                    }
                    break;
                case (10):
                    int tamanoBloques = bloques.size();
                    System.out.println("Sus bloques son");
                    for (int i = 0; i < tamanoBloques; i++) {
                        System.out.println(i + ". bloque de " + bloques.get(i));
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println("0: Salir");
            System.out.println("1: Sumar 1 lingote de hierro");
            System.out.println("2: Sumar 1 diamante");
            System.out.println("3: Sumar 1 Palo");
            System.out.println("4. agregar 1 pico de hierro");
            System.out.println("5. agregar 1 pico de diamante");
            System.out.println("6. mejorar pico de hierro");
            System.out.println("7. Listar picos");
            System.out.println("8. Agregar bloques");
            System.out.println("9. Romper bloques");
            menu = sc.nextInt();
        } while (menu != 0);
        System.out.println("Gracias por Jugar");
    }
}
